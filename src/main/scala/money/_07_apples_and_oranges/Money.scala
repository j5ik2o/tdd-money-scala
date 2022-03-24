package money._07_apples_and_oranges

abstract class Money(protected val amount: Int) {

  // この実装は不適切。仮実装ならOK
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }

}
