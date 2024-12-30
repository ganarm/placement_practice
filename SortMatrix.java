/*
Sort matrix first row wise then column wise
*/

import java.util.*;
class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no. of rows : ");
        int m=sc.nextInt();
        
        System.out.print("Enter no. of columns : ");
        int n=sc.nextInt();
        
        int[][] arr= new int[m][n];
        
        System.out.print("Enter Matrix : \n");
        
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
                
        for (int i=0;i<m;i++)
            Arrays.sort(arr[i]);
        
        int[][] arr1=new int[n][m];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++)
                arr1[j][i]=arr[i][j];
                
        for (int i=0;i<n;i++)
            Arrays.sort(arr1[i]);
        
        for (int i=0;i<n;i++)
            for (int j=0;j<m;j++)
                arr[j][i]=arr1[i][j];
        
        for (int i=0;i<m;i++)
        {
            for (int j=0;j<n;j++)
                System.out.print(" "+arr[i][j]);
            System.out.println("");
        }
    }
}


/*
Output :

Enter no. of rows : 3
Enter no. of columns : 3
Enter Matrix : 
3 2 1
5 4 6
0 1 4

 0 1 3
 1 2 4
 4 5 6

*/
