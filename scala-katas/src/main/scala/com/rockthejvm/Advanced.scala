package com.rockthejvm

import scala.concurrent.Future
import scala.util.{Failure, Success, Try}
import scala.concurrent.ExecutionContext.Implicits.global

object Advanced extends App{

  // lazy evaluation
  // useful in infinite collections
  lazy val aLazyValue= 2
  lazy val aLazyValueWithSideEffect = {
    println("i am so lazy")
    22
  }
  val eagerValue= aLazyValueWithSideEffect +1

  def methodWhichCanReturnNull(): String = "Helloo oooo"
  val anOption= Option(methodWhichCanReturnNull()) //
  // option = "collections" which contains one element, or None
  // map, flatMap, filter


  def methodWhichCanTrowException(): String = throw new RuntimeException
  val aTry = Try(methodWhichCanTrowException())
  //
  val anotherStringProcessing = aTry match {
    case Success(validValue) => s"Its $validValue success."
    case Failure(ex) => s"Here is the failure: $ex."
  }
  println(aTry)
  println(anotherStringProcessing)
  val aFuture = Future {
    println("Loading......")
    Thread.sleep(2000)
    println("Loading 2......")
    87
  }

  // future is a "collection" which contains a value when it's evaluated
  // future is composable with map, flatMap and filter

  /**
  * Implicits basics
  */
  // #1: implicit arguments
  def aMethodWithImplicitArgs(implicit arg: Int) = arg + 1
  implicit val myImplicitInt = 46
  println(aMethodWithImplicitArgs)  // aMethodWithImplicitArgs(myImplicitInt)

  // #2: implicit conversions
  implicit class MyRichInteger(n: Int) {
    def isEven(): Boolean = n % 2 == 0
  }

  println("MyRichInteger")
  println(23.isEven()) // new MyRichInteger(23).isEven()
  // use this carefully


}
