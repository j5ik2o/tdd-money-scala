package money._2_degenerate_objects

import org.scalatest.freespec.AnyFreeSpec

/** 第2章 明白な実装
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - _$5 * 2 = $10_
  * - amountをprivateにする
  * - *Dollarの副作用をどうする？*
  * - Moneyの丸め処理をどうする？
  */
class Money1Spec extends AnyFreeSpec {
  "Money" - {
    "multiplication" in {
      val five = new Dollar1(5)
      five.times(2)
      assert(five.amount == 10)
      five.times(3)
      // assert(five.amount == 15) // 失敗する
    }
  }
}
