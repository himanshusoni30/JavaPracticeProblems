package regexp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ab");
		Matcher m = p.matcher("ababbaba");
		
		while(m.find()) {
			count++;
			System.out.print("Starting index of pattern: "+m.start()+" | ");
			System.out.print("End index of pattern: "+m.end()+" | ");
			System.out.println("Pattern that was matched: "+m.group());
		}
		
		System.out.println("Number of occurrence of the pattern in target string: "+count);
	}
}
