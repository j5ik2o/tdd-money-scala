package money._8_makin_objects

class Franc(protected val amount: Int) extends Money {
  override def times(mul: Int): Money = {
    new Franc(amount * mul)
  }
}
