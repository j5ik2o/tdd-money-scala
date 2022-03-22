package money._8_makin_objects

class Dollar(protected val amount: Int) extends Money {
  override def times(mul: Int): Money = {
    new Dollar(amount * mul)
  }
}
