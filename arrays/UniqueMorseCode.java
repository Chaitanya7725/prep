package arrays;

import java.util.*;

public class UniqueMorseCode {

    //https://leetcode.com/problems/unique-morse-code-words
    public static void main(String[] args) {
        String [] words={"gin","zen","gig","msg"};//2
        System.out.println(uniqueMorseRepresentations(words));

        String [] words1={"a"};//1
        System.out.println(uniqueMorseRepresentations(words1));

        String [] words2={"rwjje","aittjje","auyyn","lqtktn","lmjwn"};//1
        System.out.println(uniqueMorseRepresentations(words2));
    }

    private static int uniqueMorseRepresentations(String[] words) {
        String [] allWords={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<Character,Integer> records=new HashMap<>(){
            {
                put('a',0);put('b',1);put('c',2);put('d',3);put('e',4);put('f',5);put('g',6);put('h',7);put('i',8);
                put('j',9);put('k',10);put('l',11);put('m',12);put('n',13);put('o',14);put('p',15);put('q',16);
                put('r',17);put('s',18);put('t',19);put('u',20);put('v',21);put('w',22);put('x',23);put('y',24);put('z',25);
            }
        };
        Set<String> uniqueCoded=new HashSet<>();
        for (String word : words) {
            String coded="";
            for (char character : word.toCharArray())
                coded+=allWords[records.get(character)];
            uniqueCoded.add(coded);
        }
        return uniqueCoded.size();
    }


}
