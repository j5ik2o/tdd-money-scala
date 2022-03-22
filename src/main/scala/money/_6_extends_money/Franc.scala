package money._6_extends_money

class Franc(protected val amount: Int) extends Money {
  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }
}
