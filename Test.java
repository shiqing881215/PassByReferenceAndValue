package PassByReferenceAndValue;

/**
 * Keep in mind
 * In java, we all pass the COPY REFERENCE to the method.
 * But they all two different reference. 
 * Initially, they point to the same object, 
 * in the method, the change to the copy will NOT affect the original reference.
 * 
 * http://blog.csdn.net/jdluojing/article/details/6962893
 * 
 * @author qshi
 */
public class Test {

	/**
	 * Here c is the COPY reference of c
	 * So first two lines it refer to the same object as original object
	 * so it will change the original object value
	 * Then it refers to a new object, but the original reference still refers to the original object
	 */
	public static void moveCircle(int x, int y, Circle c) {
		c.x = c.x + x;
		c.y = c.y + y;
		c = new Circle(0,0);
	}
	
	/**
	 * This parameter is also a copy of z
	 * @param z
	 */
	public static void moveCircle2(int z) {
		z = z + 5;
	}
	
	public static int moveCircle3(int z) {
		z = z + 5;
		return z;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(10, 10);
		moveCircle(5, 5, c);
		
		System.out.println(c.x);
		System.out.println(c.y);
		
		int z = 10;
		moveCircle2(z);
		
		System.out.println(z);

		z = moveCircle3(z);
		System.out.println(z);
	}

}
