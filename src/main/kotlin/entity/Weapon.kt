package entity

class Weapon(name: String, val damage: Int, maxUseAmount: Int) : Item(name, maxUseAmount) {
  private var useAmount: Int = 0

  fun useWeapon() {
    if(useAmount >= maxUseAmount) println("Ton arme c'est cassé, tu ne peux plus l'utiliser")
    else println("Tu as utilisé l'arme : $name")
  }
}