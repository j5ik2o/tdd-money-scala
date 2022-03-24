package money._07_apples_and_oranges

abstract class Money(protected val amount: Int) {

  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    // 同じクラスであること
    amount == money.amount && getClass == money.getClass
  }

}
