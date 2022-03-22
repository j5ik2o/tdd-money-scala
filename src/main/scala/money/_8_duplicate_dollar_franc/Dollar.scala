package money._8_duplicate_dollar_franc

class Dollar(protected val amount: Int) extends Money {
  override def times(mul: Int): Money = {
    new Dollar(amount * mul)
  }
}
