package money._1_multi_currency_money

class Dollar3(amnt: Int) {
  var amount: Int = _ // これはひどい…
  def times(mul: Int): Unit = {
    amount = 5 * 2
  }
}
