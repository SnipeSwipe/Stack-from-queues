import java.util.*;
import java.util.Scanner;

public class Stacks
{
	Queue<Integer> q1=new LinkedList<Integer>(); //Otherwise we would have had to explicitly convert them later
	Queue<Integer> q2=new LinkedList<Integer>();

	public int pop()
	{
        if (q1.peek()==null)
		{;
			int i=0;
			return i;
		}
		
		else
		{
			return q1.remove();
		}
	}

	public void push(int n)
	{
		if (q1.peek()==null)
		{
			q1.add(n);
        }
		
		else
		{
			for (int i=q1.size(); i>0; i--)
			{
				q2.add(q1.remove());
			}
			q1.add(n);
			for (int j=q2.size(); j>0; j--)
			{
				q1.add(q2.remove());
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a;
		Stacks s1=new Stacks();
		System.out.println("Enter the number of numbers you want to print: ");
		a=in.nextInt();
		if(a>5)
		{
			System.out.println("More than required");
			System.exit(0);
		}
		for(int i=0;i<a;i++) //Just prints 1 to 5
		{
			s1.push(i+1);
		}
        System.out.println("\n\n");
		for(int i=0;i<a;i++)
		{
			System.out.println(s1.pop());
		}

    }
}