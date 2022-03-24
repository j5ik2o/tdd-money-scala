package money._9_times_were_livin_in

class Franc(amt: Int, cur: String) extends Money(amt, cur) {

  override def times(mul: Int): Money = {
    Money.franc(amount * mul)
  }

}
