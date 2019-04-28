import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		// TODO Auto-generated method stub
		int count = 0;
		if(hashmap1.get("Alice") == hashmap2.get("Alice")) {
			count++;
		}
		if(hashmap1.get("Mary") == hashmap2.get("Mary")) {
			count++;
		}
		if(hashmap1.get("Bob") == hashmap2.get("Bob")) {
			count++;
		}
		if(hashmap1.get("Chuck") == hashmap2.get("Chuck")) {
			count++;
		}
		if(hashmap1.get("Felix") == hashmap2.get("Felix")) {
			count++;
		}
		return count;
}
}
