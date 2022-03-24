package money._06_equality_for_all_redux

class Franc(override protected val amount: Int) extends Money(amount) {
  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }
}
