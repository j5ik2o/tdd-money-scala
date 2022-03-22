package money._6_equality_for_all_redux

class Dollar(protected val amount: Int) extends Money {
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }
}
