
package cl.ravenhill.hamcracio
package hamster

trait Hamster {
  def hamham(name: String,
             fn: Double => Double,
             from: Double,
             to: Double): Double
}
