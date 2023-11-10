package entity

class NonPlayableCharacter(name: String, health: Int, inventory: MutableList<Item> = ArrayList()) : Character(name, health, inventory) {
  override fun attack(weapon: Weapon) {
    println("$name t'attaques avec ${weapon.name}")
  }

}