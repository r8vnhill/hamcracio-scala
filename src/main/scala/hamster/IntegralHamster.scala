
package cl.ravenhill.hamcracio
package hamster

class IntegralHamster extends Hamster {
  override def hamham(name: String,
             fn: Double => Double,
             from: Double,
             to: Double): Double = {
    (to - from) * fn((to + from) / 2.0)
  }
}
