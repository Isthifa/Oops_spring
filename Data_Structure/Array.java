import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Array {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[]={10,20,30,40,50,60};
        int n=10;
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(b));
    }
    
}
