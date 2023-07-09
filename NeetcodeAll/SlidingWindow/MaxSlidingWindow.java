package SlidingWindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MaxSlidingWindow {

    public static void main(String[] args) {
        int [] a={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int k=3;
        System.out.println(Arrays.toString(maxSlidingWindow(a,k)));
    }

    private static int [] maxSlidingWindow(int [] a,int k){
        int n=a.length;
        int [] r=new int[n-k+1];
        int ri=0;
        Deque<Integer> q=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            //remove out of range elements
            if(!q.isEmpty() && q.peek()==i-k){
                q.poll();
            }

            while(!q.isEmpty() && a[q.peekLast()]<=a[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i>=k-1)
                r[ri++]=a[q.peek()];
        }
        return r;
    }
}
