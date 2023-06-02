package cl.ravenhill.hamcracio

class IntegralAdapter {
  private val hamster = new IntegralHamster

  def integrate(
      fn: Double => Double,
      from: Double,
      to: Double
  ): Double = hamster.hamham(fn, from, to)
}
