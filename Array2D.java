public class Array2D
{
    public static void main(String[] args) 
    {
        // declare
        int [][] a;
        // creation
        a=new int[2][3];
        int [][] b=new int[2][3];
        int [][] c={{1,2,3},{2,3}};
        System.out.println(c[0]);
        System.out.println(c[1][1]);
        System.out.println(c.length);
        System.out.println(c[0].length);
        //System.out.println(c[0][0].length);
        System.out.println("2D Array");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.println(c[i][j]);
            }
        }
    }
}