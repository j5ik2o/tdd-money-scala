package money._05_francly_speaking

class Franc(private val amount: Int) {

  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val franc = other.asInstanceOf[Franc]
    amount == franc.amount
  }

}
