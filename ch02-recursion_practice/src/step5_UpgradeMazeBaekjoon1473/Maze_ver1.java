package step5_UpgradeMazeBaekjoon1473;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Maze_ver1 {
	
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	
	private static String[][] maze;
	private static int second;
	private static final String ALL_PATHWAY_COLOR = "A";
	private static final String HORIZONTAL_PATHWAY_COLOR = "D";
	private static final String VERTICAL_PATHWAY_COLOR = "C";
	private static final String WALL_COLOR = "B";
	private static final String PATH_COLOR = "F";
	private static final String BLOCKED_COLOR = "E";
	
	public static boolean findMazePath(int x, int y){
		if(x<0 || y<0 || x>=maze.length || y>=maze[x].length)
			return false;
		else if (maze[x][y].equals(WALL_COLOR) 
				|| maze[x][y].equals(PATH_COLOR) 
				|| maze[x][y].equals(BLOCKED_COLOR) )
			return false;
		else if (x==maze.length-1 && y==maze[x].length-1){
			maze[x][y] = PATH_COLOR;
			return true;
		} else {
			maze[x][y] = PATH_COLOR;
			if (findMazePath(x-1, y) || findMazePath(x,y+1) 
					|| findMazePath(x+1, y) || findMazePath(x, y-1)){
				second++;
				return true;
			}
			maze[x][y] = BLOCKED_COLOR;		// dead end
			return false;
		}
	}
	
	public static void main(String[] args) throws IOException {
		String[] mazeSize = reader.readLine().split(" ");
		maze = new String[Integer.parseInt(mazeSize[0])][Integer.parseInt(mazeSize[1])];
		for(int i=0; i<maze.length; i++){
			String[] row = reader.readLine().split("");
			for(int j=0; j<maze[i].length; j++){
				maze[i][j]=row[j];
			}
		}
		
		findMazePath(0, 0);
		
		System.out.println();
		for(int i=0; i<maze.length; i++){
			for(int j=0; j<maze[i].length; j++){
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
		System.out.println(second);
	}

}
