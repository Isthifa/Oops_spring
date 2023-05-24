import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        int n=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println(n+" Found at location "+i);
                break;
            }
        }
    }
    
}
