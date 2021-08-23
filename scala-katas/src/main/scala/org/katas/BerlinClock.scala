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
  def topHours(number: Int) = onOff(4, topNumberOfOnSigns(number))

  def bottomHours(number: Int) = onOff(4, number % 5)

  def topMinutes(number: Int) = onOff(11, topNumberOfOnSigns(number), "Y").replaceAll("YYY", "YYR")

  def bottomMinutes(number: Int) = onOff(4, number % 5, "Y")

  private def onOff(lamps: Int, onSigns: Int, onSign: String = "R") = {
    onSign * onSigns + "O" * (lamps - onSigns)
  }

  private def topNumberOfOnSigns(number: Int) = (number - (number % 5)) / 5

  def seconds(seconds: Int): String = if (seconds % 2 == 0) "Y" else "O"
  /*

   */


}
