package tictactoe;

import java.util.Random;

public class Bot extends Player {
	private String names[] = {"Agnes","Alfred","Archy","Bart","Benjamin","Bertram",
		"Bruni","Buster","Edith","Ester","Flo","Francis","Francisco","Gil","Gob","Gus","Hank",
		"Harold","Harriet","Henry","Jacques","Jorge","Juan","Kitty","Lionel","Louie","Lucille",
		"Lupe","Mabel","Maeby","Marco","Marta","Maurice","Maynard","Mildred","Monty","Mordecai",
		"Morty","Pablo","Seymou","Stan","Tobias","Vivian","Walter","Wilbur"};
	private int  ownPoint,enemyPoint,x,y;
	private int[][] symmetric = { {0,1,2}, {3,4,5}, {6,7,8}, {0,3,6}, {1,4,7}, {2,5,8}, {0,4,8}, {2,4,6}};
	private Random r = new Random();
	public Bot(){
		name = names[r.nextInt(names.length)];
	}
	public Location Calculate(char[] boardCondition, char enemyPiece){
		int enemyLocation = 0;
		int[] possibleMoves = new int[16];
		for (int i = 0; i < boardCondition.length; i++){
			if (boardCondition[i] == enemyPiece){
				enemyLocation = i;
				enemyPoint++;
				break;
			}
		}
		possibleMoves = getSymmetricalLocation(enemyLocation);
		for (int i = 0; i < boardCondition.length; i++){
				if (boardCondition[possibleMoves[i]] == '.'){
					move(possibleMoves[i]);
					break;
				}
		}
		Location move = new Location(x,y);
		System.out.println("I am now moving to " + x + ", " + y);
		return move;
	}
	private int[] getSymmetricalLocation(int enemyLocation){
		int asd[] = new int [16];
		int index = 0;
		for (int i = 0; i < 8; i++){
			for (int j = 0; j < 3; j++){
				if (symmetric[i][j] == enemyLocation){
					if (j == 0){
						asd[index] = symmetric[i][1];
						index++;
						asd[index] = symmetric[i][2];
						index++;
					}
					else if (j == 1){
						asd[index] = symmetric[i][0];
						index++;
						asd[index] = symmetric[i][2];
						index++;
					}
					else if (j == 3){
						asd[index] = symmetric[i][0];
						index++;
						asd[index] = symmetric[i][2];
						index++;
					}
					continue;
				}
			}
		}
		return asd;
	}
	private void move(int location){
		if(location == 0){
			x=1;
			y=1;
		}
		else if(location == 1){
			x=1;
			y=2;
		}
		else if(location == 2){
			x=1;
			y=3;
		}
		else if(location == 3){
			x=2;
			y=1;
		}
		else if(location == 4){
			x=2;
			y=2;
		}
		else if(location == 5){
			x=2;
			y=3;
		}
		else if(location == 6){
			x=3;
			y=1;
		}
		else if(location == 7){
			x=3;
			y=2;
		}
		else if(location == 8){
			x=3;
			y=3;
		}
	}
}
