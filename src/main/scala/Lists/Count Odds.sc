val num = 5

val x = List.range(1, num + 1)

def isEven(number: Int) = number % 2 == 0

val odds = List.range(1, num+1).filterNot(isEven)
println(odds.length)