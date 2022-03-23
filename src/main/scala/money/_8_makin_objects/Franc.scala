package money._8_makin_objects

class Franc(override protected val amount: Int) extends Money(amount) {
  override def times(mul: Int): Money = {
    new Franc(amount * mul)
  }
}
