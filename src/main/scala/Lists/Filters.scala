package Lists


object Filters extends App{

  val ages = List(1, 25, 31, 14)
  val names = List("Adam", "David", "Daniel", "David")
  val filtered = for (
    name <- names if name != "David"; if name != "Daniel";
    age <- ages) yield s"name $name, age: $age"

  println(filtered)

}
