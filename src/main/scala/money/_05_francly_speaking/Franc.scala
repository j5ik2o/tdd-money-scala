package money._5_francly_speaking

class Franc(private val amount: Int) {

  def times(mul: Int): Franc = {
    new Franc(amount * mul)
  }

  override def equals(other: Any): Boolean = {
    val franc = other.asInstanceOf[Franc]
    amount == franc.amount
  }

}
