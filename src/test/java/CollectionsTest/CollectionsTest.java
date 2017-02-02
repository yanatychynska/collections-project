package CollectionsTest;

import java.util.*;

import org.testng.annotations.*;

public class CollectionsTest {

	@Test
	public void elementNotDuplicatedAndNotInOrderTest() {
		// * Create a String array with 10 city names in California, there can
		// not be two cities with the same name.
		// * Display the results on the screen in no particular order.
		Set<String> cities = new HashSet<String>();
		cities.add("Sacramento");
		cities.add("San Francisco");
		cities.add("Los Angeles");
		cities.add("Long Beach");
		cities.add("San Francisco");
		System.out.println("There are" + cities.size() + "cities in CA");
		for (String city : cities) {
			System.out.println("Currecnt city:" + city);
		}
		for (Iterator iterator = cities.iterator(); iterator.hasNext();) {
			String city = (String) iterator.next();
			System.out.println("Current city via Iterator is " + city);
		}
	}

	@Test
	public void elementsConnectedInOrderTest() {
		// * Create a String array with 10 state abbreviation, in alphabetical
		// order.
		// * Create another String array respectfully to abbreviation with the
		// full name of the state.
		// * Display the results on the screen with both Abbreviation and State
		// name in alphabetical order using Arrays.sort method on both arrays.
		Map<String, String> states = new TreeMap<String, String>();
		states.put("CA", "California");
		states.put("FL", "Florida");
		states.put("UK", "United Kingdom");
		states.put("TX", "Texas");
		states.put("CA", "Canada");
		System.out.println("there are" + states.size() + "states in CA");
		for (String abr : states.keySet()) {
			System.out.println("current state:" + states.get(abr));
		}
	}

	public void elementsConnectedNotInOrderTest() {
		// * Create a String array with the name of 5 stocks such as AAPL. Click
		// here for info.
		// * Create another array (double) with the respectful market price
		// percentage for example.
		// * Display the results on the screen in no particular order for both
		// the stock name and market value.
	}

	public void elementsInsertedBeginingAndEndTest() {
		// * Create a String array with 10 of the top winning team scores (for
		// example Colts and Buccaneers both have highest score of 34 so they
		// would
		// take 1st and 2nd place, Buccaneers and Colts respectfully) of teams
		// who
		// won on October 23, for NFL - in place 1-10 for index 0-9
		// respectfully.
		// Click here for results info.
		// * Display the results on the screen for place 10-1.
		// * *Because Buccaneers and Colts both received a score of 34, I than
		// defaulted to alphabetical order - Buccaneers in 1st place.
	}

	public void elementsNotDuplicatedInOrderTest() {
		// * Create a String array with 10 of the current hurricanes for 2016
		// names, not in alphabetical order. Click here for info.
		// * Display the results on the screen in alphabetical order using
		// Arrays.sort method.
	}

	@Test
	public void elementsRemovedAndAddedInMiddleTest() {
		// * Create a String array with the top 10 box office movies currently
		// playing. Click here for info.
		// * Display the results on the screen in order as order of 1-10.
		List<String> movies = new LinkedList<String>();
		movies.add("Rings");
		movies.add("Die hard");
		movies.add("Zotopia");
		movies.add("Fences");
		movies.add("Scream");
		movies.add("Sully");
		System.out.println("There are:" + movies.size() + "movies available for rent");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i));
		}
	}
}
