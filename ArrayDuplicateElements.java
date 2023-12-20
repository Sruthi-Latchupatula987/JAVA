package Arrays;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Java","HTML","CSS","JAVAScript","java"};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Element:"+arr[i]);
					flag=true;
				}
			}
		}
		
if(flag==false)
{
	System.out.println("Duplicate Element not Found ");
}
	}

}
