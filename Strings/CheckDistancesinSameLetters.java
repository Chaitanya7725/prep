package strings;

import java.util.HashSet;
import java.util.Set;

public class CheckDistancesinSameLetters {

    static String alpha="abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        String s="abaccb";
        int[] distance={1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s,distance));//true

        String s1="aa";
        int[] distance1={1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s1,distance1));//false

        String s2="abaccb";
        int[] distance2={1,2,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s2,distance2));//false

        String s3="abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzza";
        int[] distance3={50,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s3,distance3));//true

        String s4="abcabc";
        int[] distance4={0,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println(checkDistances(s4,distance4));//false
    }

    private static boolean checkDistances(String s, int[] distance) {
        boolean status=true;
        Set<Character> records=new HashSet<>();
        for (int i = 0; i < s.length(); i++)
            if(records.size()<(s.length()/2)){
                records.add(s.charAt(i));
                int first=s.indexOf(s.charAt(i));
                int last=s.lastIndexOf(s.charAt(i));
//                int gap=Integer.parseInt(String.valueOf(distanceString.charAt(alpha.indexOf(s.charAt(i)))));
                int gap=distance[alpha.indexOf(s.charAt(i))];
                if((last-1-first) != gap)
                    return false;
            }
        return status;
    }

}
