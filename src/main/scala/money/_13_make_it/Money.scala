package money._13_make_it

object Money {
  def dollar(amount: Int): Money = new Money(amount, "USD")
  def franc(amount: Int): Money  = new Money(amount, "CHF")
}

trait Expression {
  def reduce(to: String): Money
}

class Money(val amount: Int, val currency: String) extends Expression {

  override def reduce(to: String): Money = new Money(amount, to)

  def plus(addend: Money): Expression = new Sum(this, addend)

  def times(mul: Int): Money = new Money(amount * mul, currency)

  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }

  override def toString = s"$amount $currency"
}
