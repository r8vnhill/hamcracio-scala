package cl.ravenhill.hamcracio
package hamster

import java.util.Objects

class HamsterProxy extends Hamster {
  private val hamster = new IntegralHamster
  private val cache = Map.empty[Integral, Double]

  override def hamham(
      name: String,
      fn: Double => Double,
      from: Double,
      to: Double
  ): Double = {
    val integral = new Integral(name, fn, from, to)
    cache.getOrElse(
      integral, {
        val result = hamster.hamham(name, fn, from, to)
        cache + (integral -> result)
        result
      }
    )
  }

  private class Integral(
      val name: String,
      val fn: Double => Double,
      val from: Double,
      val to: Double
  ) extends Equals {

    override def canEqual(that: Any): Boolean = that.isInstanceOf[Integral]

    override def equals(that: Any): Boolean = {
      if (canEqual(that)) {
        val other = that.asInstanceOf[Integral]
        name == other.name &&
        fn == other.fn &&
        from == other.from &&
        to == other.to
      } else {
        false
      }
    }

    override def hashCode(): Int = {
      Objects.hash(classOf[Integral], name, fn, from, to)
    }
  }
}
