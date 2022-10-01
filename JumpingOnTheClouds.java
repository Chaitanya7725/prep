import java.util.ArrayList;
import java.util.List;

/**
 * JumpingOnTheClouds
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 */
public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int moves = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i + 2) == 0) {
                i += 2;
                moves++;
                System.out.print(i + " ");
            } else if (c.get(i + 1) == 0) {
                i += 1;
                moves++;
                System.out.print(i + " ");
            }
        }
        return moves;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>() {
            {
                add(0);
                add(1);
                add(0);
                add(0);
                add(0);
                add(1);
                add(0);
            }
        };
        int c = jumpingOnClouds(input);
        System.out.println(c);
    }

}