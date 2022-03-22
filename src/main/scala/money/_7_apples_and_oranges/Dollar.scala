package money._7_apples_and_oranges

class Dollar(protected val amount: Int) extends Money {
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }
}
