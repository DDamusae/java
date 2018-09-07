package p09.nestedclass.inner;

public class LineMain1 {
	public static void main(String[] args) {
		Line line = new Line(0, 0, 100, 100);
		line.move(10, 20);
		LineMain1.printPoint(line.p1);
		LineMain1.printPoint(line.p2);
	}
	
	static void printPoint(Line.Point po) {
		System.out.printf("(%d, %d) \n", po.x, po.y);
	}
}
