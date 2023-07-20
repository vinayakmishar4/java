public class MergeTwoArr
{
   public static void main(String[] args) 
   {
      int a[]={10,20,30,40,50};
      int b[]={60,70,80,90,100};
      int n1=a.length;
      int n2=b.length;
      int n3=n1 +n2;
      int c[]=new int[n3];
      for(int i=0;i<a.length;i++)
      {
         c[i]=a[i];
      }
      for(int i=0;i<b.length;i++)
      {
         c[i+a.length]=b[i];
      }
      for(int i=0;i<c.length;i++)
      {
               System.out.println(c[i]);
      b     }
   } 
}
