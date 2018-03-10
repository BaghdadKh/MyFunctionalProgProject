object TailRecursionExample {
  def main(args: Array[String]): Unit = {
    var list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var list2 = List.range(0,1000000)

    println( getListLength1( list1 ) )
//    println( getListLength1( list2 ) ) // get stak overflow in this case

    println( getListLength2( list1 ) )
    println( getListLength2( list2 ) ) // get the expected result  1000000
    println("Factorial of 1000 = "+ factorial(1000))
  }
  def getListLength2(list: List[_]): Int = {
    def findlength(list: List[_], len: Int): Int = {
      if (list == Nil) len
      else findlength(list.tail, len + 1)
    }
    findlength(list, 0)
  }//tail recursion

  def getListLength1(list: List[_]): Int = {
    if (list == Nil) 0
    else 1 + getListLength1(list.tail)
  }// recursion

  def factorial(i: BigInt): BigInt = {
    def fact(i: BigInt, accumulator: BigInt): BigInt = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  } // //tail recursion for factorial


}
