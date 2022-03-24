package money._08_makin_objects

object Money {

  // 実装を隠すためのファクトリの準備
  def dollar(amount: Int): Dollar = new Dollar(amount)

  // 実装を隠すためのファクトリの準備
  def franc(amount: Int): Franc = new Franc(amount)

}

abstract class Money(protected val amount: Int) {

  override def equals(other: Any): Boolean = {
    val money = other.asInstanceOf[Money]
    amount == money.amount && getClass == money.getClass
  }

  // 抽象メソッドの導入
  def times(mul: Int): Money

}
