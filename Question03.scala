package Tutorial05

object Question03 {
  def main(args: Array[String]): Unit = {
    var sum = addNum(5)
    println("Sum = "+ sum)
  }

  def addNum(n:Int):Int = n match{
    case n if(n<=0) => 0
    case _ => n + addNum(n-1)
  }
}
