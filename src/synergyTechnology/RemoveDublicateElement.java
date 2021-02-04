package synergyTechnology;

public class RemoveDublicateElement {

	public static int remove_duplicates(int arrayInput[],int arrayLength)
	{
		if(arrayLength==0||arrayLength==1)
		{
			return arrayLength;
		}
		
		 int originalElement[]=new int[arrayLength];
		 int j=0;
		for(int i=0;i<arrayLength-1;i++)		
		{
			
			if(arrayInput[i]!=arrayInput[i+1])
			{
				originalElement[j++]=arrayInput[i];
			}
			 
		}
		originalElement[j++]=arrayInput[arrayLength-1];
		
		// changing original array
		for(int i=0;i<j;i++)
		{
			arrayInput[i]=originalElement[i];
		}
		return j;
	 
		
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Result of First Array");
		int aray1[]= {2,2,2,2,2,3};
		int arrayLength1 = remove_duplicates(aray1,aray1.length);
		
		for(int i=0;i<arrayLength1;i++)
		{
			System.out.println(aray1[i]+"");
		}
		
		System.out.println("Result of Second Array");
		int aray2[]= {1,2,2,3,4,4,4,5,5};
		int arrayLength2 = remove_duplicates(aray2,aray2.length);
		
		for(int i=0;i<arrayLength2;i++)
		{
			System.out.println(aray2[i]+"");
		}
	}
}
