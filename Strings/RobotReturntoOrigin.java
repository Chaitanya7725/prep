package strings;

import java.util.HashMap;
import java.util.Map;

public class RobotReturntoOrigin {

    public static void main(String[] args) {
        String moves="UD";
        System.out.println(judgeCircle(moves));//true

        String moves1="LL";
        System.out.println(judgeCircle(moves1));//false

        String moves2="RRDD";
        System.out.println(judgeCircle(moves2));//false

        String moves3="LDRRLRUULR";
        System.out.println(judgeCircle(moves3));//false
    }

    private static boolean judgeCircle(String moves) {
        int udcount=0;
        int lrcount=0;
        Map<Character,Integer> records=new HashMap<>();
        for (char sign : moves.toCharArray()){
            if(sign=='U')
                records.put(sign,records.getOrDefault(sign,0)+1);
            else if(sign=='D')
                records.put('U',records.getOrDefault('U',0)-1);
            else if(sign=='L')
                records.put(sign,records.getOrDefault(sign,0)+1);
            else if(sign=='R')
                records.put('L',records.getOrDefault('L',0)-1);
        }
        for (char keys : records.keySet())
            if(keys=='U' || keys=='D')
                udcount+=records.get(keys);
            else if (keys=='L' || keys=='R')
                lrcount+=records.get(keys);
        return lrcount!=0 || udcount!=0 ? false : true;
    }

}
