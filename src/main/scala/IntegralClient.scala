package cl.ravenhill.hamcracio

import integral.IntegralFlyweight

class IntegralClient {
  private val flyweight = new IntegralFlyweight

  def integrate(
      name: String, fn: Double => Double, from: Double, to: Double
  ): String = {
    val result = flyweight.integrate(name, fn, from, to)
    s"\\int_{$from}^{$to} $name(x) dx = ${result}"
  }
}
