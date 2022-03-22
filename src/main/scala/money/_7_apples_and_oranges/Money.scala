package money._7_apples_and_oranges

trait Money {
  protected def amount: Int
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }
}
