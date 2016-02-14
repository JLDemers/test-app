import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */

/**
 * @author Justin Demers
 *
 */
public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> numberList = null;
		ArrayList<ArrayList<Integer>> test = new ArrayList<ArrayList<Integer>>(); //ArrayList of ArrayList of Integer
		int randomInteger;
				
		Random randomNumberGenerator = new Random();
		
		for(int i = 0; i < 5; i++){
			randomInteger = randomNumberGenerator.nextInt(100);
			
			if(numberList == null){
				numberList = new ArrayList<Integer>();
				numberList.add(randomInteger);
			} else if (numberList.get(numberList.size()-1) < randomInteger){
				numberList.add(randomInteger);
			} else if (numberList.get(numberList.size()-1) >= randomInteger){
				test.add(numberList);
				numberList = new ArrayList<Integer>();
				numberList.add(randomInteger);
			}
		}
		
		for( ArrayList<Integer> val : test){
			System.out.println(val);			
		}
		
	}

}
