public class MissngNUm
{
   public static void main(String[] args) 
   {
      int arr[]={1,2,3,5,6};
      // using array sum
    //   int Expeted_Element=arr.length+1;
    //   int total=(Expeted_Element*(Expeted_Element+1))/2;
    //   int sum=0;
    //   for(int i=0;i<arr.length;i++)
    //   {
    //      sum=sum+arr[i];
    //   }
    //   System.out.println("Missed Number : " + (total-sum));
    // using XOR
    int XOR1=arr[0];
    for(int i=1;i<arr.length;i++)
    {
       XOR1=XOR1^arr[i];
    }
    int XOR2=1;
    for(int i=2 ;i<=arr.length+1;i++)
    {
        XOR2=XOR2^i;
    }
    System.out.println("Missed Number : " + (XOR1^XOR2));     
   } 
}
