package money._2_sideeffect

class Dollar(amnt: Int) {
  val amount: Int = amnt
  def times(mul: Int): Dollar = {
    new Dollar(amount * mul)
  }
}
