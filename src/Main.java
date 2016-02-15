import java.util.ArrayList;
import java.util.Random;

/**
 * 
 */

/**
 * @author Justin Demers
 * Builds smaller array list of ascending numbers from a randomized set of numbers.
 */
public class Main {

	static Integer RANDOM_ARRAY_SIZE = 10; //change this to create larger array of random numbers
	
	public static void main(String[] args) {

		ArrayList<Integer> numberList = null;
		ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>(); //ArrayList of ArrayList of Integer
		
		ArrayList<Integer> randomNumbers = fillArray(); //Generates an array of random integers
		System.out.println("Random returned array: " + randomNumbers.toString()); //Prints out the generated list

		for(Integer num : randomNumbers){
			if(numberList == null){
				numberList = new ArrayList<Integer>();
				numberList.add(num);
			} else if (numberList.get(numberList.size()-1) <= num){
				numberList.add(num);
			} else if (numberList.get(numberList.size()-1) > num){
				listOfLists.add(numberList);
				numberList = new ArrayList<Integer>();
				numberList.add(num);
			} 
		}
		listOfLists.add(numberList); //the last list will be added outside of the loop.

		/*
		 * Lists out smaller array of numbers.
		 */
		for( ArrayList<Integer> val : listOfLists){
			System.out.println(val);			
		}
	}

	public static ArrayList<Integer> fillArray(){
		int randomInteger;
		Random randomNumberGenerator = new Random();
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		
		for(int i = 0; i < RANDOM_ARRAY_SIZE; i++){
			randomInteger = randomNumberGenerator.nextInt(100);
			listOfNumbers.add(randomInteger);
		}

		return listOfNumbers;
	}

}
