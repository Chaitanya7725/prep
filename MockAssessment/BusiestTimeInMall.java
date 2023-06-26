public class BusiestTimeinMall {

    public static void main(String[] args) {

        int [][] data={
                {1487799425, 14, 1},
                {1487799425, 4,  0},
                {1487799425, 2,  0},

                {1487800378, 10, 1},//Answer

                {1487801478, 18, 0},
                {1487801478, 18, 1},

                {1487901013, 1,  0},

                {1487901211, 7,  1},
                {1487901211, 7,  0}
        };
        System.out.println(findBusiestPeriod(data));
    }

    private static int findBusiestPeriod(int[][] data) {
        if(data.length==1) return data[0][0];
        int time=data[0][0];
        int count=data[0][1];
        int max=Integer.MIN_VALUE;
        int maxTime=0;
        for (int i = 1; i < data.length; i++) {
            if(time!=data[i][0]){
                time=data[i][0];
                if(count>max){
                    max=count;
                    maxTime=data[i-1][0];
                }
            }
            count = data[i][2]==1 ? count + data[i][1] : count - data[i][1];
            if(i == data.length-1){
                if(count>max){
                    max=count;
                    maxTime=data[i-1][0];
                }
            }
        }
        return maxTime;
    }

}
