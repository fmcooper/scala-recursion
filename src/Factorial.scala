package src 
import scala.annotation.tailrec


/**
  * <p> Factorial class. Contains recursive methods to calculate a factorial. </p>
  */
class Factorial() {


  /**
  * <p> Standard recursion to find n! </p>
  */
  def runStandardFac(n: Int): Int = {
    if (n == 0) 1 else n * runStandardFac(n - 1)
  }


  /**
  * <p> Tail recursion to find n! </p>
  */
  def runTailFac(n: Int): Int = {
    @tailrec
    def iter(n: Int, acc: Int): Int = 
      if (n == 0) acc else iter(n - 1, acc * n)
    
    iter(n, 1)
  }
}

