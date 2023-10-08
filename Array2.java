class Array2
{  
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int a[]=new int[10];
System.out.println("enter the size of array");
int n=sc.nextInt();
int sum=o;
System.out.println("enter the array elements");
for(int i=0;i<=n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<=n;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
}
