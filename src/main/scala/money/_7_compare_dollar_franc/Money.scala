package money._7_compare_dollar_franc

trait Money {
  protected def amount: Int
  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }
}
