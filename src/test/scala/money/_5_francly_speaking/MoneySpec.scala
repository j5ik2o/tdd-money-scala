package money._5_francly_speaking

import org.scalatest.freespec.AnyFreeSpec

/** 第5章 原則をあえて破るとき
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - _$5 * 2 = $10_
  * - _amountをprivateにする_
  * - _Dollarの副作用をどうする？_
  * - Moneyの丸め処理をどうする？
  * - _equals()_
  * - hashCode()
  * - 他のオブジェクトとの比較
  * - *5 CHF * 2 = 10 CHF*
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
    }
  }
}
