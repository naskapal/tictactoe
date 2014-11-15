package tictactoe;

import java.util.Scanner;//

public class Tictactoe {
	static Scanner sc1 = new Scanner(System.in);
	static int x,y;
	static Player player1 = new Player();
	static Player player2 = new Player();
	static char repeat;
	public static void main(String[] tictactoe){
		System.out.println("1. Play a game vs human");
		System.out.println("2. Play a game vs bot");
		System.out.println("3. Quit");
		System.out.print("Your choice : ");
		int choice = sc1.nextInt();
		do
		{
			switch (choice)
			{
			case 1:
				do
				{
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
					board.drawBoard();
					System.out.println("Do you want to play again ? (Y/N)");
					repeat = sc1.next().toLowerCase().charAt(0);
				} while (repeat == 'y');
				
				break;
			case 2:
				do
				{
					Player player1 = new Player();
					Bot bot = new Bot();
					Board board = new Board();
					System.out.println("Enter Player 1 name : ");
					player1.setName(sc1.next());
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
					System.out.println("You are playing against " + bot.playerName() + " bot");
					
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
							System.out.println(bot.playerName()+ " bot" + "'s turn ");
							Location location = new Location (x,y);
							location = bot.Calculate(board.getBoardCondition(),player1.getPieces());
							board.place(location, player2.getPieces());
						}
						board.checkWin(player1.getPieces(), player2.getPieces());
						i++;
					}
					if (board.winner())
						System.out.println("The winner is " + player1.playerName());
					else
						System.out.println("The winner is " + bot.playerName() + " bot");
					board.drawBoard();
					System.out.println("Do you want to play again ? (Y/N)");
					repeat = sc1.next().toLowerCase().charAt(0);
				} while (repeat == 'y');
				choice = 3;
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
