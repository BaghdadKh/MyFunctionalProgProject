import scala.collection.mutable._
object MutableCollection {
  def main(args: Array[String]): Unit = {
    //Arrays
    var Ids : Array[Integer] =new Array[Integer](3)
    Ids.foreach(x=> print(x+ "  "))
    println()
    Ids(0)= 1803
    Ids(1)= 1804
    Ids.update(2,1805)
    Ids.foreach(x=> print(x+ "  "))
    println()
    //ListBuffer
    val listBuffer = ListBuffer("scala")
    listBuffer += "C"
    println(listBuffer)
    println()
    // mutable sets
    var set = Set("scala" , "java")
    println(set.getClass)
    println(set.++("C"))
    //Lists
    var list = List(1,2,3)
    /*   list.update(1,3) // its error can't update list elemnt it's immutable   */
  }
}
