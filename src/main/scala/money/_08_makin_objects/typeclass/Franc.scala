package money._08_makin_objects.typeclass

class Franc(protected val amount: Int) {

  def map(f: Int => Int): Franc = {
    new Franc(f(amount))
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Franc]

  override def equals(other: Any): Boolean = other match {
    case that: Franc =>
      (that canEqual this) &&
        amount == that.amount
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(amount)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
