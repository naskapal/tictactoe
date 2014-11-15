package tictactoe;

public class Player {
	protected String name;
	private char pieces;
	public Player(){
		name = "";
	}
	public Player (String playerName){
		name = playerName;
	}
	public void setName(String playerName){
		name = playerName;
	}
	public String playerName(){
		return name;
	}
	public void setPieces(char pieces){
		this.pieces = pieces;
	}
	public char getPieces(){
		return pieces;
	}
}
