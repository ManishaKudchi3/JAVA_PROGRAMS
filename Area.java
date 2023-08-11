package Area;

public class Area {
	void triangle(int b, int h) {
	int Area=(b*h)/2;
	System.out.println("The area of traingle is "+Area);
	}
	void square(int side) {
		int Area=side*side;
		System.out.println("The area of Square is "+Area);
		}
	void rectangle(int l,int w) {
		int Area=l*w;
		System.out.println("The area of Rectangle is "+Area);
		}
	void circle(float r) {
		float Area=(float) ((3.14159265359)*r*r); //3.14159265359 is pie value and it is Constant
		System.out.println("The area of Circle is "+Area);
		}
	public static void main(String[] args) {
		Area area=new Area();
		area.square(4);
	}
	
	
}