package org.katas


import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class BerlinClockTest extends AnyFunSuite with Matchers {

  test("Yellow lamp blink on/off every two seconds") {
    BerlinClock.seconds(0) should be("Y")
    BerlinClock.seconds(1) should be("O")
    BerlinClock.seconds(59) should be("O")
  }

  test("Top hours should have 4 lamps") {
    BerlinClock.topHours(7).length should be(4)
  }

  test("light a red lamp for every 5 hours") {
    BerlinClock.topHours(0) should be("OOOO")
    BerlinClock.topHours(13) should be("RROO")
    BerlinClock.topHours(23) should be("RRRR")
    BerlinClock.topHours(24) should be("RRRR")
  }

  test("Bottom hours  4 lamps") {
    BerlinClock.bottomHours(5).length should be(4)
  }

  test("light a red lamp for every hour left from top hours") {
    BerlinClock.bottomHours(0) should be("OOOO")
    BerlinClock.bottomHours(13) should be("RRRO")
    BerlinClock.bottomHours(23) should be("RRRO")
    BerlinClock.bottomHours(24) should be("RRRR")
  }

  test("Top minutes  should  have 11 lamps") {
    BerlinClock.topMinutes(34).length should be(11)
  }

  test("have 3rd, 6th and 9th lamps in red to indicate first quarter, half and last quarter") {
    val minutes32 = BerlinClock.topMinutes(32)
    minutes32(2) should be('R')
    minutes32(5) should be('R')
    minutes32(8) should be('O')
  }

  test("light a yellow lamp for every 5 minutes unless it's first quarter, half or last quarter") {
    BerlinClock.topMinutes(0) should be("OOOOOOOOOOO")
    BerlinClock.topMinutes(17) should be("YYROOOOOOOO")
    BerlinClock.topMinutes(59) should be("YYRYYRYYRYY")
  }

  test("Bottom minutes  4 lamps") {
    BerlinClock.bottomMinutes(0).length should be(4)
  }

  test("light a yellow lamp minute left from top minutes") {
    BerlinClock.bottomMinutes(0) should be("OOOO")
    BerlinClock.bottomMinutes(17) should be("YYOO")
    BerlinClock.bottomMinutes(59) should be("YYYY")
  }

  test("Berlin Clock result  array with 5 elements"
  ) {
    BerlinClock.convertToBerlinTime("13:17:01").size should be(5)
  }

  test("result  correct seconds, hours and minutes") {
    val berlinTime = BerlinClock.convertToBerlinTime("16:37:16")
    val expected = Array("Y", "RRRO", "ROOO", "YYRYYRYOOOO", "YYOO")
    berlinTime should equal(expected)
  }
}
