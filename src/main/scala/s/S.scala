package s

object Client extends App {
  val x = new Section().solve(List(1, 2, 3, 4, 5, 6, 7, 8, 0))
  val y = new Section().solve(List(1, 2, 3, 4, 5, 6, 7, 0, 0))
}

class Section {

  val p = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9)

  def solve(values: List[Int]): Section = {
    val ps = List(p, p, p, p, p, p, p, p, p)
    val r = replace(values)
    val s = is(r)
    val x = f(r, s)
    println(x)
    new Section
  }

  def f(y: List[Any], known: List[Int]) = y.map {
    i => i match {
      case v: Int => v
      case s: Seq[Int] => {
        val m = s.filterNot(x => known.contains(x))
        if (m.length == 1) m.head else m
      }
    }
  }

  def is(values: List[Any]) = values.collect {
    case i: Int => i
  }

  def replace(x: List[Int]): List[Any] = x.map(y => y match {
    case i if i > 0 => i
    case _ => p
  })

}
