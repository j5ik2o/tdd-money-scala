package money._7_compare_dollar_franc

class Dollar(protected val amount: Int) extends Money {
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }
}
