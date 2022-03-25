package money._08_makin_objects.inheritance

class Franc(override protected val amount: Int) extends Money(amount) {

  override def times(mul: Int): Money = {
    new Franc(amount * mul)
  }

}
