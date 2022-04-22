package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2)throws NullMapException {
    	if(map1 == null || map2 == null) {
    		throw new NullMapException("One or both maps are null!");
    		}
    	if(map1.isEmpty() || map2.isEmpty()) {return 0;}
    	int[] target = {0};
    	map1.forEach(
    			(key,value)
    			->{if(map2.containsKey(key)) {
    				if (map2.get(key) == value) {
    					target[0]++;
    				}	
    			}}
    			);
    	return target[0];
    }
    
 
}
