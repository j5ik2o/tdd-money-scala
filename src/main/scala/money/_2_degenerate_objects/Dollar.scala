package money._2_degenerate_objects

class Dollar(amnt: Int) {
  val amount: Int = amnt
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }
}
