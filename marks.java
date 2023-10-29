import java.util.Scanner;

class marks
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the subject1 mark :");
		int m1=s.nextInt();
		System.out.print("Enter the subject2 mark :");
		int m2=s.nextInt();
		System.out.print("Enter the subject3 mark :");
		int m3=s.nextInt();
		System.out.print("Enter the subject4 mark :");
		int m4=s.nextInt();
		System.out.print("Enter the subject5 mark :");
		int m5=s.nextInt();
		int total = m1+m2+m3+m4+m5;
		double average=(m1+m2+m3+m4+m5)/5;
		
		
		System.out.print("Total marks : "+total);
		System.out.print("\nAverage percentange :"+average+"%");
		if (average>=90 && average<=100)
		{
			System.out.println("\nGrade : A");
		}
		else if (average>=80 && average<=90)
		{
            System.out.println("\nGrade : B");
		}
		else if (average>=70 && average<=80)
		{
			System.out.println("\nGrade : C");
		}
		else 
		{
			System.out.println("\nGrade : D");
		}
	}
}

		
		
		
		
		
		