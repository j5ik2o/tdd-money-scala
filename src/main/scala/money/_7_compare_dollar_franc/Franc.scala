package money._7_compare_dollar_franc

class Franc(protected val amount: Int) extends Money {
  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }
}
