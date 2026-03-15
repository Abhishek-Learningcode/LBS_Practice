package Day2;

public class program2 {
		public static void main(String[] args) 
		{
			int num =16;
			boolean isPerfect=false;
			for(int i=1; i<=num/2; i++)
			{
				if(i*i==num)
				{
					isPerfect=true;
					break;
				}
			}
			if(isPerfect){
			System.out.println("yes");
		}else{
			System.out.println("no");
	}
	}
	}


