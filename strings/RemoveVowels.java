package strings;

public class RemoveVowels {

//    https://leetcode.com/problems/remove-vowels-from-a-string/
    public static void main(String[] args) {
        String s="leetcodeisacommunityforcoders";
        System.out.println(removeVowels(s));
    }

    private static String removeVowels(String s) {
        String result=s.replace("a","").replace("e","").replace("i","").
                replace("o","").replace("u","");
        return result;


/*        String removedVowels="";
        char[] charArray=s.toCharArray();
        for ( char c:charArray)
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
                removedVowels+=c;
        return removedVowels;*/

    }

}
