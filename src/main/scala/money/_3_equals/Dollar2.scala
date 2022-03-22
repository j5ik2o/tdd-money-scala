package money._3_equals

class Dollar2(val amount: Int) {
  def times(mul: Int): Dollar2 = {
    new Dollar2(amount * mul)
  }

  override def equals(other: Any): Boolean = {
    val dollar = other.asInstanceOf[Dollar2]
    amount == dollar.amount
  }

}
