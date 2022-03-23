package money._14_change

case class Sum(augend: Expression, addend: Expression) extends Expression {
  override def reduce(bank: Bank, currency: String): Money = {
    val amount = augend.reduce(bank, currency).amount + addend.reduce(bank, currency).amount
    new Money(amount, currency)
  }

  override def plus(expression: Expression): Expression = ???
}
