package money._1_times

class Dollar3(_amount: Int) {
  var amount: Int = _ // これはひどい…
  def times(mul: Int): Unit = {
    amount = 5 * 2
  }
}
