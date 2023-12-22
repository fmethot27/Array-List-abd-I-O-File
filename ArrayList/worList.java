package Part1;

import java.util.ArrayList;

public class worList {
	public static void main(String[] args) {
		
		// Creating the array list for the words.
				ArrayList<String> wordList = new ArrayList<>();
		
		// Adding the words in the Array.
		wordList.add("apple");
		wordList.add("banana");
		wordList.add("orange");
		wordList.add("grape");
		wordList.add("kiwi");
		
		// Printing out the results of the list.
		System.out.println("Here are the elements in the list: " + wordList);
		System.out.println("===============");
		
		// Modifying the array list by firstly adding at the first index a number and
		// then removing the fourth item from the index.
		wordList.add(0, "pear");

		wordList.remove(3);

		// Verifying if the word 'orange' is still in the list.
		boolean IsThereOrange = wordList.contains("orange");
		
		// Printing the results.
		System.out.println("Does the list contain 'orange'?" + "\n" + IsThereOrange);
		System.out.println("===============");
		System.out.println("Updated version of the list: " + wordList);
		System.out.println("===============");

		// Initializing the pair array.
		Pair<Integer, String> p1 = new Pair<>(420, "I cannot do that Dave.");
		Pair<Double, Double> p2 = new Pair<>(79.85, 3.14);
		
		// Printing the results.
		p1.printPair();
		p2.printPair();

		// Creating an array list for the class Pair.
		ArrayList<Pair<?, ?>> pairList = new ArrayList<>();
		
		// Adding the elements to the class.
		pairList.add(p1);
		pairList.add(p2);

		// Printing the results.
		for (Pair<?, ?> pair : pairList) {
			System.out.println("Pair: " + pair.getFirst() + ", " + pair.getSecond());
		}

	}
}