package money._13_make_it

case class Sum(augend: Money, addend: Money) extends Expression {
  override def reduce(currency: String): Money = new Money(augend.amount + addend.amount, currency)
}
