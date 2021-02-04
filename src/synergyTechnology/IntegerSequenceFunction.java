package synergyTechnology;


public class IntegerSequenceFunction {
	
 
	public static boolean array123(int inputArray[] )
	{
       String value ="";
		for(int i=0;i<inputArray.length;i++)
		{
			 
			value=""+value+inputArray[i];
			//System.out.println(value);
			if(i>=2)
			{
				    String substringValue = value.substring(i-2, i+1);
				   // System.out.println(substringValue);
				    if(substringValue.equals("123"))
				    {
				    	
				    	return true;
				    }
			}
		}
		
		return false;
	 
	}

	public static void main(String[] args) {
		
		System.out.println("Output of First Array");
         int array1[]= {1,1,2,3,1};
		boolean resutl1 = array123(array1);
		System.out.println(resutl1);
		
		System.out.println("Output of second Array");
		 int array2[]= {1,1,2,4,1};
		boolean resutl2 = array123(array2);
		System.out.println(resutl2);
		
		System.out.println("Output of Third Array");
		    int array3[]= {1,1,2,1,2,3};
			boolean resutl3 = array123(array3);
			System.out.println(resutl3);
			
			
			 
		 
	}

	 
}
