/**
 * Created by owen on 2017/8/10.
 */

/**
 * 设计一个函数判断矩阵中是否存在一条包含某字符串的路径（本算法采用回溯法）
 */
public class PathInMatrix {

    public boolean containPath(String path, char[][] matrix) {
        if (path == null || matrix == null) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        //pathLength来追踪查找到字符串中的第几个字符
        int pathLength = 0;
        //维护一个二维数组来标记已经访问和未访问元素
        boolean[][] visited = new boolean[rows][cols];
        //以矩阵中每个字符为开头都进行尝试
        for (int row = 0; row < rows; rows++) {
            for (int col = 0; col < cols; col++) {
                if (contains(path, matrix, row, col, pathLength, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean contains(String path, char[][] matrix, int row, int col, int pathLenth, boolean[][] visited) {

        boolean hashPath = false;
        if (row > 0 && row < matrix.length && col > 0 && col < matrix[0].length
                && matrix[row][col] == path.charAt(pathLenth) && !visited[row][col]) {
            visited[row][col] = true;
            ++pathLenth;
            hashPath = contains(path, matrix, row + 1, col, pathLenth, visited) ||
                    contains(path, matrix, row - 1, col, pathLenth, visited) ||
                    contains(path, matrix, row, col + 1, pathLenth, visited) ||
                    contains(path, matrix, row, col - 1, pathLenth, visited);
            //如果没有路可走，则将当前标记为未访问，并回退
            if (!hashPath) {
                visited[row][col] = false;
                --pathLenth;
            }
        }
        return hashPath;
    }
}
