package money._6_equality_for_all_redux

class Franc(protected val amount: Int) extends Money {
  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }
}
