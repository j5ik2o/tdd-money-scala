package money._6_extends_money

class Dollar(protected val amount: Int) extends Money {
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }
}
