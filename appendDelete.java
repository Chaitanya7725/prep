/**
 * appendDelete
 */
public class appendDelete {

    public static String appendAndDelete(String s, String t, int k) {
        // int slength = s.length();
        // int tlength = t.length();
        // int length = 0;
        // if (slength <= tlength) {
        // length = slength;
        // if (t.contains(s)) {
        // System.out.println(s.lastIndexOf(t));
        // if (length - (tlength - t.lastIndexOf(s)) <= k) {
        // return "Yes";
        // }
        // }
        // } else {
        // length = tlength;
        // if (s.contains(t)) {
        // System.out.println(length - s.lastIndexOf(t));
        // if (s.lastIndexOf(t) <= k || length - (slength - s.lastIndexOf(t)) <= k) {
        // return "Yes";
        // }
        // // System.out.println(slength - s.indexOf(t));
        // }
        // }
        // int boundary = 0;
        // for (int i = 0; i < length; i++) {
        // if (s.charAt(i) != t.charAt(i)) {
        // System.out.println(i + " " + s.charAt(i) + " " + t.charAt(i));
        // boundary = i;
        // break;
        // }
        // }
        // if ((slength - boundary) + (tlength - boundary) <= k) {
        // return "Yes";
        // } else {
        // return "No";
        // }
        int check = s.length() < t.length() ? 0 : 1;
        String lower = "";
        String higher = "";
        if (check == 0) {
            lower = s;
            higher = t;
        } else {
            lower = t;
            higher = s;
        }

        if (higher.contains(lower)) {
            int boundary = 0;
            for (int i = 0; i < lower.length(); i++) {
                if (higher.charAt(i) != lower.charAt(i)) {
                    boundary = i;
                    if (boundary <= k) {
                        return "Yes";
                    } else {
                        return "No";
                    }
                }
                if (i == lower.length() - 1) {
                    if (higher.length() - (i + 1) <= k)
                        return "Yes";
                    else
                        return "No";
                }
            }
        } else {
            for (int i = 0; i < higher.length(); i++) {
                if (higher.charAt(i) != lower.charAt(i)) {
                    if ((higher.length() - i) + (lower.length() - i) <= k) {
                        return "Yes";
                    }
                    break;
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        String s = "hackerhappy";
        String t = "hackerrank";
        int k = 10;
        // String t = "aaaaaaaaaa";
        // String s = "aaaaa";
        // int k = 4;
        // String s = "zzzzz";
        // String t = "zzzzzzzzz";
        // int k = 3;
        System.out.println(appendAndDelete(s, t, k));
    }

}