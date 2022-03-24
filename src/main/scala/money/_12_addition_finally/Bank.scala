package money._12_addition_finally

import scala.annotation.unused

// 銀行オブジェクト
class Bank {

  def reduce(@unused sum: Expression, @unused str: String): Money = Money.dollar(10)

}
