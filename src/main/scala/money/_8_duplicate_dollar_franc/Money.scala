package money._8_duplicate_dollar_franc

object Money {
  def dollar(amount: Int): Dollar = new Dollar(amount)
  def franc(amount: Int): Franc   = new Franc(amount)
}

trait Money {
  protected def amount: Int
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }
  def times(mul: Int): Money
}
