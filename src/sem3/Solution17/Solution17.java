package sem3.Solution17;

public class Solution17 {
 public static void main(String[] args) {
  System.out.println(new Pawn() instanceof ChessFigure);
 }
}
class ChessFigure{}
class King extends ChessFigure{}
 class Queen extends ChessFigure{}
 class Rook extends ChessFigure{}
 class Knight extends ChessFigure{}
 class Bishop extends ChessFigure{}
 class Pawn extends ChessFigure{}