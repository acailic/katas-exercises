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



}
