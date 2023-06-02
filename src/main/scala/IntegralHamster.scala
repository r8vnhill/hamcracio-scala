
package cl.ravenhill.hamcracio

class IntegralHamster {
  def hamham(fn: Double => Double,
             from: Double,
             to: Double): Double = {
    (to - from) * fn((to + from) / 2.0)
  }
}
