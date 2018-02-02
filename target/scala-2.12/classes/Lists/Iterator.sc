class Iterator (var list: List[Int]) {

  def hasNext(): Boolean = {
    list.nonEmpty
  }

  def getNext(): Int = {
    val value = list.head
    list = list.tail
    value

  }

}

val iter = new Iterator List(1,2,3))

iter.hasNext()
iter.getNext()

iter.hasNext()
iter.getNext()

iter.hasNext()
iter.getNext()

iter.hasNext()
iter.getNext()