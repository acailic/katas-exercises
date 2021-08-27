package com.rockthejvm

object FunctionalProgramming extends App {


  // Scala is 00
  class Person(name: String) {
    def apply(age: Int) = println(s"I have aged $age years")
  }

  val coa = new Person("Bobinjjo")

  coa.apply(29)
  coa(29) // INVOKING coa as a function === bob.apply(43)


  /*
   Scala runs the JVM, Functional programming
   -- compose function
   -- pass functions  as args
   -- return functioons  as results
   */

  val simpleIncrementer = new Function[Int, Int] {
    override def apply(arg: Int): Int = arg + 1
  }

  simpleIncrementer.apply(22)
  simpleIncrementer(22)

  // ALL SCALA FUNCTIONS ARE INSTANCES OF THESE FUNCTION_X TYPES


  //function with 2 arg and string return type
  val stringConcatenator = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(stringConcatenator("heheh i ", "sta kaze "))


  val doubler: Int => Int = (x: Int) => 2 * x
  doubler(4)


  /*    Int => Int
   new Function1 [Int,Int] {
   override def apply(x: Int)=  2*x
   }
   */

  // high order function
  val aMapped: List[Int] = List(1, 2, 3).map(x => x + 1)
  println(aMapped)
  val flatMapped = List(23,2,2).flatMap(x=>List(x,2*x))
  println(flatMapped)
  val flatMapped2 = List(23,2,2).flatMap {
    x=>List(x,2*x)
  }
  val flatMapped3 = List(2,1,1,1,2).filter(x=>x>1)
  println(flatMapped3)
  val flatMapped4 = List(2,1,1,1,2).filter(_<=1)
  println(flatMapped4)




}
