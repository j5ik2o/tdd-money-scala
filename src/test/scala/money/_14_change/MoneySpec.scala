package money._14_change

import org.scalatest.freespec.AnyFreeSpec

/** 第14章 学習用テストと回帰テスト
  *
  * - $5 + 10 CHF = $10 (レートが2:1の場合)
  * - *$5 + $5 = $10*
  * - _$5 * 2 = $10_
  * - _amountをprivateにする_
  * - _Dollarの副作用をどうする？_
  * - Moneyの丸め処理をどうする？
  * - _equals()_
  * - hashCode()
  * - 他のオブジェクトとの比較
  * - _5 CHF * 2 = 10 CHF_
  * - _DollarとFrancの重複_
  * - _equalsの一般化_
  * - _timesの一般化_
  * - _FrancとDollarを比較する_
  * - _通貨の概念_
  * - _testFrancMultiplicationを削除する？_
  */
class MoneySpec extends AnyFreeSpec {
  "Money" - {
    "multiplication" in {
      val five = Money.dollar(5)
      assert(five.times(2) == Money.dollar(10))
      assert(five.times(3) == Money.dollar(15))
    }
    "equality" in {
      assert(Money.dollar(5) == Money.dollar(5))
      assert(Money.dollar(5) != Money.dollar(6))
      assert(Money.franc(5) != Money.dollar(5))
    }
    "currency" - {
      assert(Money.dollar(1).currency == "USD")
      assert(Money.franc(1).currency == "CHF")
    }
    "simpleAddition" in {
      val five    = Money.dollar(5)
      val sum     = five.plus(five)
      val bank    = new Bank()
      val reduced = bank.reduce(sum, "USD")
      assert(reduced == Money.dollar(10))
    }
    "plusReturnsSum" in {
      val five   = Money.dollar(5)
      val result = five.plus(five)
      val sum    = result.asInstanceOf[Sum]
      assert(sum.augend == five)
      assert(sum.addend == five)
    }
    "reduceSum" in {
      val sum    = Sum(Money.dollar(3), Money.dollar(4))
      val bank   = new Bank()
      val result = bank.reduce(sum, "USD")
      assert(result == Money.dollar(7))
    }
    "reduceMoney" in {
      val bank   = new Bank()
      val result = bank.reduce(Money.dollar(1), "USD")
      assert(result == Money.dollar(1))
    }
    "reduceMoneyDifferentCurrency" in {
      val bank = new Bank()
      bank.addRate("CHF", "USD", 2)
      val result = bank.reduce(Money.franc(2), "USD")
      assert(result == Money.dollar(1))
    }
    "identityRate" in {
      assert(new Bank().rate("USD", "USD") == 1)
    }
  }
}
