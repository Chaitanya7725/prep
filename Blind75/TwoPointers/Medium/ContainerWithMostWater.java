package Blind75.TwoPointers.Medium;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
//        int result=0;
//        int area=0;
//        for (int l = 0; l < height.length; l++) {
//            for (int r = l + 1; r < height.length ; r++) {
//                area=(r-l)*Math.min(height[l],height[r]);
//                result=Math.max(area,result);
//            }
//        }
//        return result;
        int result=0;
        int left=0;
        int right=height.length-1;
        for (int i = 0; i < height.length; i++) {
            int area=(right - left) * Math.min(height[left],height[right]);
            result=Math.max(area,result);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return result;
    }

}
