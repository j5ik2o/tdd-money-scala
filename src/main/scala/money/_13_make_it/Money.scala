package money._13_make_it

import scala.util.Try

object Money {

  def dollar(amount: Int): Money = new Money(amount, "USD")

  def franc(amount: Int): Money = new Money(amount, "CHF")

}

trait Expression {

  // 畳み込み
  def reduce(to: String): Money

}

class Money(val amount: Int, val currency: String) extends Expression {
  val r: Either[String, Int] = Try(1).toEither.left.map { case ex: Expression => "" }
  // 自分自身を畳み込んでも複製がかえる
  override def reduce(to: String): Money = new Money(amount, to)

  def plus(addend: Money): Expression = new Sum(this, addend)

  def times(mul: Int): Money = new Money(amount * mul, currency)

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }

  override def toString = s"$amount $currency"
}
