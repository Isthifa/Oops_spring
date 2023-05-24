package Data_Structure;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.println("Enter value to search");
        int key=sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println(key+" Found at "+i+" Location Value in array "+arr[i]  );
                break;
            }
            else 
            {
                System.out.println("Not Found");
            }
        }
    }
    
}
