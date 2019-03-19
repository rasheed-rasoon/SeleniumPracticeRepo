package rough;

public class ArrayExamples {
	
	
	public static void arrayEx()
	{
		int arr[] = new int[5]; // another way int arr[]={23,1,21,19,9};
		arr[0]=23;
		arr[1]=1;
		
		arr[2]=21;
		
		arr[3]=19;
		
		arr[4]=9;
		
		//iterate through for loop
		System.out.println("elements are");
		for(int i=0;i<=arr.length-1;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		System.out.println("Iterate through for each loop");
		
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		
	}
public static int arraySum()
{
int numbers[]={9,2,23,45,1,221,109};

int arrLength=numbers.length;

int sum=0;
for(int number:numbers)
{
sum=sum+number;	
}
System.out.println("Sum is  "+sum);
return sum;
}


public static void calArrayAverage()
{
	
	int numbers[]={9,2,23,45,1,221,109};

	int arrLength=numbers.length;
	int avg=0;int sum=0;
	for(int number:numbers)
	{
	sum=sum+number;	
	}
	avg=(int) ((double)sum/(double)arrLength);

	
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayExamples.arrayEx();
		
		//ArrayExamples.arraySum();
		ArrayExamples.calArrayAverage();
	}

}
