/**
 * Created by owen on 2017/8/11.
 */
public class RobotMovingRange {

    public int movingCount(int thredhold, int rows, int cols) {
        //检查输入有效性
        if (rows <= 0 || cols <= 0 || thredhold < 0)
            return 0;
        //创建标记矩阵
        boolean[][] visited = new boolean[rows][cols];
        int count = countCore(thredhold, 0, 0, rows, cols, visited);

        return count;
    }

    //其实回溯法类似于穷举，每进入一个格就把这个格的前后左右格能够访问的格子数加起来。
    private int countCore(int threadhold, int row, int col, int rows, int cols, boolean[][] visited) {
        int count = 0;
        if (check(threadhold, rows, cols, row, col, visited)) {
            visited[row][col] = true;
            count = 1 + countCore(threadhold, row + 1, col, rows, cols, visited) +
                    countCore(threadhold, row - 1, col, rows, cols, visited) +
                    countCore(threadhold, row, col + 1, rows, cols, visited) +
                    countCore(threadhold, row, col - 1, rows, cols, visited);
        }
        return count;
    }

    //判断机器人是否能够进入方格
    private boolean check(int threadhold, int rows, int cols, int row, int col, boolean[][] visited) {
        if (row >= 0 && row < rows && col >= 0 && col < cols && !visited[row][col] && getDigitSum(row) + getDigitSum(col) <= threadhold)
            return true;
        return false;
    }

    private int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }


}
