package tictactoe;

import java.util.Scanner;//

public class Tictactoe {
	static Scanner sc1 = new Scanner(System.in);
	static int x,y;
	static Player player1 = new Player();
	static Player player2 = new Player();
	public static void main(String[] tictactoe){
		System.out.println("1. Play a game vs human");
		System.out.println("2. Play a game vs me");
		System.out.println("3. Quit");
		System.out.print("Your choice : ");
		int choice = sc1.nextInt();
		do
		{
			switch (choice)
			{
			case 1:
				System.out.println("Enter Player 1 name : ");
				player1.setName(sc1.next());
				System.out.println("Enter Player 2 name : ");
				player2.setName(sc1.next());
				System.out.println("Type in player 1 pieces (O/X):");
				player1.setPieces(sc1.next().toUpperCase().charAt(0));
				while (player1.getPieces() != 'O' && player1.getPieces() != 'X'){
					System.out.println("Invalid piece selection");
					System.out.println("Type in player 1 pieces (O/X):");
					player1.setPieces(sc1.next().toUpperCase().charAt(0));
				}
				if(player1.getPieces() == 'O')
					player2.setPieces('X');
				else
					player2.setPieces('O');
				
				Board board = new Board();
				int i = 0;
				while(!board.checkFull()){
					if (board.win())
						break;
					board.drawBoard();
					if (i % 2 == 0  || i == 0)
					{
						System.out.println(player1.playerName() + "'s turn ");
						System.out.println("input row num : ");
						x = sc1.nextInt();
						System.out.println("input column num : ");
						y = sc1.nextInt();
						Location location = new Location (x,y);
						board.place(location, player1.getPieces());
					}
					else
					{
						System.out.println(player2.playerName() + "'s turn ");
						System.out.println("input row num : ");
						x = sc1.nextInt();
						System.out.println("input column num : ");
						y = sc1.nextInt();
						Location location = new Location (x,y);
						board.place(location, player2.getPieces());
					}
					board.checkWin(player1.getPieces(), player2.getPieces());
					i++;
				}
				if (board.winner())
					System.out.println("The winner is " + player1.playerName());
				else
					System.out.println("The winner is " + player2.playerName());
				break;
			case 2:
				break;
			case 3:
				System.out.println("Bye! :)");
				break;
			default :
				System.out.println("no such option, exiting..");
				break;
			}
		} while (choice < 3 && choice > 0);
	}
}
