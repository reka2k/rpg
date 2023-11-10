import entity.*
import java.util.ArrayList

fun main(){
  val itemList: MutableList<Item> = ArrayList()
  val weapon: Weapon = Weapon("PISTOLET", 42, 2)
  val potion: Potion = Potion("POTION")

  val playableCharacter: PlayableCharacter = PlayableCharacter("Joueur 1", 100)
  val nonPlayableCharacter: NonPlayableCharacter = NonPlayableCharacter("IA", 100)

  itemList.add(weapon)
  itemList.add(potion)

  playableCharacter.inventory.add(weapon)
  playableCharacter.inventory.add(potion)

  val game: Game = Game(60,3,3)
  game.initGame(itemList)

  println(playableCharacter)

}

