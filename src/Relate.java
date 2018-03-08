import java.io.*;
import java.util.StringTokenizer;
public class Relate
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a name :");
		String word=br1.readLine();
		br1.close();
		File f=new File("Names.txt");		
		FileReader fr=new FileReader(f);
		BufferedReader br2=new BufferedReader(fr);
		String t=br2.readLine();
		
		int flag=0;
		String temp="";
		StringTokenizer st;
		while(t!=null)
		{
			st=new StringTokenizer(t);
			if(st.hasMoreTokens())
			 temp=st.nextToken();
			if(temp.equalsIgnoreCase(word))
			{
				flag=1;
				break;
			}
			t=br2.readLine();
		}
		fr=null;
		br2=null;
		fr=new FileReader(f);
		br2=new BufferedReader(fr);
		String soundex1;
		String soundex2;
		if(flag==1)
			System.out.println("Correct Name");
		else
		{
			t=br2.readLine();
			while(t!=null)
			{
				st=new StringTokenizer(t);
				if(st.hasMoreTokens())
				 temp=st.nextToken();
				  soundex1=Encrypt.check(temp);
				  soundex2=Encrypt.check(word);
				  if(soundex1.equalsIgnoreCase(soundex2))
				  {
					 flag=1;
					 break;
				  }
				 
				t=br2.readLine();
			}
			if(flag==1)
			 System.out.println("Did you mean : "+temp+" ?");
			else
			 System.out.println("Cannot Recognize");
		}
		
		br2.close();	
	}
}