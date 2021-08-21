package org.katas

object BerlinClock {


  def convertToBerlinTime(time: String): Array[String] = {
    var Array(hours, minutes, seconds) = time.split(":").map(_.toInt)
    Array(
      this.seconds(seconds), // ?
      topMinutes(minutes),
      bottomMinutes(minutes),
      topHours(hours),
      bottomHours(hours)
    )
  }

  /*

   */

  def bottomMinutes(minutes: Int): String = lamps(minutes%5,1,'R',4)

  def topMinutes(minutes: Int):String = lamps(minutes,5,'R',11)

  def bottomHours(hours: Int): String = lamps(hours%5, 1, 'R',4)

  def topHours(hours: Int): String = lamps(hours,5,'R',4)

  def seconds(seconds: Int): String = if (seconds % 2 == 0) "Y" else "O"
  /*

   */
  private def lamps(number: Int, multiples: Int, color: Char, times: Int): String = {
     var result = (1 to times).map((value)-> if (value<=number) color else "0"))
  }

}
