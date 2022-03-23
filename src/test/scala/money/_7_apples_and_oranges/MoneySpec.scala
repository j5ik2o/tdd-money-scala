package money._7_apples_and_oranges

import org.scalatest.freespec.AnyFreeSpec

/** 第7章 疑念をテストに翻訳する
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - _$5 * 2 = $10_
  * - _amountをprivateにする_
  * - _Dollarの副作用をどうする？_
  * - Moneyの丸め処理をどうする？
  * - _equals()_
  * - hashCode()
  * - 他のオブジェクトとの比較
  * - _5 CHF * 2 = 10 CHF_
  * - DollarとFrancの重複
  * - _equalsの一般化_
  * - timesの一般化
  * - *FrancとDollarを比較する*
  */
class MoneySpec extends AnyFreeSpec {
  "Money" - {
    "multiplication" in {
      val five = new Dollar(5)
      assert(five.times(2) == new Dollar(10))
      assert(five.times(3) == new Dollar(15))
    }
    "francMultiplication" - {
      val five = new Franc(5)
      assert(five.times(2) == new Franc(10))
      assert(five.times(3) == new Franc(15))
    }
    "equality" in {
      assert(new Dollar(5) == new Dollar(5))
      assert(new Dollar(5) != new Dollar(6))
      assert(new Franc(5) == new Franc(5))
      assert(new Franc(5) != new Franc(6))
      assert(new Franc(5) != new Dollar(5))
    }
  }
}
