package p05.multi.inherit;

public class Label implements Changeable{
	String str;
	int x, y;
	String bg;
	String fg;
	String font;
	
	

	public Label(String str, int x, int y, String fg, String bg, String font) {
		super();
		this.str = str;
		this.x = x;
		this.y = y;
		this.bg = bg;
		this.fg = fg;
		this.font = font;
	}

	@Override
	public void resize(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void setForeground(String fg) {
		this.fg = fg;
	}

	@Override
	public void setBackground(String bg) {
		this.bg = bg;
	}

	@Override
	public void setFont(String font) {
		this.font = font;
	}

}
