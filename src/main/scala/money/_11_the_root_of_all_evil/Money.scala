package money._11_the_root_of_all_evil

object Money {
  def dollar(amount: Int): Money = new Money(amount, "USD")
  def franc(amount: Int): Money  = new Money(amount, "CHF")
}

class Money(amt: Int, cur: String) {
  protected def amount: Int = amt
  def currency: String      = cur
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }
  def times(mul: Int): Money = {
    new Money(amount * mul, currency)
  }

  override def toString = s"$amount $currency"
}
