package Blind75.ArraysandHashing.Medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeandDecodeStrings {

    public static void main(String[] args) {
        List<String> strs=new ArrayList<>(){{
            add(0,"Hello");
            add(1,"World");
        }};
        EncodeandDecodeStrings codec = new EncodeandDecodeStrings();
        System.out.println(codec.decode(codec.encode(strs)));

        List<String> strs1=new ArrayList<>(){{
            add(0,"");
        }};
        codec = new EncodeandDecodeStrings();
        System.out.println(codec.decode(codec.encode(strs1)));

        List<String> strs2=new ArrayList<>(){{
            add(0,"(}");
            add(1,"{:y5");
        }};
        codec = new EncodeandDecodeStrings();
        System.out.println(codec.decode(codec.encode(strs2)));
    }

    public String encode(List<String> strs) {
        String encoded="";
        for(int i=0;i<strs.size();i++){
            encoded+=strs.get(i).length()+"#"+strs.get(i);
        }
        return encoded;
    }

    public List<String> decode(String s) {
        List<String> decoded=new ArrayList<>();
        int start=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                int end=Integer.valueOf(String.valueOf(s.charAt(i)));
                if(j==0)
                    decoded.add(s.substring(start+2,end+2));
                else
                    decoded.add(s.substring(start+3,end+3));
                s=s.substring(end+1);
                i=0;
                j++;
            }
        }
        return decoded;
    }


}
