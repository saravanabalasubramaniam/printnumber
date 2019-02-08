import java.io.*;
import java.util.*;
class Printnum
{
 public static void main(String args[])
 {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	if(a>=0&&a<=10)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
 	}
 }
}
