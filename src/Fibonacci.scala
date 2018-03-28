package src 
import scala.annotation.tailrec


/**
  * <p> Fibonacci class. Contains recursive methods to calculate a fibonacci number. </p>
  */
class Fibonacci() {


  /**
  * <p> Standard recursion to find the nth Fibonnacci number. </p>
  */
  def runStandardFib(n: Int): Int = {
    if (n == 0) 0 else if (n == 1) 1 else runStandardFib(n - 1) + runStandardFib(n - 2)
  }


  /**
  * <p> Standard recursion to find the nth Fibonnacci number - with a more layed out style.
  * Identical to above. </p>
  */
  def runStandardFibLarge(n: Int): Int = {
    // base cases 
    if (n == 0) {
      0
    }
    else if (n == 1) {
      1
    }

    // standard case
    else {
      runStandardFibLarge(n - 1) + runStandardFibLarge(n - 2)
    }
  }


  /**
  * <p> Tail recursion to find the nth Fibonnacci number.
  */
  def runTailFib(n: Int): Int = {
    @tailrec
    def iter(n: Int, acc1: Int, acc2: Int): Int = 
      if (n == 0) acc1 else if (n == 1) acc2 else iter(n - 1, acc2, acc1 + acc2)
    
    iter(n, 0, 1)
  }


  /**
  * <p> Tail recursion to find the nth Fibonnacci number - with a more layed out style.
  * Identical to above. </p>
  */
  def runTailFibLarge(n: Int): Int = {

    // an iterator with two accumulators
    @tailrec
    def iter(n: Int, acc1: Int, acc2: Int): Int = {
      // base cases 
      if (n == 0) {
        acc1
      }
      else if (n == 1) {
        acc2
      }

      // standard case
      else iter(n - 1, acc2, acc1 + acc2)
    }

    // start the iterator off
    // cases of 0 and 1 index are dealt with as special cases in the iter
    iter(n, 0, 1)
  }
}




