package practice;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	
	public GFG() {
		System.out.println("This constructor got called on creatign an boject of a clas");
	}
	public static void main (String[] args)
	{
		GFG gfg = new GFG();
		Scanner scanner = new Scanner( System.in );													//create a scanner object to get user input
		try																							//this try block is to catch the inevitable exception caused by the user quitting 
		{
			int t = scanner.nextInt();																//get number of test cases
            scanner.nextLine();
            
            while( t > 0 )																			//So long as there are more test cases
			{		
				String s = scanner.nextLine();                                                      //get the string to be converted for this test case
                boolean makeUpper = Character.isUpperCase( s.charAt( 0 ) );
                String result = "";
                for( int i = 0; i < s.length(); ++i )
                {
                    if( makeUpper )
                        result += Character.toUpperCase( s.charAt( i ) );
                    else
                        result += Character.toLowerCase(s.charAt( i ) );
                    makeUpper = !makeUpper;
                }
                
                System.out.println(result);
                
				t--;																				//get next test case		
			}
		}
		catch( Exception e )																		//catch an exception thrown by incorrect input
		{
			
		}
	}
}
