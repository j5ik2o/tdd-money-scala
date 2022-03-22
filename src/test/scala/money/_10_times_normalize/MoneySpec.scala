package money._10_times_normalize

import org.scalatest.freespec.AnyFreeSpec

/** 第10章 テストに聞いてみる
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - _$5 * 2 = $10_
  * - _amountをprivateにする_
  * - _Dollarの副作用をどうする？_
  * - Moneyの丸め処理をどうする？
  * - _equals()_
  * - _hashCode()_
  * - 他のオブジェクトとの比較
  * - 5 CHF * 2 = 10 CHF
  * - _DollarとFrancの重複_
  * - _equalsの一般化_
  * - *timesの一般化*
  * - _FrancとDollarを比較する_
  * - _通貨の概念_
  */
class MoneySpec extends AnyFreeSpec {
  "times" - {
    "dollarMultiplication" in {
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
    "equals" in {
      assert(Money.dollar(5) == Money.dollar(5))
      assert(Money.dollar(5) != Money.dollar(6))
      assert(Money.franc(5) == Money.franc(5))
      assert(Money.franc(5) != Money.franc(6))
      assert(Money.franc(5) != Money.dollar(5))
    }
  }
}
