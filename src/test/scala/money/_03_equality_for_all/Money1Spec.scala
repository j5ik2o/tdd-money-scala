package money._03_equality_for_all

import org.scalatest.freespec.AnyFreeSpec

/** 第3章 三角測量
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - _$5 * 2 = $10_
  * - amountをprivateにする
  * - _Dollarの副作用をどうする？_
  * - Moneyの丸め処理をどうする？
  * - *equals()*
  * - hashCode()
  * - 他のオブジェクトとの等価性比較
  */
class Money1Spec extends AnyFreeSpec {
  "Money" - {
    "multiplication" in {
      val five     = new Dollar1(5)
      val product1 = five.times(2)
      assert(product1.amount == 10)
      val product2 = five.times(3)
      assert(product2.amount == 15)
    }
    "equality" in {
      assert(new Dollar1(5) == new Dollar1(5))
    }
  }
}
