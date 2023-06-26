package com.example.us.higlobe.Summingevennumbers.Helper;

public class GetIndex {

    public static int search(int[] numbers, int l, int r, int target) {
        if(l<=r){
            int mid=(l+(r))/2;
            if(numbers[mid]==target)
                return mid;
            if(numbers[mid]<target)
                return search(numbers,mid+1,r,target);
            return search(numbers,l,mid-1,target);
        }
        return -1;
    }

}
