package Tutorial05

object Question05 {
  def main(args: Array[String]): Unit = {
    printNum(10)
  }

  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case 1 => false
    case n if n < 0 => isEven(-n)
    case _ => isEven(n - 2)
  }

  def printNum(n:Int):Unit = {
    if(isEven(n)){
      println(n)
    }
    if(n>0){
      printNum(n-1)
    }
  }

}
