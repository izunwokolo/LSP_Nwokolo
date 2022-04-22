package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MapUtilitiesTest {

	@Test
	void test() throws NullMapException {
		fail("Not yet implemented");



		
		// TODO Auto-generated method stub
		HashMap<String, String>map1 = new HashMap<>();
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Bob", "Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		
		HashMap<String, String>map2 = new HashMap<>();
		
		map2.put("Mary", "Ecastic");
		map2.put("Bob", "Happy");
		map2.put("Tam", "Fine");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Subperb");
		
		     MapUtilities test = new MapUtilities();
		 System.out.println("output" + test.commonKeyValuePairs(map1, map2));

			

		
	}

}
