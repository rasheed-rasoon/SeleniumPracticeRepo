package JenkinsMavenGitHub.JenkinsMavenGitHubProj;

public class StringReverseWord {
	
	
	public static void reverseString(String inputString)
	{
		for(int i=inputString.length()-1;i>=0;i--)
		{
			System.out.println(inputString.charAt(i));
			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StringReverseWord.reverseString("Rasheed");

	}

}
