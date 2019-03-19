package NewJava8Libraries;




interface Drawable
{
	 public void draw();
	
}


//https://www.journaldev.com/1330/java-collections-interview-questions-and-answers
public class LabbdaExpressionsExamples {

	static int width=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Drawable d2=()->
		{
			System.out.println("Using lambda expressionthe vealue is "+width);
	
			
		};	
		
	d2.draw();
	}
}
