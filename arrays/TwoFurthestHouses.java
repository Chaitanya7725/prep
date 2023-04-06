package arrays;

public class TwoFurthestHouses {

    public static void main(String[] args) {
        int[] colors={1,1,1,6,1,1,1};
        System.out.println(maxDistance(colors));//3

        int[] colors1={1,8,3,8,3};
        System.out.println(maxDistance(colors1));//4

        int[] colors2={0,1};
        System.out.println(maxDistance(colors2));//4
    }

    private static int maxDistance(int[] colors) {
        int status1=0;
        int status2=0;
        for (int i = 0; i < colors.length; i++)
            if(colors[0]!=colors[i])
                status1=Math.abs(i-0);
        for (int i = colors.length-1; i > 0; i--)
            if(colors[colors.length-1]!=colors[i])
                status2=Math.abs(colors.length-1)-i;
        return status1>status2?status1:status2;
    }

}
