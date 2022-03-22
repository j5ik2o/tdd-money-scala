package money._10_interesting_times

object Money {
  def dollar(amount: Int): Dollar = new Dollar(amount, "USD")
  def franc(amount: Int): Franc   = new Franc(amount, "CHF")
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
