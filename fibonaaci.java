/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=1,b=1,c=0;
		int n=sc.nextInt();
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			if(i<n-1)
			System.out.print(c+" ");
			else
			System.out.print(c);
		}
	}
}
