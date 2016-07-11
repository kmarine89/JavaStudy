package algorithm.A;

public class Maze {

	// ������ ���� ���� enum >> ����Ʈ �������ν� ���������� ��
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
	
	// ���� �׷��ֱ� ���� ���ڿ���...
	static String shapeStr = "�������Ʀ����Ȧ����Ħ����¦�����";
	
	// �� ���ڿ��� �̿��Ͽ� x,y��ǥ�� �´� �׷����� �׷��ش�
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
	
	// �� ������ ������ ���� �Է���
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
	
	// �� ũ�⸦ ������ ���� ��ü
	static Integer x1 = new Integer(18);
	static Integer y1 = new Integer(18);
	static MazeMap dir = MazeMap.DIR;
	
	public static void main(String[] args) {
		
		while(stillInMaze(x1, y1)) {		// ������ �̷� ���ΰ�?
			dir.turnRight();				// ���������� ���ƶ�..
			while(isWallAhead(x1, y1, dir)) {	// �տ� ���� �ִ°�? dir�� �� ������ ��Ÿ��
				dir.turnLeft();				// �տ� ���� �ִٸ� �������� ���ƶ�..
			}
			goForward(dir);		// ������ ��ĭ ����..
			printMap(x1, y1);	// �� ����
			delay();
		}
	}
	
	static void printMap(int x1, int y1) {
		for (int y = 0; y < map.length; y++) {
			for (int x = 0; x < map.length; x++) {
				if(x == x1 && y == y1)
					System.out.print("��");
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
