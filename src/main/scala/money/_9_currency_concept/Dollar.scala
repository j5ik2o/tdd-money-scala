package money._9_currency_concept

class Dollar(amt: Int, cur: String) extends Money(amt, cur) {
  override def times(mul: Int): Money = {
    Money.dollar(amount * mul)
  }
}
