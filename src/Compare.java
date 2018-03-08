import java.io.*;
public class Compare
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String :");
		String s1=br.readLine();
		System.out.println("Enter another String :");
		String s2=br.readLine();
		String soundex1=Encrypt.check(s1);
		String soundex2=Encrypt.check(s2);
		if(soundex1.equals(soundex2))
			System.out.println("Similar Pronunciation");
		else
			System.out.println("Dissimilar Pronunciation");
		br.close();
	}
}