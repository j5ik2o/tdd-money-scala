package money._07_apples_and_oranges

class Dollar(override protected val amount: Int) extends Money(amount) {

  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }

}
