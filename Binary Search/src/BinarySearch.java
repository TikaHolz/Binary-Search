
public class BinarySearch
	{

	public static void main(String[] args)
		{
		int [] fred = {-4, -2, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		System.out.println(binarySearch(fred,6));
		}
	//basic binary search algorithm
	public static int binarySearch(int[ ] elements, int target)
		{     
		int left = 0;
		int right = elements.length - 1;
		while (left <= right) 
			{
			//divide by two
		     int mid = (left + right) / 2;
		     //when the target and elements equal each other, check the mid point
		     if (target == elements[mid]) 
		    	 {
		          return mid;
		          }
		    //when the target is less than the mid, subtract one from the mid
		    else if (target < elements[mid]) 
		    	{
		        right = mid - 1;
		        } 
		   //when the target is greater than the mid, add one from the mid
		    else 
		    	{
		         left = mid + 1;
		         }
		   }
		   return -1;
		}

		

	}
