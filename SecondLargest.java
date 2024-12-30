import java.util.*;
class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr= new int[20];
        
        System.out.print("Enter n : ");
        int n=sc.nextInt();
        
        System.out.print("Enter Array Elements : ");
        
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int s=Integer.MIN_VALUE;
        int f=Integer.MIN_VALUE;
        
        for (int i=0;i<arr.length;i++)
        {
            if (f<arr[i])
            {
                s=f;
                f=arr[i];
            }
            else if(s<arr[i] && f!=arr[i])
            {
                s=arr[i];
            }
        }
        System.out.println("First Largest No. : "+f+"\nSecond Largest No. : "+s);
    }
}

/*

Output :

Enter n : 5
Enter Array Elements : 4 2 1 0 3
First Largest No. : 4
Second Largest No. : 3

*/
