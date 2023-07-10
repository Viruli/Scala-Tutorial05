package Tutorial05

object Question06 {
  def main(args: Array[String]): Unit = {
    println("Enter a Number : ")
    var num = scala.io.StdIn.readInt()
    println("Fibonacci Sequence : ")
    fibonacciSeq(num)
  }

  def fibonacci(n:Int):Int = n match {
    case 0 => 0
    case x if x==1 => 1
    case _ => fibonacci(n-1) + fibonacci(n-2)
  }
  def fibonacciSeq(n:Int):Unit ={
    if(n>0){
      fibonacciSeq(n-1)
    }
    println(fibonacci(n))


  }
}
