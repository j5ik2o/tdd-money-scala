package money._13_make_it

class Sum(val augend: Money, val addend: Money) extends Expression {

  override def reduce(currency: String): Money = new Money(augend.amount + addend.amount, currency)

}
