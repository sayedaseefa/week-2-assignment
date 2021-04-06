class largestarray
{
public static void main(String a[])
{
int []arr=new int[]{26,48,53,67,79};
int max=arr[0];
for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
max=arr[i];
}
System.out.println("largest element present in given array:"+max);
}
}
