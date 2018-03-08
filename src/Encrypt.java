public class Encrypt
{
	public static String check(String s)
	{
		String soundex="";
		char ch;
		s=s.toUpperCase();
		soundex=soundex+s.charAt(0)+'-';
		for(int i=1;(i<s.length())&&soundex.length()<5;i++)
		{
			ch=s.charAt(i);
			if(ch=='B'||ch=='F'||ch=='P'||ch=='V')
				soundex=soundex+1;
			else if(ch=='C'||ch=='G'||ch=='J'||ch=='K'||ch=='Q'||ch=='S'||ch=='X'||ch=='Z')
				soundex=soundex+2;
			else if(ch=='D'||ch=='T')
				soundex=soundex+3;
			else if(ch=='L')
				soundex=soundex+4;
			else if(ch=='M'||ch=='N')
				soundex=soundex+5;
			else if(ch=='R')
				soundex=soundex+6;
			else 
				continue;
		}
		int len=soundex.length();
		if(len<5)
		{
			for(int i=0;i<5-len;i++)
				soundex=soundex+'0';			
		}
		return soundex;
	}
}