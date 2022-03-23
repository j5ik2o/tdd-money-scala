package money._13_make_it

class Bank {
  def reduce(source: Expression, currency: String): Money = {
    source.reduce(currency)
  }
}
