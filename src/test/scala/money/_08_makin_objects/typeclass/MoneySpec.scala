package money._08_makin_objects.typeclass

import money._08_makin_objects.typeclass.Money.MoneyOps
import org.scalatest.freespec.AnyFreeSpec

/** 第6章 テスト不足に気づいたら
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
  * - *equalsの一般化*
  * - timesの一般化
  */
class MoneySpec extends AnyFreeSpec {

  "Money" - {
    "multiplication" in {
      val five = new Dollar(5)
      assert(five.times(2) == new Dollar(10))
      assert(five.times(3) == new Dollar(15))
    }
    "equality" in {
      assert(new Dollar(5) == new Dollar(5))
      assert(new Dollar(5) != new Dollar(6))
      assert(new Franc(5) == new Franc(5))
      assert(new Franc(5) != new Franc(6))
    }
    "francMultiplication" in {
      val five = new Franc(5)
      assert(five.times(2) == new Franc(10))
      assert(five.times(3) == new Franc(15))
    }
    "typeclass" in {
      def times[A: Money](m: A, mul: Int): A = {
        m.times(mul)
      }
      val dfive = new Dollar(5)
      assert(times(dfive, 2) == new Dollar(10))
      assert(times(dfive, 3) == new Dollar(15))
      val ffive = new Franc(5)
      assert(times(ffive, 2) == new Franc(10))
      assert(times(ffive, 3) == new Franc(15))
    }

  }
}
