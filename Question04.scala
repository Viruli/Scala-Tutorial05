package Tutorial05

object Question04 {
  def main(args: Array[String]): Unit = {
    println("Enter a Number : ")
    var num = scala.io.StdIn.readInt()
    var bool = isEven(num)
    if(bool){
      println("Even Number")
    }
    else{
      println("Odd Number")
    }
  }

  def isEven(n:Int):Boolean = n match{
    case 0 => true
    case 1 => false
    case n if n<0 => isEven(-n)
    case _ => isEven(n - 2)
  }

}
