package com.example.data_structures.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datastructure")
public class datastructurecon {
    @GetMapping("/linearsearch/{id}")
    public String find(@PathVariable int id) {
        int arr[] = {10, 20, 30, 40, 50};
        for (int i = 0; i < arr.length; i++) {
            if (id == arr[i]) {
                return "Found at location " + i + " value " + id;
            }
        }
        return "Not Found";
    }

    @GetMapping("/binarysearch/{id}")
    public String binary(@PathVariable int id) {
        int arr[] = {10, 20, 30, 40, 50};
        int low=0,high=arr.length-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(id<arr[mid])
            {
                high=mid-1;
            }
            else if(id>arr[mid])
            {
                low=mid+1;
            }
            else if(id==arr[mid]){
                return "Found at location " + mid + " value " + id;
            }
        }
        return "Not Found";
    }

    @GetMapping("/selectionsort")
    public int[] sorting()
    {
        int a[]={30,20,70,10,50};
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }

    @GetMapping("/insertionsort")
    public int[] insertionsort()
    {
        int arr[]={12,34,54,13,22};
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr;
    }

    @GetMapping("/bubblesort")
    public int[] bubblesort()
    {
        int arr[]={40,20,100,49,32};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}

