package money._08_makin_objects.typeclass

trait Money[A] {
  def times(self: A, mul: Int): A
}

object Money {
  implicit class MoneyOps[A: Money](val self: A) {
    def times(mul: Int): A = {
      implicitly[Money[A]].times(self, mul)
    }
  }

  implicit object DollarInstance extends Money[Dollar] {
    override def times(self: Dollar, mul: Int): Dollar =
      self.map(_ * mul)
  }

  implicit object FrancInstance extends Money[Franc] {
    override def times(self: Franc, mul: Int): Franc =
      self.map(_ * mul)
  }
}
