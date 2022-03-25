package money._08_makin_objects.typeclass

class Dollar(protected val amount: Int) {

  def map(f: Int => Int): Dollar = {
    new Dollar(f(amount))
  }

  def canEqual(other: Any): Boolean = other.isInstanceOf[Dollar]

  override def equals(other: Any): Boolean = other match {
    case that: Dollar =>
      (that canEqual this) &&
        amount == that.amount
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(amount)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }
}
