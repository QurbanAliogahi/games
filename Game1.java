import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Game1 {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	private String [] gameData = new String [5] ;
	int player1Number ;
	int player1Count = 0 ;
	int computerCount = 0 ;
	int computerNumber ;

	void game (){
		
		for (int i = 0 ; i < 5 ; i++){
			System.out.println("Enter your number between 0 to 5  ");
		player1Number = sc.nextInt();

			computerNumber = random.nextInt(5) ;
			 gameData [i] ="you Number was :"+player1Number+" Computer Number was "+computerNumber;
			if ( player1Number == computerNumber ){
				System.out.println("you kicked the player");
				player1Count ++ ;

			}
			if (player1Number !=computerNumber ){
				System.out.println("you was kicked ");
				computerCount ++ ;

			}
		}


	}
	void gameDetaisl (){
		for (int i = 0 ; i<gameData.length ;i++){
			System.out.println(gameData[i]);
		}
		
		
	}
	void result(){

	System.out.println  (" ....Game Results ...");
	System.out.println("Your Score    Computer Score  ");
	System.out.println("    "+player1Count+"                    "+computerCount);
	if (player1Count >computerCount){
		System.out.println(".......you Won........");
	}
	if (player1Count <computerCount ){
		System.out.println(".......you lost........");
	}
}
	public static void main(String[] args) {
		System.out.println("Welcome to Game ");
		Game1 game = new Game1();
		game.game();
		game.result();
		System.out.println("do you want to Show Details ");
		
		Scanner sc= new Scanner(System.in);
		int choice = sc.nextInt();
		
		if( choice == 1 ){
			game.gameDetaisl();
		}
		if(choice !=2){
			System.out.println("Thanks For palying  Game");
		}

	}
}

