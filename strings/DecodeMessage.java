package strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DecodeMessage {

    public static void main(String[] args) {
        String key="the quick brown fox jumps over the lazy dog";
        String message="vkbs bs t suepuv";
        System.out.println(decodeMessage(key,message));

        String key1="eljuxhpwnyrdgtqkviszcfmabo";
        String message1="zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        System.out.println(decodeMessage(key1,message1));
    }

    private static String decodeMessage(String key, String message) {
        String result="";
        Map<Character,Character> archive=new LinkedHashMap<>();
        key=key.replace(" ","");
        String alphabets="abcdefghijklmnopqrstuvwxyz";
        int j=0;
        for (int i=0;i<key.length();i++) {
            if(archive.get(key.charAt(i))==null){
                archive.put(key.charAt(i),alphabets.charAt(j));
                j++;
            }
        }
        for (char character : message.toCharArray()) {
            if(character==' ')
                result+=" ";
            else
                result+=archive.get(character);
        }
        return result;
    }

}
