package money._1_multi_currency_money

import org.scalatest.freespec.AnyFreeSpec

/** 第1章 仮実装
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - *$5 * 2 = $10*
  */
class Money2Spec extends AnyFreeSpec {
  "Money" - {
    "dollarMultiplication" in {
      val five = new Dollar2(5)
      five.times(2)
      assert(five.amount == 10)
    }
  }
}
