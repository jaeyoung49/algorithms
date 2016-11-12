package step2_counting_cells_in_a_blob;

public class CountCellsInABlob {
	private static int n=8;
	private static int[][] grid = {
			{1, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 0, 1, 0, 0},
			{1, 1, 0, 0, 1, 0, 1, 0},
			{0, 0, 0, 0, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 0},
			{0, 1, 0, 1, 0, 1, 0, 0},
			{1, 0, 0, 0, 1, 0, 0, 1},
			{0, 1, 1, 0, 0, 1, 1, 1},
	};
	
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	
	public static int countCells(int x, int y){
		int result = 0;
		
		if(x<0 || x>=n || y<0 || y>=n)
			return 0;
		else if(grid[x][y] != IMAGE_COLOR)
			return 0;
		else {
			grid[x][y] = ALREADY_COUNTED;
			result = 1 + countCells(x-1, y) + countCells(x-1, y+1)
			+ countCells(x, y+1) + countCells(x+1, y+1)
			+ countCells(x+1, y) + countCells(x+1, y-1)
			+ countCells(x, y-1) + countCells(x-1, y-1);
		}
			
		return result;
	}
	
	public static void main(String[] args) {
		printGrid(0, 0);
		countCells(3, 5);
		System.out.println();
		printGrid(0, 0);
	}

	
	
	
	
	public static void printGridY(int x, int y){
		if(y<grid[x].length-1){
			System.out.print(grid[x][y]+ ", ");
			printGridY(x, y+1);
		} else if(y==(grid[x].length)-1){
			System.out.print(grid[x][y]);
			printGridY(x, y+1);
		} else
			System.out.println();
	}
	
	public static void printGrid(int x, int y){
		printGridY(x, y);
		if(x<grid.length-1)
			printGrid(x+1, y);
	}
}
