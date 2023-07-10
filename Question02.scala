package Tutorial05

object Question02 {
  def main(args: Array[String]): Unit = {
    primeSeq(10)

  }

  def GCD(a: Int, b: Int): Int = b match {
    case 0 => a
    case b if b > a => GCD(b, a)
    case _ => GCD(b, a % b)
  }

  def prime(p: Int, n: Int = 2): Boolean = n match {
    case x if (p == x) => true
    case x if (GCD(p, x) > 1) => false
    case x => prime(p, x + 1)
  }

  def primeSeq(n: Int):Unit ={
    if (prime(n)){
      println(n)
    }
    if(n>0){
      primeSeq(n-1)
    }
    if(n==0){
      0
    }

  }

}
