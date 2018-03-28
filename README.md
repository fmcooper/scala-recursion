# scala-recursion
A simple scala program to demonstrate standard and tail recursion.

# Using this program
You will need Scala installed on your computer to run this program.

This program has three problems: Fibonacci, Factorial and Sum. Each takes an integer n as input. Fibonacci finds the nth fibonacci number, factorial finds n! and sum finds the sum of the first n numbers. Each has implementations in both standard and tail recursive functions.

Example instances are easily run using the makefile. After you have downloaded the scala-recursion source code to your computer cd into the scala-recursion directory. The following examples are available:

``$ make runexamplefib1``

``$ make runexamplefib2``

``$ make runexamplefac1``

``$ make runexamplefac2``

``$ make runexamplesum1``

``$ make runexamplesum2``

``$ make runexamplesum3``

Each of these examples runs the same input on both standard and tail recursion. It may be that when running a standard recursion algorithm you get a stack overflow. This will be avoided with the tail recursion alternative.

Any of these commands will automatically compile the source code and run the example. To compile the code it is only necessary to run the command: 

``$ make``

Running your own examples after compilation can be easily done without using the make file. The three parameters given to the program are 1) a choice of problem to solve ('fib' for fibonacci, 'fac' for factorial, 'sum' for summation) 2) an option value which indicates which recursion function you are wanting to run ('standard' for standard recursion, 'tail' for tail recursion) and 3) an integer to input to the algorithm.

``$ scala -cp . src.sort fib standard 10``

