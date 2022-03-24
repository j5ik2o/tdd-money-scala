package money._02_degenerate_objects

class Dollar1(amnt: Int) {

  var amount: Int = amnt

  def times(mul: Int): Unit = {
    amount *= mul
  }

}
