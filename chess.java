public class chess {
    public static void main(String[] args) {
        int[][] dimensions;
        int rowd = 9;
        int cold = 9;
        int srow = 4;
        int scol = 4;
        int drow = 4;
        int dcol = 8;
        int moves;
        for (int i = 1; i <= rowd; i++) {
            for (int j = 1; j <= cold; j++) {
                if (i != srow && j != scol) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
