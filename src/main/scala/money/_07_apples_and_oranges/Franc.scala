package money._07_apples_and_oranges

class Franc(override protected val amount: Int) extends Money(amount) {

  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }

}
