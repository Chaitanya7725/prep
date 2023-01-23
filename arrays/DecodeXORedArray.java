package arrays;

import java.util.Arrays;

public class DecodeXORedArray {
    //https://leetcode.com/problems/decode-xored-array/
    public int[] decode(int[] encoded, int first) {
        int [] decoded=new int[encoded.length+1];
        decoded[0]=first;
        for (int i = 0; i <encoded.length; i++){
            decoded[i+1]=decoded[i]^encoded[i];
            System.out.println(decoded[i+1]+" "+encoded[i]+"="+decoded[i]);
        }
        return decoded;
    }

    public static void main(String[] args) {
        DecodeXORedArray d = new DecodeXORedArray();
//        int[] encoded = { 1,2,3 };
//        int first = 1;
        int[] encoded = {6,2,7,3 };
        int first = 4;
        int [] decoded=d.decode(encoded, first);
        System.out.println(Arrays.toString(decoded));
    }

}
