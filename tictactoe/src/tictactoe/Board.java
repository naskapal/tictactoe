package tictactoe;

public class Board {

	private char placement[] = new char [9];
	private String winner = "";
	private boolean full,win;
	public Board(){
		for (int i = 0; i < placement.length; i++)
				placement[i] = '.';
	}
	public boolean checkFull(){
		full = false;
		for (int i = 0; i < placement.length; i++ ){
			if (placement[i] == '.' ){
				full = false;
				break;
			}
		}
		return full;
	}
	public void place(Location location, char contain){
		checkFull();
		while (!check(location))
		{
			System.out.println("Invalid position, try again");
			break;
		}
		placement[location.getLocation()] = contain;
		
	}
	private boolean check(Location location){
		if (placement[location.getLocation()] != '.' )
			return false;
		else
			return true;
	}

	public void checkWin(char player1Piece,char player2Piece){
		if (placement[0] == player1Piece && placement[1] == player1Piece && placement[2] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[0] == player2Piece && placement[1] == player2Piece && placement[2] == player2Piece)
		{
			winner = "Player2";
			win = true;
		}
		else if (placement[3] == player1Piece && placement[4] == player1Piece && placement[5] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[3] == player1Piece && placement[4] == player1Piece && placement[5] == player1Piece)
		{
			winner = "Player2";
			win = true;
		}
		else if (placement[6] == player1Piece && placement[7] == player1Piece && placement[8] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[6] == player1Piece && placement[7] == player1Piece && placement[8] == player1Piece)
		{
			winner = "Player2";
			win = true;
		}
		else if (placement[0] == player1Piece && placement[3] == player1Piece && placement[6] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[0] == player1Piece && placement[3] == player1Piece && placement[6] == player1Piece)
		{
			winner = "Player2";
			win = true;
		}
		else if (placement[1] == player1Piece && placement[4] == player1Piece && placement[7] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[1] == player1Piece && placement[4] == player1Piece && placement[7] == player1Piece)
		{
			winner = "Player2";
			win = true;
		}
		else if (placement[2] == player1Piece && placement[5] == player1Piece && placement[8] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[2] == player1Piece && placement[5] == player1Piece && placement[8] == player1Piece)
		{
			winner = "Player2";
			win = true;
		}
		else if (placement[0] == player1Piece && placement[4] == player1Piece && placement[8] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[0] == player1Piece && placement[4] == player1Piece && placement[8] == player1Piece)
		{
			winner = "Player2";
			win = true;
		}
		else if (placement[2] == player1Piece && placement[4] == player1Piece && placement[6] == player1Piece)
		{
			winner = "Player1";
			win = true;
		}
		else if (placement[2] == player1Piece && placement[4] == player1Piece && placement[6] == player1Piece)
		{
			winner = "Player2";
			win = true;
		}
	}
	public boolean win(){
		return win;
	}
	public boolean winner(){
		if (winner.equals("Player1"))
			return true;
		else
			return false;
	}
	public void drawBoard(){
		int k = 0;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.print(placement[k] + "\t");
				k++;
			}
			System.out.println();
		}
	}
}
