val numbers : List[Int] = List(1, 2, 3, 5, 8, 13)

def sumAndMultiplyBy(list : List[Int], f: Int => Int) = numbers.map(n => f(n)).sum


val timesTwo = (n : Int) => n * 2
val timesThree = (n : Int) => n * 3
val timesFour = (n : Int) => n * 4

val timesTwoThenTimesThree = timesTwo andThen timesThree

sumAndMultiplyBy(numbers, timesTwo)
sumAndMultiplyBy(numbers, timesThree)
sumAndMultiplyBy(numbers, timesTwoThenTimesThree)
sumAndMultiplyBy(numbers, timesFour)