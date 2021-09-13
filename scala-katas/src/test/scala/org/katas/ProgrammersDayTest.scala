package org.katas

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ProgrammersDayTest extends AnyFunSuite with Matchers{

  test("return students sitting all and none") {
    ProgrammersDay.calculateSitting(10,1) should be(10)
    ProgrammersDay.calculateSitting(10,2) should be(5)

  }

  test("return students sitting 3") {
    ProgrammersDay.calculateSitting(4,4) should be(2)
  }
//  1 1 1 1 prvi
//  1 0 1 0 svaki drugi
//  1 0 0 0 svaki treci
//  1 0 0 1 svaki cetvrti

  // 1 1 1
  // 1 0 1
  // 1 0 0
  test("return students sitting one for 3 chairs") {
    ProgrammersDay.calculateSittingChairs(3) should be(1)
  }
}
