package money._06_equality_for_all_redux

abstract class Money(protected val amount: Int) {

  // equalsの一般化
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount
  }

}
