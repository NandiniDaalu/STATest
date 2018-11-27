package test_driver;

public class teststatic 
{
	static int i =0;
	
    static void teststaticmethod()
    {
    	i++;
    	System.out.println(i);
    }
    
    static void method1()
    {
    	String array[] = {"Nandini", "Daalu", "Chutku", "Bruno", "Barlie"};
    	for (int i=0; i < array.length; i++)
    	{
    		System.out.print(array[i]);
    	}
    }
	
	public static void main(String args[])
	{
		teststaticmethod();
		method1();
		
	}

}
