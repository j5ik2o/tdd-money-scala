package money._08_makin_objects

class Dollar(override protected val amount: Int) extends Money(amount) {

  override def times(mul: Int): Money = {
    new Dollar(amount * mul)
  }

}
