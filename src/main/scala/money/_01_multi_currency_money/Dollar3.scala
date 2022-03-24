package money._01_multi_currency_money

import scala.annotation.unused

class Dollar3(@unused amnt: Int) {

  var amount: Int = _ // これはひどい…

  def times(@unused mul: Int): Unit = {
    amount = 5 * 2 // 計算式をメソッド内に移動する
  }

}
