package money._11_the_root_of_all_evil

object Money {

  def dollar(amount: Int): Money = new Money(amount, "USD")

  def franc(amount: Int): Money = new Money(amount, "CHF")

}

class Money(protected val amount: Int, val currency: String) {

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }

  def times(mul: Int): Money = {
    new Money(amount * mul, currency)
  }

  override def toString = s"$amount $currency"
}
