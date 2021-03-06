package money._10_interesting_times

object Money {

  def dollar(amount: Int): Dollar = new Dollar(amount, "USD")

  def franc(amount: Int): Franc = new Franc(amount, "CHF")

}

// 実装クラスにする
class Money(protected val amount: Int, val currency: String) {

  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }

  // 実装も共通化
  def times(mul: Int): Money = {
    new Money(amount * mul, currency)
  }

  override def toString = s"$amount $currency"
}
