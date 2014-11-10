package tictactoe;

public class Location {
	private int x,y;
	public Location(int x, int y){
		this.x = x;
		this.y = y;
	};
	public int getLocation(){
		if (x == 1 && y == 1)
			return 0;
		else if (x == 1 && y == 2)
			return 1;
		else if (x == 1 && y == 3)
			return 2;
		else if (x == 2 && y == 1)
			return 3;
		else if (x == 2 && y == 2)
			return 4;
		else if (x == 2 && y == 3)
			return 5;
		else if (x == 3 && y == 1)
			return 6;
		else if (x == 3 && y == 2)
			return 7;
		else if (x == 3 && y == 3)
			return 8;
		else
			return 999;
	}
}
