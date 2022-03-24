package money._04_privacy

class Dollar(private val amount: Int) {
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val dollar = other.asInstanceOf[Dollar]
    amount == dollar.amount
  }

}
