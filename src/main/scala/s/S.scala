package s

object Client extends App {
  val x = new Section(List(1, 2, 3, 4, 5, 6, 7, 8, 0))
  println(x.solve)
  val y = new Section(List(1, 2, 3, 4, 5, 6, 7, 0, 0))
  println(y.solve)
}

class Section(values: List[Int]) {

  def solve: Section = {
    val p = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val ps = List(p,p,p,p,p,p,p,p,p)
    new Section(ps)
  }
}