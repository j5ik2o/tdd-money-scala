package money._12_addition_finally

object Money {

  def dollar(amount: Int): Money = new Money(amount, "USD")

  def franc(amount: Int): Money = new Money(amount, "CHF")

}

// 式
trait Expression {}

// 式を実装
class Money(protected val amount: Int, val currency: String) extends Expression {

  // 加算
  def plus(addend: Money): Expression = new Money(amount + addend.amount, currency)

  def times(mul: Int): Money = new Money(amount * mul, currency)

  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }

  override def toString = s"$amount $currency"
}
