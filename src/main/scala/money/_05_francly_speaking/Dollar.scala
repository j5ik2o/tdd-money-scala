package money._05_francly_speaking

class Dollar(private val amount: Int) {

  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }

  override def equals(other: Any): Boolean = {
    val dollar = other.asInstanceOf[Dollar]
    amount == dollar.amount
  }

}
