case class TicTacToe(board: List[List[Option[String]]], currentPlayer: String) {
  def play(row: Int, col: Int): Option[TicTacToe] = {
    if (board(row)(col).isEmpty) {
      val newBoard = board.updated(row, board(row).updated(col, Some(currentPlayer)))
      val nextPlayer = if (currentPlayer == "X") "O" else "X"
      Some(TicTacToe(newBoard, nextPlayer))
    } else {
      None
    }
  }

  def isWinningPlayer(player: String): Boolean = {
    val lines = board ++ board.transpose ++ diagonals
    lines.exists(line => line.forall(_.contains(player)))
  }

  private def diagonals: List[List[Option[String]]] = {
    List(
      List(board(0)(0), board(1)(1), board(2)(2)),
      List(board(0)(2), board(1)(1), board(2)(0))
    )
  }
}

object TicTacToe {
  def main(args: Array[String]): Unit = {
    var game = TicTacToe(List.fill(3, 3)(None), "X")
    game = game.play(0, 0).get
    game = game.play(1, 1).get
    game = game.play(0, 1).get
    game = game.play(1, 2).get
    game = game.play(0, 2).get
    if (game.isWinningPlayer("X")) {
      println("X wins!")
    } else if (game.isWinningPlayer("O")) {
      println("O wins!")
    } else {
      println("It's a tie!")
    }
  }
}
