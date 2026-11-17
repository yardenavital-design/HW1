public class Assignment01Q05 {
public static int findShortestPath(int[][] matrix, int i, int j) {
    int n = matrix.length;
    boolean[] visited = new boolean[n];
    boolean[] level = new boolean[n];
    level[i] = true;
    visited[i] = true;
    return findFromLevel(matrix, level, visited, j, 0);
}

private static int findFromLevel(int[][] matrix, boolean[] level, boolean[] visited, int j, int depth) {
    int n = matrix.length;

    if (level[j]) {
        return depth;
    }

    boolean[] next = new boolean[n];
    boolean foundNew = false;
    for (int v = 0; v < n; v++) {
        if (level[v]) {
            for (int u = 0; u < n; u++) {
                if (matrix[v][u] == 1 && !visited[u]) {
                    next[u] = true;
                    visited[u] = true;
                    foundNew = true;
                }
            }
        }
    }

    if (!foundNew) {
        return -1;
    }
    return findFromLevel(matrix, next, visited, j, depth + 1);
}

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}

