package entity

abstract class Item(val name: String, val maxUseAmount: Int){
  override fun toString(): String {
    return "Item(name='$name', maxUseAmount=$maxUseAmount)"
  }
}