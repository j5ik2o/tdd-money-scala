package money._03_equality_for_all

class Dollar2(val amount: Int) {
  def times(mul: Int): Dollar2 = {
    new Dollar2(amount * mul)
  }

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val dollar = other.asInstanceOf[Dollar2]
    amount == dollar.amount
  }

// 以下のような実装がよい
//  def canEqual(other: Any): Boolean = other.isInstanceOf[Dollar2]
//  override def equals(other: Any): Boolean = other match {
//    case that: Dollar2 => (that canEqual this) && amount == that.amount
//    case _             => false
//  }

}
