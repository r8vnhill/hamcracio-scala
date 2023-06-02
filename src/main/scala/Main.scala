package cl.ravenhill.hamcracio

object Main extends App {
  val square = (x: Double) => {
    x * x
  }
  val client = new IntegralClient
  val result = client.integrate("square", square, 0.0, 1.0)
  println(result)
  // \int_{0.0}^{1.0} square(x) dx = 0.25
}
