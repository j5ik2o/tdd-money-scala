package money._15_mixed_currencies

import scala.collection.mutable

case class FromTo(from: String, to: String)

class Bank {
  private val rates = mutable.Map.empty[FromTo, Int]
  def reduce(source: Expression, currency: String): Money = {
    source.reduce(this, currency)
  }
  def addRate(from: String, to: String, rate: Int): Unit = {
    rates += (FromTo(from, to) -> rate)
  }

  def rate(from: String, to: String): Int = {
    if (from == to)
      1
    else
      rates(FromTo(from, to))
  }

}
