package entity

abstract class Character (val name: String, var health: Int, val inventory: MutableList<Item>, ){
  private var hasGivenUp: Boolean = false;
  abstract fun attack(weapon: Weapon)
  fun defend() {
    println("$name se défend ; il prendra 2x moins de dégats au prochain tour")
  }
  fun useItem(item: Item) {
    if(inventory.contains(item)) println("$item utilisé")
    else println("Ton inventaire ne contient pas d'item : $item")
  }
  fun giveUp() {
    println("$name à abandonné")
    hasGivenUp = true
  }

  override fun toString(): String {
    return "Character(name='$name', health=$health, inventory=$inventory, hasGivenUp=$hasGivenUp)"
  }


}