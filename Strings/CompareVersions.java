package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareVersions {

    public static void main(String[] args) {
        String version1="1.01";
        String version2="1.001";//0
        System.out.println(compareVersion(version1,version2));

        String version3="1.0";
        String version4="1.0.0";//0
        System.out.println(compareVersion(version3,version4));

        String version5="0.1";
        String version6="1.1";//-1
        System.out.println(compareVersion(version5,version6));

        String version7="1.0.1";//1
        String version8="1";
        System.out.println(compareVersion(version7,version8));

        String version9="7.5.2.4";
        String version10="7.5.3";//-1
        System.out.println(compareVersion(version9,version10));

        String version11="1.1";
        String version12="1";//-1
        System.out.println(compareVersion(version11,version12));
    }

    private static int compareVersion(String version1, String version2) {
//        int status=0;
//        String[] one = new String[0];
//        String[] two = new String[0];
//        if(version1.contains("\\."))
//            one=version1.split("\\.");
//        else{
//            one = new String[1];
//            one[0]=version1;
//        }
//        if(version2.contains("\\."))
//            two=version2.split("\\.");
//        else{
//            two = new String[1];
//            two[0]=version2;
//        }
//        List<String> small = new ArrayList<>();
//        List<String> large = new ArrayList<>();
//        boolean here=false;
//        if(one.length!=two.length){
//            if(one.length > two.length){
//                here=true;
//                for (int i = 0; i < two.length; i++)
//                    small.add(two[i]);
//                for (int i = 0; i < one.length; i++)
//                    large.add(one[i]);
//            }else{
//                for (int i = 0; i < one.length; i++)
//                    small.add(one[i]);
//                for (int i = 0; i < two.length; i++)
//                    large.add(two[i]);
//            }
//            int smallSize=small.size();
//            int largeSize=large.size();
//            for (int i = 0; i < largeSize-smallSize; i++) {
//                small.add(String.valueOf(0));
//            }
//        }
//        else{
//            for (int i = 0; i < two.length; i++){
//                status=two[i].compareTo(one[i]);
//                if(status!=0)
//                    return status;
//            }
//        }
//        for (int i = 0; i < small.size(); i++) {
//            status=0;
//            if(here)
//                status=large.get(i).compareTo(small.get(i));
//            else
//                status=small.get(i).compareTo(large.get(i));
//            if(status!=0)
//                return status;
//        }
//        return status;

        int status=0;

        String [] v1=version1.split("\\.");
        String [] v2=version2.split("\\.");
        int n1=v1.length;
        int n2=v2.length;
        int i1,i2;
        for (int i = 0; i < Math.max(n1,n2); i++) {
            i1=i<n1?Integer.parseInt(v1[i]):0;
            i2=i<n2?Integer.parseInt(v2[i]):0;
            if(i1!=i2)
                return i1 > i2 ? 1 : -1;
        }
        return status;
    }

}
