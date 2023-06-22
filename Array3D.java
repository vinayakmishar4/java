public class Array3D 
{
    public static void main(String[] args) 
    {
        // Declare of 3D array
        int[][][] a;
        // create 3D array
        a=new int[2][2][2];
        a[0][0][0]=10;
        a[0][0][1]=20;
        int[][][] b={{{1,2,3},{4,5},{6,7}}};
        System.out.println(b);
        System.out.println(b[0]);
        System.out.println(b[0][0]);
        System.out.println(b[0][0][0]);
        System.out.println(b.length);
        System.out.println(b[0].length);
        System.out.println(b[0][0].length);
        for (int i = 1; i <b.length; i++) {
        {
            for(int j = 1; j < b[0].length;j++)
            {
              for(int k = 1; k < b[0][0].length;k++)
              {
                 System.out.println(b[i][j][k]);
              }
            }
        }
    }
  }
}
