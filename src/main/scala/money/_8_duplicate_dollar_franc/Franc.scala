package money._8_duplicate_dollar_franc

class Franc(protected val amount: Int) extends Money {
  override def times(mul: Int): Money = {
    new Franc(amount * mul)
  }
}
