import java.util.*
public class DotComBust {

	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom>dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame();
	    //first make some dot coms and give them locations
	    DotCom one = new DotCom();
	    one.setName("Pets.com");
	    Dotcom two = new Dotcom();
	    two.setName("eToys.com");
	    DotCom three = new DotCom();
	    theree.setName("Go2.com");
	    dotComsList.add(one);
	    dotComsList.add(two); 
	    dotComsList.add(three):


	    System.out.println("Your goal is to sink three dot coms.");
	    System.out.println("pets.com,eToys.com,Go2.com");
	    System.out.println("Try to sink thenm all in the fewest number of guesser");


	    for(Dotcom dotComToSet:dotComsList) {

	    	ArrayList<String> newLo;ation = helper.placeDotCom(3);
	    	dotComToSet.setLocationsCells(newLocation);
	    } 
}

private void StartPlaying() {

	while(!dotComsList.isEmpty()) {

		String userGuess = helper.getUderInput("Enter a guess");
		checkUserGuess(userGuess);
	}
	finishGame();
}

private void checkUserGuess(String userGuess) {

	numOfGuesses++;

	String result = "miss";


	for(Dotcom dotComToTest : dotComsList)  {
		result = dotComToTest.checkYourself(userGuess);
		if(result.equals("hit")) {
			break;
		}
		if(result.equals("kill")){
			dotComsList.remove(dotComToTest);
			break;
		}
	}
	System.out.println(result);

}


private void finishGame() {
	System.out.println("All Dot Coms are dead! Your stock is now worthless.");
    if(numOfGuesses <=18){
    	System.out.println("It only took you" + numOfGuesses + "guesses.");
    	System.out.println("YOu got out before your options sank.");
    }else {
    	System.out.println("Took you long enough." + numOfGuesses +"guesses.");
    	System.out.println("Fish are dancing with your options.");

    }
}

public static voim main (String[] args) {
	DotComBust game = new DotComBust();
	game.setUpGame();
	game.StartPlaying();

   }
}




