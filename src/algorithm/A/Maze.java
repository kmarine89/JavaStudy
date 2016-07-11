package algorithm.A;

public class Maze {

	// 방향을 정의 위한 enum >> 쉬프트 해줌으로써 오른쪽으로 돔
	enum MazeMap {
		UP(1), RIGHT(2), DOWN(4), LEFT(8), DIR(1);
		private int value;
		private MazeMap(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public void turnLeft() {
			value >>= 1;
			value = (value == 0? 8 : value);
		}
		public void turnRight() {
			value <<= 1;
			value = (value > 8? 1 : value);
		}
	}
	
	// 맵을 그려주기 위한 문자열들...
	static String shapeStr = "　│━┕││┍┝━┙━┷┑┥┯┿";
	
	// 위 문자열을 이용하여 x,y좌표에 맞는 그래프를 그려준다
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
//			System.out.println(MazeMap.UP.getValue()+" "+MazeMap.DOWN.getValue()+" "+MazeMap.LEFT.getValue()+" "+MazeMap.RIGHT.getValue());
		}
//		System.out.println(shape);
		return shapeStr.charAt(shape);
	}
	
	// 맵 정보를 다음과 같이 입력함
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
	
	// 맵 크기를 저장할 변수 객체
	static Integer x1 = new Integer(18);
	static Integer y1 = new Integer(18);
	static MazeMap dir = MazeMap.DIR;
	
	public static void main(String[] args) {
		
		while(stillInMaze(x1, y1)) {		// 여전히 미로 속인가?
			dir.turnRight();				// 오른쪽으로 돌아라..
			while(isWallAhead(x1, y1, dir)) {	// 앞에 벽에 있는가? dir은 앞 방향을 나타냄
				dir.turnLeft();				// 앞에 벽이 있다면 왼쪽으로 돌아라..
			}
			goForward(dir);		// 앞으로 한칸 가라..
			printMap(x1, y1);	// 맵 갱신
			delay();
		}
	}
	
	static void printMap(int x1, int y1) {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map.length; x++) {
				if(x == x1 && y == y1)
					System.out.print("＊");
				else
					System.out.print(getShape(x, y));
			}
			System.out.println();
		}
	}
	
	static void delay() {
		try {
			Thread.sleep(100);
		} catch (Exception e) {
		}
	}
	
	static void goForward(MazeMap dir) {
		x1 = (dir.getValue() == MazeMap.LEFT.getValue()? --x1 : dir.getValue() == MazeMap.RIGHT.getValue() ? ++x1 : x1);
		y1 = (dir.getValue() == MazeMap.UP.getValue()? --y1 : dir.getValue() == MazeMap.DOWN.getValue() ? ++y1 : y1);
	}
	
	static boolean stillInMaze(Integer x, Integer y) {
		if(x > 0 && x < map.length-1 && y > 0 && y < map.length-1)
			return true;
		else
			return false;
	}
	
	static boolean isWallAhead(int x, int y, MazeMap dir) {
		x = (dir.getValue() == MazeMap.LEFT.getValue()? --x : dir.getValue() == MazeMap.RIGHT.getValue() ? ++x : x);
		y = (dir.getValue() == MazeMap.UP.getValue()? --y : dir.getValue() == MazeMap.DOWN.getValue() ? ++y : y);
		return map[y][x] != 0;
	}
	
}
