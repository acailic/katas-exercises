package com.rockthejvm

object Advanced extends App{

  // lazy evaluation
  // useful in infinite collections
  lazy val aLazyValue= 2
  lazy val aLazyValueWithSideEffect = {
    println("i am so lazy")
    22
  }
  val eagerValue= aLazyValueWithSideEffect +1

  def methodWichCanReturnNull(): String = "Helloo oooo"

}
