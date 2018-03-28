package src 
import scala.annotation.tailrec


/**
  * <p> Sum class. Contains recursive methods to calculate the sum of the first n numbers. </p>
  */
class Sum() {


  /**
  * <p> Standard recursion to find sum of the first n numbers. </p>
  */
  def runStandardSum(n: Int): Int = {
    if (n == 0) 0 else n + runStandardSum(n - 1)
  }


  /**
  * <p> Tail recursion to find sum of the first n numbers. </p>
  */
  def runTailSum(n: Int): Int = {
    @tailrec
    def iter(n: Int, acc: Int): Int = 
      if (n == 0) acc else iter(n - 1, acc + n)
    
    iter(n, 0)
  }
}
