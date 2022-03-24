package money._2_degenerate_objects

class Dollar2(amnt: Int) {

  val amount: Int = amnt

  def times(mul: Int): Dollar2 = {
    new Dollar2(amount * mul)
  }

}
