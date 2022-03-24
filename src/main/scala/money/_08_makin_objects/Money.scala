package money._08_makin_objects

object Money {

  def dollar(amount: Int): Dollar = new Dollar(amount)

  def franc(amount: Int): Franc = new Franc(amount)

}

abstract class Money(protected val amount: Int) {

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }

  def times(mul: Int): Money

}
