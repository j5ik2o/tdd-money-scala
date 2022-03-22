package money._7_apples_and_oranges

class Franc(protected val amount: Int) extends Money {
  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }
}
