package money._4_amount_private

import org.scalatest.freespec.AnyFreeSpec

/** 第4章 意図を語るテスト
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - _$5 * 2 = $10_
  * - *amountをprivateにする*
  * - _Dollarの副作用をどうする？_
  * - Moneyの丸め処理をどうする？
  * - _equals()_
  * - hashCode()
  */
class MoneySpec extends AnyFreeSpec {
  "Money" - {
    "dollarMultiplication" in {
      val five = new Dollar(5)
      assert(five.times(2) == new Dollar(10))
      assert(five.times(3) == new Dollar(15))
    }
    "equals" in {
      assert(new Dollar(5) == new Dollar(5))
      assert(new Dollar(5) != new Dollar(6))
    }
  }
}
