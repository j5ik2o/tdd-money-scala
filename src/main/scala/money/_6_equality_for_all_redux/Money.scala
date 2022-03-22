package money._6_equality_for_all_redux

trait Money {
  protected def amount: Int
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount
  }
}
