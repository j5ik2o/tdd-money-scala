package money._3_equals

class Dollar1(val amount: Int) {

  def times(mul: Int): Dollar1 = {
    new Dollar1(amount * mul)
  }

  override def equals(other: Any): Boolean = {
    val dollar = other.asInstanceOf[Dollar1]
    amount == dollar.amount
  }

}
