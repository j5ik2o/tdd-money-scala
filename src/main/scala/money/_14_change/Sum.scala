package money._14_change

class Sum(val augend: Expression, val addend: Expression) extends Expression {

  override def reduce(bank: Bank, currency: String): Money = {
    val amount = augend.reduce(bank, currency).amount + addend.reduce(bank, currency).amount
    new Money(amount, currency)
  }

}
