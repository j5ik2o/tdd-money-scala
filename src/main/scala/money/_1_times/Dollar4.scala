package money._1_times

class Dollar4(_amount: Int) {
  var amount: Int = _amount
  def times(mul: Int): Unit = {
    amount *= mul
  }
}
