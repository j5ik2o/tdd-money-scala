package money._11_the_root_of_all_evil

object Money {

  // 戻り値をMoneyに変更
  def dollar(amount: Int): Money = new Money(amount, "USD")

  // 戻り値をMoneyに変更
  def franc(amount: Int): Money = new Money(amount, "CHF")

}

// Dollar, Francを削除
class Money(protected val amount: Int, val currency: String) {

  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && currency == money.currency
  }

  def times(mul: Int): Money = {
    new Money(amount * mul, currency)
  }

  override def toString = s"$amount $currency"
}
