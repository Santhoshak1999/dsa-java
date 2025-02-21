import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
	public static void main(String[] args) {
		int[][] maze = { 
				{ 1, 0, 0, 0 }, 
				{ 1, 1, 0, 1 }, 
				{ 1, 1, 0, 0 }, 
				{ 0, 1, 1, 1 } };

		List<String> paths = findPath(maze);
		for (String path : paths) {
			System.out.println(path);
		}
	}

	private static List<String> findPath(int[][] maze) {
		// TODO Auto-generated method stub
		int n = maze[0].length;		
		boolean[][] visited = new boolean[n][n];//default all values are 0
		String path = "";
		List<String> ans = new ArrayList<String>();
		// row,column
		getAns(maze, 0, 0, ans, path);
		return ans;
	}

	private static void getAns(int[][] maze, int r, int c, List<String> ans, String path) {
		// TODO Auto-generated method stub
		int n = maze.length;
		if (r < 0 || c < 0 || r >= n || c >= n || maze[r][c] == 0 || maze[r][c] == -1) {
		    return;
		}

		if (r == n - 1 && c == n - 1) {
			ans.add(path);
			return;
		}
		maze[r][c] = -1;

		getAns(maze, r + 1, c, ans, path + "D");
		getAns(maze, r, c - 1, ans, path + "L");
		getAns(maze, r - 1, c, ans, path + "U");
		getAns(maze, r, c + 1, ans, path + "R");

		maze[r][c] = 1;

	}

}