package Random;

import java.util.HashMap;

/*
 * 
 * Problem 1:																									
Given list of processes where each value representing memory consuption by the process 
and given one variable m representing number of processes to be removed. We need to delete
m number of processes from the list in contiguous manner and return minimum amount of 
main memory used by all the proccesses running after deleting contiguous segment of processes.																									
																									
Example - processes = {10,4,8,13,20}, m = 2;																									
output = 22 [removing 13 and 20 as its consuming large memory]	
 */

public class amazon1 {

    public void get(int[] processes, int step) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int counter = 0;
        for (int i : processes) {
            map.put(i, counter);
            counter++;
        }
    }

    public static void main(String[] args) {
        int[] processes = { 10, 4, 8, 13, 20 };
        int step = 2;
        amazon1 a = new amazon1();
        a.get(processes, step);
    }
}
