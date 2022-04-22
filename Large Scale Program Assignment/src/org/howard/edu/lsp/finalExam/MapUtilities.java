package org.howard.edu.lsp.finalExam;
import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
	public static int commonKeyValuePairs(
		    HashMap<String, String> map1,
		    HashMap<String, String> map2)throws NullMapException {
		    int result = 0;
		    for (Map.Entry<String, String> words: map1.entrySet()){
		      String Thekey = words.getKey();
		      String Theval = words.getValue();
		      if (map2.containsKey(Thekey)){
		        String word2 = map2.get(Thekey);
		        if (Theval.equals(word2)){
		          result++;
		        }
		      }
		    }
		    return result;
		    
	
		    }
		    
	
		    
	
		}


