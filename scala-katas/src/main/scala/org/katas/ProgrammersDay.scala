package org.katas
import scala.collection.{mutable};

object ProgrammersDay {


  def calculateSittingChairs(chairs: Int): Int = {
    calculateSitting(chairs,chairs)
  }
  def calculateSitting(chairs: Int, professorSteps: Int): Int = {
    val chairsOverall = List.range(1, chairs + 1);
    val stepsProfessor = List.range(1, professorSteps + 1)
    var chairsMap: Map[Int, Boolean] = chairsOverall.map(chair => chair -> false).toMap

    stepsProfessor.foreach(stepProfessor => {
      println(s"PROFESSOR STEP:$stepProfessor")
      for (step <- stepProfessor to chairs by stepProfessor) {
        chairsMap = chairsMap.updated(step, !chairsMap(step))
        println(chairsMap)
      }
    });
    chairsMap.values.count(_ == true)
  }

}
