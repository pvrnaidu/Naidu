
public class StringLogic 
{

	public static void main(String[] args) 
	{
		String s = "Venkata Rathnam Naidu pikkili";
//		int firstwordcount = s.indexOf(" ");
//		String firstword = s.substring(0,firstwordcount);
//		int lastwordcount = s.lastIndexOf(" ");
//		String lastword =s.substring(lastwordcount);
//		int lastcount = lastword.length();
//		System.out.println(lastword);
//		String revlastword = "";
//		for(int i =lastcount-1;i>=0;i--)
//		{
//			revlastword=revlastword+lastword.charAt(i);
//		}
//		System.out.println(firstword+revlastword);
		String[] str=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			if(i%2==0)
			{
				String t=str[i];
				String r="";
				for(int j=0;j<t.length();j++)
				{
					r=t.charAt(j)+r;
				}
				System.out.println(r);
			}
			else
				System.out.println(str[i]);
			
		}
	}
}
