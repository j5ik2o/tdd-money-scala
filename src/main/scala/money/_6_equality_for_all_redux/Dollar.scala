package money._6_equality_for_all_redux

class Dollar(override protected val amount: Int) extends Money(amount) {
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }
}
