package money._9_currency_concept

class Franc(amt: Int, cur: String) extends Money(amt, cur) {
  override def times(mul: Int): Money = {
    Money.franc(amount * mul)
  }
}
