package money._13_make_it

class Bank {
  def reduce(sum: Expression, currency: String): Money = {
    sum match {
      case m: Money => m
      case s: Sum   => s.reduce(currency)
      case _        => throw new Exception()
    }
  }
}
