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
class MoneySpec extends AnyFreeSpec {
  "Money" - {
    "dollarMultiplication" in {
      val five     = new Dollar(5)
      val product1 = five.times(2)
      assert(product1.amount == 10)
      val product2 = five.times(3)
      assert(product2.amount == 15)
    }
  }
}
