public class Judge {


    //
    public int findJudge (int N, int [][] trust) {
        int[] gather = new int[N];
        for (int[] x: trust) {
            gather[x[0] - 1]--;
            gather[x[1] - 1]++;
        }
        for (int y = 0; y != N; ++y) {
            if (gather[y] == N - 1) {
                return y + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Judge j = new Judge();
        int[][] insert = {{1, 3},{2,3}};
        int judge = j.findJudge(3, insert);
        System.out.println(judge);
    }
}
