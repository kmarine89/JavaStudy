package algorithm.A;

public class Maze {

	enum MazeMap {
		UP(1), RIGHT(2), DOWN(4), LEFT(8);
		private int value;
		private MazeMap(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
	}
	
	static String shapeStr = "¡¡¦¢¦¬¦Æ¦¢¦¢¦È¦¼¦¬¦Ä¦¬¦º¦Â¦¾¦¸¦»";
	
	static char getShape(int x, int y) {
		int shape = 0;
		if(map[y][x] != 0) {
			if(y > 0 && map[y-1][x] > 0)
				shape += MazeMap.UP.getValue();
			if(y < map.length-1 && map[y+1][x] > 0)
				shape += MazeMap.DOWN.getValue();
			if(x > 0 && map[y][x-1] > 0)
				shape += MazeMap.LEFT.getValue();
			if(x < map.length-1 && map[y][x+1] > 0)
				shape += MazeMap.RIGHT.getValue();
		}
		return shapeStr.charAt(shape);
	}
	
	static int[][] map = new int[][] {
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		{0,0,0,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,1},
		{1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,0,1},
		{1,0,0,0,0,1,0,0,1,1,1,0,0,0,1,1,1,1,0,1},
		{1,0,1,1,0,1,0,1,1,0,1,0,1,0,0,0,0,0,0,1},
		{1,0,1,1,0,1,0,0,0,0,1,0,1,1,1,1,1,1,0,1},
		{1,0,1,1,1,1,1,0,1,1,1,0,0,1,0,0,0,0,0,1},
		{1,0,0,0,0,0,1,0,0,0,1,1,1,1,1,1,0,1,0,1},
		{1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,0,0,1,0,1},
		{1,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,1,1,0,1},
		{1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,1,0,0,0,0,1,0,1,1,1,1,1,1},
		{1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,1,0,0,0,1},
		{1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1,0,1},
		{1,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,0,1},
		{1,1,1,1,1,1,1,1,0,1,0,1,0,0,0,1,0,1,0,1},
		{1,0,0,0,0,0,0,0,0,1,0,1,0,1,0,1,0,1,0,1},
		{1,0,1,1,1,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1},
		{1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,1,0,1},
		{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1}
	};
	
	public static void main(String[] args) {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map.length; x++) {
				System.out.print(getShape(x, y));
			}
			System.out.println();
		}
	}
}
