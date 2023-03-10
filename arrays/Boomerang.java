package arrays;

public class Boomerang {

    public static void main(String[] args) {

        int[][] points={{1,1},{2,3},{3,2}};
        System.out.println(isBoomerang(points));//true

        int[][] points1={{1,1},{2,2},{3,3}};
        System.out.println(isBoomerang(points1));//false

        int[][] points2={{0,0},{1,0},{2,2}};
        System.out.println(isBoomerang(points2));//true

        int[][] points3={{0,0},{1,1},{1,1}};
        System.out.println(isBoomerang(points3));//false

        int[][] points4={{1,1},{2,3},{3,2}};
        System.out.println(isBoomerang(points4));//true

        int[][] points5={{0,0},{0,2},{2,1}};
        System.out.println(isBoomerang(points5));//true

        int[][] points6={{0,0},{1,2},{0,1}};
        System.out.println(isBoomerang(points6));//true

    }

    private static boolean isBoomerang(int[][] points) {
//        int ab= Math.abs(points[1][0]-points[0][0])!=0 ? Math.abs(points[1][1]-points[0][1]/points[1][0]-points[0][0]) : -1;
//        int bc= Math.abs(points[2][0]-points[1][0])!=0 ? Math.abs(points[2][1]-points[1][1]/points[2][0]-points[1][0]) : -1;
//        int ac= Math.abs(points[1][0]-points[0][0])!=0 ? Math.abs(points[2][1]-points[1][1]/points[1][0]-points[0][0]) : -1;
//        System.out.println(ab+" "+bc+" "+ac);
        int one1=points[0][0]-points[1][0];
        int two1=points[1][0]-points[2][0];
        int one2=points[0][1]-points[1][1];
        int two2=points[1][1]-points[2][1];
//        System.out.println(one1+" "+one2+" "+two1+" "+two2+"->"+(one1*two2)+" "+(two1*one2)+"="+((one1*two2)-(two1*one2))/(float)2);
        return ((one1*two2)-(two1*one2))/(float)2==0 ? false:true;
//
//        if((ab==-1 && bc==-1) || (bc==-1 && ac==-1) || (ac==-1 && ab==-1))
//            return true;
//        if((ab!=bc || bc!=ac))
//            return true;
//        return true;
    }
}
