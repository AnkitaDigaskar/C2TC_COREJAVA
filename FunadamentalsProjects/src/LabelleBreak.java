
public class LabelleBreak 
{

	public static void main(String[] args) 
	{
		int len = 3;
		int key = 1;
		int k = 0;
		out: {
		for (int i = 0;i< len; i++)
		{
		in:
		{
		for (int j = 0; j < len; j++) 
		{
		if (i == key) 
		{
		break out;
		}
		k += 1;
		}
		}
		}
		}
		System.out.println(k);

	}

}
