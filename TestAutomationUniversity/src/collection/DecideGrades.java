package collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DecideGrades {
	
	public static void main(String args[]) {
		compareGrades();
	}
	
	public static void compareGrades() {
		Map<String,Integer> originalGrades = TestResults.getOriginalGrades();
		Map<String,Integer> makeUpGrades = TestResults.getMakeUpGrades();
		
		Set<String> keys = originalGrades.keySet();
		Iterator<String> i = keys.iterator();
		
		while(i.hasNext()) {
			String k = i.next();
			int original = originalGrades.get(k);
			int makeUp = makeUpGrades.get(k);
			if(original >= makeUp) {
				System.out.println("Grade of student name: "+k+", is: "+original);
			}
			else if(original < makeUp) {
				System.out.println("Grade of student name: "+k+", is: "+makeUp);
			}
		}
	}
}
