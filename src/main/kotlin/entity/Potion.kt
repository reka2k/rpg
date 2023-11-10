package entity

class Potion(name: String, maxUseAmount: Int = 1) : Item(name, maxUseAmount) {
  private var useAmount: Int = 0

  // TODO: Do the damage buff / healing potions


  fun usePotion() {
    if(useAmount >= maxUseAmount) println("Ta potion est vide, tu ne peux plus l'utiliser")
    else println("Tu as utilisé la potion : $name")
  }
}