object Main {
  def main(args: Array[String]): Unit = {
    val myList = List(1, 2, 3, 4, 5)
    val evenList = filterEven(myList)
    println(evenList)
  }

  def filterEven(numbers: List[Int]): List[Int] = {
    numbers.filter(_ % 2 == 0)
  }
}