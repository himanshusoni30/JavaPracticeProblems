package geekforgeeks.stringproblems;

import java.util.HashMap;
import java.util.Set;

public class Pangram {
    public boolean isPangram(String s){
        boolean flag=false;
        int[] count = new int[123];

        for(int i=0;i<s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            count[c]++;
        }
        for(int j=97; j<=122; j++){
            if(count[j] < 1){
                return false;
            }else{
                flag = true;
            }
        }
        return flag;
    }

    public boolean isPangramMethod2(String s){
        boolean b = false;
        boolean[] mark = new boolean[26];
        int index=0;
        for(int i=0;i<s.length();i++){
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                index = s.charAt(i) - 'A';
            }else if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                index = s.charAt(i) - 'a';
            }else {
                continue;
            }
            mark[index]=true;
        }

        for(int i=0; i < 26; i++){
            if(mark[i]==false){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Pangram p = new Pangram();
//        String s = "The quick brown fox jumps over the dog";
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println("Is string '"+s+"' a pangram? "+p.isPangram(s));
        System.out.println("Is string '"+s+"' a pangram using method 2? "+p.isPangramMethod2(s));
    }
}
