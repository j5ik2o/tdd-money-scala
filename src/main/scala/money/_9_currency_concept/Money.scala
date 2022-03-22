package money._9_currency_concept

object Money {
  def dollar(amount: Int): Dollar = new Dollar(amount, "USD")
  def franc(amount: Int): Franc   = new Franc(amount, "CHF")
}

abstract class Money(amt: Int, cur: String) {
  protected def amount: Int = amt
  def currency: String      = cur
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }
  def times(mul: Int): Money
}
