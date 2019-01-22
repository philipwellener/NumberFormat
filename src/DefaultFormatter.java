
public class DefaultFormatter implements NumberFormatter
{
	public String format(int num)
	{
		String str = "" + num;
		String formated = "";
		int first;
		
		if(str.length()%3 == 1)
		{	
			first = 0;
		}
		else if(str.length()%3 == 0)
		{
			first = 2;
		}
		else
		{
			first = 1;
		}
		int count = first;
		if (str.length()>3)
		{
			formated = str.substring(0, first+1) + ",";
			for(int i = first+1; i<str.length(); i = i+3)
			{
				count = count + 3;
				formated +=  str.substring(i,i+3);
				if(count != str.length()-1 && count%3 == first)
					formated += ",";
			}
		}
		else
			formated = "" + num;
		return formated;
	}
}

