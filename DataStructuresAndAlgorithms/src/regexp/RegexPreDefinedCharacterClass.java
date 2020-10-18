package regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPreDefinedCharacterClass {
    public static void main(String[] args) {
        List<String> regexPattern = new ArrayList<String>();
        regexPattern.add("\\s"); //search for space
        regexPattern.add("\\S"); // except space character any character
        regexPattern.add("\\d"); // digits -> similar to [0-9]
        regexPattern.add("\\D"); // except digits any character
        regexPattern.add("\\w"); // word character -> similar to alphanumeric [a-zA-Z0-9]
        regexPattern.add("\\W"); // except word character -> similar to except alphanumeric [^a-zA-Z0-9]
        regexPattern.add(".");// all characters
        for(String s:regexPattern){
            Pattern pattern = Pattern.compile(s);// square braces are not required
            Matcher matcher = pattern.matcher("a7b@ z#9R ");

            while(matcher.find()){
                System.out.println(matcher.start()+" -------> "+ matcher.group());
            }
            System.out.println("----------------------------");
        }
    }
}
