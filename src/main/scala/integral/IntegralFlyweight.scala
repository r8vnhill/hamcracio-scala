package cl.ravenhill.hamcracio
package integral

import scala.collection.mutable

class IntegralFlyweight {
  private val calculator = new IntegralAdapter
  private val cache = mutable.Map.empty[Integral, Double]

  def integrate(
      name: String, fn: Double => Double, from: Double, to: Double
  ): Double = {
    val integral = new Integral(name, fn, from, to)
    cache.getOrElseUpdate(integral,
      calculator.integrate(fn, from, to))
  }
}
