package money._01_multi_currency_money

class Dollar4(amnt: Int) {
  var amount: Int = amnt
  def times(mul: Int): Unit = {
    amount *= mul
  }
}
