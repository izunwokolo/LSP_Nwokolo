package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.howard.edu.lsp.finalExam.MapUtilities;
import org.howard.edu.lsp.finalExam.NullMapException;

import org.junit.jupiter.api.DisplayName;

class MapUtilitiesTest {

	@Test
	public void testcommonKeyValuePairs() throws NullMapException {
		// TODO Auto-generated method stub
		HashMap<String, String> map1 = new HashMap<>();

		map1.put("Alice","Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Bob","Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		 
		HashMap<String, String> map2 = new HashMap<>();
		 
		map2.put("Mary", "Ecastic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Superb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
		
		HashMap<String, String> map3 = new HashMap<>();
		HashMap<String, String> map4 = new HashMap<>();
		
		HashMap<String, String> map5 = new HashMap<>();
		map5.put("Bob", "Happy");
		map5.put("Izu", "Fat");
	
		assertEquals("error in commonPairs",MapUtilities.commonKeyValuePairs(map1,map5),1);
		assertEquals("error in commonPairs",MapUtilities.commonKeyValuePairs(map5,map1),1);
		assertEquals("error in commonPairs",MapUtilities.commonKeyValuePairs(map1,map2),2);
		assertEquals("error in commonPairs",MapUtilities.commonKeyValuePairs(map3,map4),0);
		assertEquals("error in commonPairs",MapUtilities.commonKeyValuePairs(map1,map3),0);
		
		
	}
	
	@Test
	@DisplayName("testcommonPairs throws exception")
	public void testcommonKeyValuePairs_THROWS_EXCEPTION() {
		HashMap<String, String> map1 = null;
		HashMap<String,String> map2 = null;
		HashMap<String, String> map3 = new HashMap<>();
		map3.put("Howard", "Sammy");
//	
		Exception error1 = assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(map1,map2);
		});
		String wantedMsg = "Atleast one of the maps is empty";
		String givenMsg = error1.getMessage();
	
		Exception error2 = assertThrows(NullMapException.class, ()->{
			MapUtilities.commonKeyValuePairs(map1,map2);
		});
		String wantedMsg1 = "Atleast one of the maps is empty";
		String givenMsg1 = error2.getMessage();
		
		assertTrue(givenMsg.contains(wantedMsg));
		assertTrue(givenMsg1.contains(wantedMsg1));
	}
}
