package src 

/**
  * <p> Main class for the recurser. Controls which algorithms to invoke. </p>
  */
object Recurse {

  def main(args: Array[String]) = {

    val probOption = args(0)
    val recType = args(1)
    val algInput = args(2).toInt
    println("----------")

    // turning the recursion type into an integer (and input checking)
    val recOption = recType match {
      case "standard" => 1
      case "tail" => 2
      case _ => throw new IllegalArgumentException
    }

    if (recOption == 1) println("Standard recursion chosen")
    else if (recOption == 2) println("Tail recursion chosen")

    // get the results
    try{
      val timebefore = System.currentTimeMillis()
      val result = probOption match {
        case "fib" => processFibonacci(recOption, algInput)
        case "fac" => processFactorial(recOption, algInput)
        case "sum" => processSum(recOption, algInput)
        case _ => throw new IllegalArgumentException
      }
      val timeafter = System.currentTimeMillis()
      val duration = timeafter - timebefore

      println("time taken: " + duration + " millisecond(s)")
    }
    catch {
      case soe: StackOverflowError => println("Stack overflow! Try using tail recursion...")
      case e: Exception => e.printStackTrace()
      
    }
    
  }


  // method to find the nth fibonacci number
  def processFibonacci(recOption: Int, input: Int): Unit = {
    println("Fibonacci chosen")
    val fibonacci = new Fibonacci

    val result = recOption match {
      case 1 => fibonacci.runStandardFib(input)
      case 2 => fibonacci.runTailFib(input)
      case _ => throw new IllegalArgumentException
    }

    println("Fibonacci number " + input + " is " + result)
  }


  // method to find n!
  def processFactorial(recOption: Int, input: Int): Unit = {
    println("Factorial chosen")
    val factorial = new Factorial

    val result = recOption match {
      case 1 => factorial.runStandardFac(input)
      case 2 => factorial.runTailFac(input)
      case _ => throw new IllegalArgumentException
    }

    println("" + input + "! is " + result)
  }


  // method to find sum of first n numbers
  def processSum(recOption: Int, input: Int): Unit = {
    println("Sum chosen")
    val sum = new Sum

    val result = recOption match {
      case 1 => sum.runStandardSum(input)
      case 2 => sum.runTailSum(input)
      case _ => throw new IllegalArgumentException
    }

    println("Sum of the first " + input + " numbers is " + result)
  }
}


