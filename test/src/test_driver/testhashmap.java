package test_driver;

import java.util.HashMap;
import java.util.Map;


public class testhashmap {

	static HashMap<String, Boolean>map= new HashMap<>();
	public static void main(String args[])
	{
		map.put("Nandini", true);
		map.put("Daalu", true);
		map.put("Chutku", true);
		map.put("Bruno", false);
		
		System.out.println(map.get("Nandini"));
		
		for(String s : map.keySet())
		{
			System.out.println(s);
		}
		for(Boolean s1 : map.values())
		{
			System.out.println(s1);
		}
		for (Map.Entry KV : map.entrySet())
		{
			System.out.println(KV);
		}
		
		map.remove("Bruno", false);
		for(Map.Entry KV : map.entrySet())
		{
			System.out.println(KV);
		}
	}
}
