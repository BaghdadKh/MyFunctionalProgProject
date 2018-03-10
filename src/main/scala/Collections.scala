class Student(id: Int, year: Int,uniName:String,gpa:Double) {
  var stdId: Int = id
  var stdYear: Int = year
  var stdUniName :String = uniName
  var stdGPA :Double =gpa
}
object Collections {
  def main(args: Array[String]): Unit = {
    val std1= new Student(123,2017,"JUST",88.3)
    val std2= new Student(124,2018,"JU",60.5)
    val std3= new Student(122,2016,"JUST" ,93.8)
    val std4 = new Student(100 ,2000,"JUST",80.4)
    val std5=new Student(125,2018,"JU",84.9)
    var listStudents = List (std1,std2,std3,std4,std5)
    /**************************** filter and for each **************************************************/
    val justStudents =listStudents.filter(x=>x.stdUniName=="JUST")
    print("Students in JUST university have these ids  ---  ")
    justStudents.foreach(x => print("  " + x.stdId ))
    println()
    println()
    println("The GPA of students out of 4  --- > ")
    listStudents.foreach(x => { println( x.stdId + "   " + x.stdGPA/25 ) })

    /**************************** Fold and  reduce **************************************************/
    println()
    println("***************************************************************")
    println()
    val arr = Array(1,3,4,10,5)
    println(arr.toList)
    println(arr.reduce((a,b)=>{a+b})+ " which is equal to the total of all elements")  // same with reduceLeft
    println(arr.fold(100)((a,b)=>a+b) + " which is equal to the total of all elements plus 100 ")

    /**************************** foldLeft & foldRight **************************************************/
    println()
    println("***************************************************************")
    println()
    println("fold left and right for a-b with initial 3")
    println(arr.foldLeft(3)((a,b)=> { print(a+"," +b) ; print("  ** " ) ; (a-b)}))
    println(arr.foldRight(3)((a,b)=> { print(a+"," +b) ; print("  ** " ) ; (a-b)}))
  }
}
