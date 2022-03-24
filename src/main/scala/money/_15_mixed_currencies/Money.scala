package money._15_mixed_currencies

object Money {

  def dollar(amount: Int): Money = new Money(amount, "USD")

  def franc(amount: Int): Money = new Money(amount, "CHF")

}

trait Expression {

  def plus(expression: Expression): Expression

  def reduce(bank: Bank, to: String): Money

}

class Money(val amount: Int, val currency: String) extends Expression {

  override def reduce(bank: Bank, to: String): Money = {
    val rate = bank.rate(currency, to)
    new Money(amount / rate, to)
  }

  override def plus(addend: Expression): Expression = new Sum(this, addend)

  def times(mul: Int): Money = new Money(amount * mul, currency)

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }

  override def toString = s"$amount $currency"
}
