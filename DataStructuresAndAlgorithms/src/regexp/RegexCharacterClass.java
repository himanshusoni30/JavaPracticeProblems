package regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCharacterClass {
    public static void main(String[] args) {
        List<String> regexPattern = new ArrayList<String>();
        regexPattern.add("abc"); //either lower case a, b, or c
        regexPattern.add("^abc"); // except lower case a, b, or c
        regexPattern.add("a-z"); // lower case between a to z
        regexPattern.add("A-Z"); // upper case between A to Z
        regexPattern.add("a-zA-Z"); // lower case between a to z or upper case between A to Z
        regexPattern.add("0-9"); // only digits between 0 to 9
        regexPattern.add("a-zA-Z0-9");// lower case between a to z or upper case between A to Z or digits between 0 to 9
        regexPattern.add("^a-zA-Z0-9"); // except lower case between a to z or upper case between A to Z or digits between 0 to 9
        for(String s:regexPattern){
            Pattern pattern = Pattern.compile("["+s+"]");
            Matcher matcher = pattern.matcher("a7b@z#9R");

            while(matcher.find()){
                System.out.println(matcher.start()+" -------> "+ matcher.group());
            }
            System.out.println("----------------------------");
        }
    }

}
