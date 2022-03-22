package money._3_equality_for_all

class Dollar2(val amount: Int) {
  def times(mul: Int): Dollar2 = {
    new Dollar2(amount * mul)
  }

  override def equals(other: Any): Boolean = {
    val dollar = other.asInstanceOf[Dollar2]
    amount == dollar.amount
  }

}
