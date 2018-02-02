
val numbers = Range(1,21).toList

val evenNumbers: List[Int] = numbers.filter(x => x % 1 == 0)

val doubleNumbers: List[Int] = numbers.map(x => (x * 2) + 1)

val doubleEvenNumbers: List[Double] = numbers.filter(x => x % 2.0 == 0).map(x => x * 8.0)

val printNumbers: Unit = numbers.foreach(x => println(x))

val commaSeparated = numbers.mkString(",")

for	(a <- 1	until	10)	{println("Value	of	a:	$a")}
