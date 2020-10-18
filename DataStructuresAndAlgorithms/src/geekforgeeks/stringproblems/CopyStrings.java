package geekforgeeks.stringproblems;

public class CopyStrings {
    public String copyStrIterativeMethod(String str){
        if(str.length()<1){
            return "";
        }
        String result = "";
        int i=0;
        while(i < str.length()){
            result = result + str.charAt(i);
            i++;
        }
        return result;
    }

    public String copyStrRecursiveMethod(String str){
        int length = str.length();
        if(length<1){
            return "";
        } else if(length==1){
            return str;
        }
        String s1 = copyStrRecursiveMethod(str.substring(1,length));
        char c = str.charAt(0);
        return c + s1;
    }

    public static void main(String[] args) {
        CopyStrings cs = new CopyStrings();
        System.out.println("Copied string using iterative method: "+cs.copyStrIterativeMethod("ITERATION"));
        System.out.println("Copied string using recursive method: "+cs.copyStrRecursiveMethod("RECURSION"));
        String s = "A";
        System.out.println(s.substring(1,1));
    }
}
