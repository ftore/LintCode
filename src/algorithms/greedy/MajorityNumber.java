package algorithms.greedy;

import java.util.List;

public class MajorityNumber {
	public static void main(String[] args) {
		
	}
	
	// Moore¡¯s Voting Algorithm
	private static int findCandidate(List<Integer> l) {
		if(l.size() == 0) return -1;
		int n = l.size();
		int candidate = l.get(0);
		int counter = 0;
		
		for(int i : l) {
			if(counter == 0) {
				candidate = i;
				counter = 1;
			} else if(candidate == i) {
				counter++;
			} else {
				counter--;
			}
		}
		
		counter = 0;
		for(int i : l) {
			if(i == candidate) counter++;
		}
		
		if(counter < (n + 1) / 2) return -1;
		return candidate;
	}
	
}
