package p09.nestedclass.inner;

//직선
public class Line {
	Point p1, p2;
	
	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1,y1);
		this.p2 = new Point(x2,y2);
	}

	void move(int offsetX, int offsetY) {
		p1.x += offsetX;
		p1.y += offsetY;
		p2.x += offsetX;
		p2.y += offsetY;
	}
	
	//점 클래스(Inner Class)
	static class Point {
		int x, y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
	}
}
