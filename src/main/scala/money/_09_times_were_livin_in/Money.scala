package money._09_times_were_livin_in

object Money {

  def dollar(amount: Int): Dollar = new Dollar(amount, "USD")

  def franc(amount: Int): Franc = new Franc(amount, "CHF")

}

abstract class Money(protected val amount: Int, val currency: String) {

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }

  def times(mul: Int): Money

}
