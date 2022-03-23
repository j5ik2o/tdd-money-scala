package money._9_times_were_livin_in

import org.scalatest.freespec.AnyFreeSpec

/** 第9章 歩幅の調整
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
  * - _FrancとDollarを比較する_
  * - *通貨の概念*
  * - testFrancMultiplicationを削除する？
  */
class MoneySpec extends AnyFreeSpec {
  "Money" - {
    "multiplication" in {
      val five = Money.dollar(5)
      assert(five.times(2) == Money.dollar(10))
      assert(five.times(3) == Money.dollar(15))
    }
    "francMultiplication" - {
      val five = Money.franc(5)
      assert(five.times(2) == Money.franc(10))
      assert(five.times(3) == Money.franc(15))
    }
    "currency" - {
      assert(Money.dollar(1).currency == "USD")
    }
    "equality" in {
      assert(Money.dollar(5) == Money.dollar(5))
      assert(Money.dollar(5) != Money.dollar(6))
      assert(Money.franc(5) == Money.franc(5))
      assert(Money.franc(5) != Money.franc(6))
      assert(Money.franc(5) != Money.dollar(5))
    }
  }
}
