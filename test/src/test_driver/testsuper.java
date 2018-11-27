package test_driver;

import org.junit.Test;

public class testsuper {
	@Test
		public void method1()
		{
			int i=10, j=20, k;
			k= i+j;
			System.out.println(k);
		}
		

		
	}

	class secondtest extends testsuper
	{
		secondtest()
		{
			super();
			
		}
	}

	class thirdtest
	{
	  public static void main (String args[])
	  {
		  secondtest te= new secondtest();
	  }
	}

