class HEARTPATTERN{
    
    public static void main(String[] args)
    {
        int n =9;
        int n1=n/2;
        int z=n/2-1;

        for(int i=0;i<n-z;i++)
        {
            for(int j=0;j<n;j++)
            {
                    if(i==0)
                    {
                    if(i+j==0||i+j==n1||i+j==n-1)
                    System.out.print(" ");
                    else
                    System.out.print("*");
                    }else
                    if(i==1&&j==n1)
                    System.out.print("*");
                    else
                    if(j==i-1)
                    System.out.print("*"); 
                    else
                    if(i+j==n&&i!=n-2)
                    System.out.print("*");
                    else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}