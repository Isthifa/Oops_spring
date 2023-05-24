import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BinarySearch{
public static void main(String[] args) throws IOException {
        System.out.println("Binary Search");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int a[]= {10,30,40,50,80};
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(n<a[mid])
            {
                high=mid-1;
            }
            else if(n>a[mid])
            {
                low=mid+1;
            }
            else if(n==a[mid])
            {
                System.out.println(n+" found at location "+mid +" value in array at position "+a[mid]);
                break;
            }
        }

    }
}