package money._01_multi_currency_money

class Dollar4(amnt: Int) {

  var amount: Int = amnt // コンストラクタ引数を利用する

  def times(mul: Int): Unit = {
    amount *= mul // 引数を利用する
  }

}
