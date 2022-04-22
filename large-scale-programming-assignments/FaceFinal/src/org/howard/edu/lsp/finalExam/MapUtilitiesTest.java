package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.*;
import java.util.HashMap;

import org.junit.Test;

public class MapUtilitiesTest {
	
	MapUtilities map_test = new MapUtilities();
	
	@Test
	public void emptyTest() throws NullMapException { 
		
		HashMap<String, String> map1 = new HashMap<String,String>();
		HashMap<String, String> map2 = new HashMap<String,String>();
		assertEquals(map_test.commonKeyValuePairs(map1, map2),0);
		
		map1.put("Map2", "stillEmpty");
		assertEquals(map_test.commonKeyValuePairs(map1, map2),0);
		
	}
		
	@Test (expected = NullMapException.class)
	public void nullTest() throws NullMapException{ 
		HashMap<String, String>map1 = null;
		HashMap<String, String> map2 = null;	
		int test = map_test.commonKeyValuePairs(map1, map2);
	}
	
	@Test
	public void realTests() throws NullMapException { 
		HashMap<String, String> map1 = new HashMap<String,String>();
		HashMap<String, String> map2 = new HashMap<String,String>();
		
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Bob", "Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		
		map2.put("Mary", "Ecastic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Superb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
		
		assertEquals(map_test.commonKeyValuePairs(map1, map2),2);
		
		map2.put("Face", "Mario");
		assertEquals(map_test.commonKeyValuePairs(map1, map2),2);
		
		map2.clear();
		assertEquals(map_test.commonKeyValuePairs(map1, map2),0);
		
		map2.put("Alice", "Healthy");
		assertEquals(map_test.commonKeyValuePairs(map1, map2),1);
		
		map2.put("Felix", "Sick");
		map2.put("Chuck", "Fine");
		assertEquals(map_test.commonKeyValuePairs(map1, map2),3);
		
		map2.put("Mary", "Ecastic");
		map2.put("Bob", "Happy");
		assertEquals(map_test.commonKeyValuePairs(map1, map2),5);
		
		map1.put("LSP", "Final");
		assertEquals(map_test.commonKeyValuePairs(map1, map2),5);

	}
	
}

