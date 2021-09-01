package com.rockthejvm

object PatternMatching extends App {

  //switch statemen
  val aInteger = 22
  val ordering = aInteger match {
    case 1 => "First"
    case 2 => "Second"
    case 3 => "Third"
    case _ => aInteger + "th"
  }
  // PM is expression
  // can decounstruct into case calse

  case class Person(name: String, age: Int)

  val bob = Person("Bob", 23)

  // like apply for new
  // deconstuct in case class
  val personGreeting = bob match {
    case Person(n,a) => s"Hi, my name is $n and i am $a years old."
    case _=>"Soomething else"
  }
  println(personGreeting)


  // deconstruct a tuple
  val aTuple = ("bon jovi", "rock")
  val bandDescription = aTuple match {
    case (band,genre)=> s"$band belongs to the genre $genre"
    case  _=> "I don't know what you are talikng about"
  }


  val aList = List(12,2,3)
  val listDescription = aList match {
    case List(_,2,_) => "List containing 2 on its second position"
    case _=> "Unknown list"
  }
  // if PM doesnt match it will throw MatchError
  /// pattern matching starts with order, try all cases in sequence

  println(listDescription)
}
