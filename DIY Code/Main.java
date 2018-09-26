import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        GameGen game = new GameGen();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sudoku : ");
        char[][] board = new char[GameGen.GAMESIZE][GameGen.GAMESIZE];
        for(int r = 0; r < GameGen.GAMESIZE; r++) {
          String input = sc.nextLine();
          board[r] = input.toCharArray();
        }
        game.fillCellsWithInput(board);
        game.display();

        System.out.println("\nSolution : \n");

        game.generate();
        game.display();
    }
}