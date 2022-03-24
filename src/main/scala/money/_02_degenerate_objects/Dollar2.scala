package money._02_degenerate_objects

class Dollar2(amnt: Int) {

  val amount: Int = amnt // varからvalへ

  // 計算結果としてDollarを返すようにする
  def times(mul: Int): Dollar2 = {
    new Dollar2(amount * mul)
  }

}
