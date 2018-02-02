val ints = List(1,2,3,4,5,6,7,8,9,10)

val total = ints.foldLeft(0)((acc, num) => {
  val sum = acc + num
  println(s"$acc $num = $sum")
  sum
})

total

val totals = ints.foldLeft(0)(_+_)

