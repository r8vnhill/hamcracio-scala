package cl.ravenhill.hamcracio
package integral

import java.util.Objects

private class Integral(
    val name: String, val fn: Double => Double, val from: Double,
    val to: Double
) extends Equals {
  override def canEqual(that: Any): Boolean = {
    that.isInstanceOf[Integral]
  }
  override def equals(that: Any): Boolean = {
    if (canEqual(that)) {
      val other = that.asInstanceOf[Integral]
      name == other.name && fn == other.fn && from == other.from &&
        to == other.to
    } else {
      false
    }
  }
  override def hashCode(): Int = {
    Objects.hash(classOf[Integral], name, fn, from, to)
  }
}
