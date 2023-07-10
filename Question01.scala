package Tutorial05

object Question01 {
  def main(args: Array[String]): Unit = {
    var ex1 = prime(5)
    println("Is 5 prime : " + ex1)
    var ex2 = prime(8)
    println("Is 8 prime : "+ ex2)
    println("Enter a number : ")
    var num = scala.io.StdIn.readInt()
    var ex3 = prime(num)
    println("Is the number entered prime : "+ ex3)
  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case b if b > a => GCD(b,a)
    case _ => GCD(b, a%b)
  }

  def prime(p: Int, n: Int = 2 ): Boolean = n match{
    case x if (p == x) => true
    case x if (GCD(p,x) > 1 ) => false
    case x => prime(p, x+1)
  }

}
