package entity

class PlayableCharacter(name: String, health: Int, inventory: MutableList<Item> = ArrayList()) : Character(name, health, inventory) {
  override fun attack(weapon: Weapon) {
    if(inventory.contains(weapon)) {
      weapon.useWeapon();
    } else {
      println("Tu n\'as pas ${weapon.name} dans ton inventaire")
    }
  }

}