/*
package com.rockthejvm

import com.rockthejvm.PatternMatching.Person

object ContextAbstractions extends App {
  /*
  scala 3
   */

  /*
  Context parameters/arguments
   */
  val aList = List(2, 1, 3, 4, 5)
  val anOrderedList = aList.sorted // ordering
  // contextual argument.

  given descendingOrder: Ordering[Int]
  = Ordering.fromLessThan(_ > _) // a,b => a>b

  // analogus to implicit val
  // in scala 3 , alows to chose should we have context arguments

  trait Combinator[A] {
    def combine(x: A, y: A): A
  }

  def combineAll[A](list: List[A])(combinator: Combinator[A]): A = {
    list.reduce((a, b) => combinator.combine(a, b))
  }

  val theSum = combineAll(aList)

  // combineAll(List(1,2,3,4)

  /*
  Given places
  - local scope
  - imported scope
  - companion scope
      - companion of List
      - companion of int
   */

  // context bounds
  def combineAll_v2[A](list: List[A])(using

  Combinator[A]
  ):
  A = ???

  def combineAll_v3[A: Combinator](list: List[A]): A = ???
  /*
   context params are used:
   - type classes
   - dependency objections
   - context dependent
   - type level programing
   */

  /*
   2.  - extension methods
   */

  case clase Person (name: String) {
    def greet(): String = s"Hi, my name is $name"
  }

  extension(string: String)
     def great(): String = new Person().greet()


  val danielsGreeting = "Daniel".greeting() // " type enrichment" or pimping

    // power, context + extensions
  extension [A] (list: List[A])
    def combineAllValues(using combinator: Combinator[A]): A =
      list.reduce(combinator.combine)

  val theSum_2 = aList.combineAllValues

  def main(args: Array[String]): Unit = {
    println(anOrderedList)
    println(theSum_2)

  }
}
*/
