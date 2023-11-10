import entity.*
import java.util.ArrayList

fun main(args: Array<String>) {
  //init les params par défaut
  val itemList: MutableList<Item> = ArrayList()
  val weapon: Weapon = Weapon("PISTOLET", 42, 2)
  val potion: Potion = Potion("POTION")
  itemList.add(weapon)
  itemList.add(potion)
  val game: Game = Game(60,3,3)
  game.initGame(itemList)
  val player = createCharacter(itemList)
  showMainMenu(itemList, player)

}

fun showMainMenu(itemList: MutableList<Item>, player: PlayableCharacter){
  println("1. Créer un personnage")
  println("2. Choisir les items")
  println("3. Afficher le profil")
  println("4. Lancer le jeu")
  println("6. Quitter")
  handleMainMenuChoice(itemList, player)
}

fun handleMainMenuChoice(itemList: MutableList<Item>, player: PlayableCharacter) {
  val choice = readln().toInt()
  when(choice){
    1 -> createCharacter(itemList)
    2 -> chooseItems(itemList, player)
    3 -> showProfile(player)
    4 -> launchGame()
    5 -> quitGame()
    else -> {
      println("Choix invalide")
      showMainMenu(itemList, player)
    }
  }
}

fun showProfile(player: PlayableCharacter) {
  println("Profil du joueur :")
  println("Nom : ${player.name}")
  println("Vie : ${player.health}")
  println("Inventaire : ${player.inventory}")
}

fun quitGame() {
  TODO("Not yet implemented")
}

fun launchGame() {
  TODO("Not yet implemented")
}

fun chooseItems(itemList: MutableList<Item>, player: PlayableCharacter) {
  while((player.inventory.size < 3)) {
    println("Choix des items - limité à 3")
    itemList.forEachIndexed { index, item ->
      println("$index. $item")
    }
    println("99. Arrêter de choisir des items")
    println("Choix : ")
    val input = readln()
    val choice: Int = if(input.isBlank()) 4
    else input.toInt()

    when (choice) {
      0 -> {
        println("Tu as choisi ${itemList[0]}")
        player.inventory.add(itemList[0])
        chooseItems(itemList, player)
      }

      1 -> {
        println("Tu as choisi ${itemList[1]}")
        player.inventory.add(itemList[1])
        chooseItems(itemList, player)
      }

      2 -> {
        println("Tu as choisi ${itemList[2]}")
        player.inventory.add(itemList[2])
        chooseItems(itemList, player)
      }

      4 -> {
        println("Tu as choisi d'arrêter de choisir des items")
        showMainMenu(itemList, player)
      }
      99 -> {
        break
      }

      else -> {
        println("Choix invalide")
        chooseItems(itemList, player)
      }
    }
    break
  }
showMainMenu(itemList, player)
}

fun createCharacter(itemList: MutableList<Item>): PlayableCharacter {
  println("Création du personnage")
  println("Nom du personnage : ")
  val name = readln()
  if(name.isBlank()) {
    println("Le nom du personnage ne peut pas être vide")
    createCharacter(itemList)
  }
  val playableCharacter: PlayableCharacter = PlayableCharacter(name, 100)
  println("Personnage créé : $playableCharacter")
  showMainMenu(itemList, playableCharacter)
  return playableCharacter
}
