package money._9_times_were_livin_in

class Dollar(amt: Int, cur: String) extends Money(amt, cur) {
  override def times(mul: Int): Money = {
    Money.dollar(amount * mul)
  }
}
