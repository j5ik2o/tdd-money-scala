package money._3_equality_for_all

class Dollar1(val amount: Int) {

  def times(mul: Int): Dollar1 = {
    new Dollar1(amount * mul)
  }

  override def equals(other: Any): Boolean = {
    true
  }

}
