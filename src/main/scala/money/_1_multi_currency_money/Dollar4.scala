package money._1_multi_currency_money

class Dollar4(_amount: Int) {
  var amount: Int = _amount
  def times(mul: Int): Unit = {
    amount *= mul
  }
}
