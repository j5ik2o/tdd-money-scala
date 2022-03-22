package money._6_extends_money

trait Money {
  protected def amount: Int
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount
  }
}
