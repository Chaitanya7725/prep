public class richestMan {

    public int maximumWealth(int[][] accounts) {
        int rich = 0;
        int sum;
        for (int i = 0; i < accounts.length; i++) {
            sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > rich) {
                rich = sum;
            }
        }
        return rich;
    }

    public static void main(String[] args) {
        richestMan r = new richestMan();
        int[][] accounts = new int[][] { { 1, 2, 3 }, { 3, 2, 1 } };
        r.maximumWealth(accounts);
    }
}
