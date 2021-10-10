package org.katas

class TennisGame(player1: Player, player2: Player) {
  def score = {

  }

  def leadPlayer = if(player1>player2) player1 else player2
}

class Player(val name: String) extends Ordered[Player] {
    var score = 0
    val pointsDescription = Array("love","fifteen","thirty", "forty")
    def compare(that: Player) = this.score - that.score
    def winBall  { score+=1}
}
object Player{
  def apply(name: String) = {new Player(name)}
}
