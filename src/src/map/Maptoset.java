package map;

import java.util.HashMap;
import java.util.HashSet;

public class Maptoset {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h=new HashMap<>();
		h.put(109,"bob" );	
		h.put(105,"pop" );	
		h.put(108,"kpr" );	
		//HashMap<String,Integer> h=new HashMap<>();
	//	h.put("kpr",111 );	
	// h.put("sri",112 );	
	
		
		HashSet<String> hashset=new HashSet<>(h.values());
		System.out.println(hashset);
		HashSet<Integer> hash=new HashSet<Integer>(h.keySet());
		System.out.println(hash);
		
	
	}

}
