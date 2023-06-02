
package cl.ravenhill.oop.patterns
package hamcracio

class IntegralHamster {
  def hamham(name: String,
             fn: Double => Double,
             from: Double,
             to: Double): Double = {
    (to - from) * fn((to + from) / 2.0)
  }
}
