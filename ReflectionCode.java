import java.lang.reflect.*;
class Demo
{
	private Demo()
	{
		System.out.println("private Constructor");
	}
	private void show()
	{
		System.out.println("private method");
	}
}

class Reflection
{
public static void main(String ar[])throws Exception
{
Class c = Demo.class;

Constructor con=c.getDeclaredConstructor();

con.setAccessible(true);

Method m=c.getDeclaredMethod("show");

m.setAccessible(true);

m.invoke(con.newInstance());
// the  code

}
}