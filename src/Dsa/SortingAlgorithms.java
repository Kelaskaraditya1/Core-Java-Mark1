package Dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingAlgorithms {

    public static void normalSort(int [] array,int no){
        for(int i=0;i<no;i++){
            for(int j=i+1;j<no;j++){
                if(array[i]>array[j]){
                    int tmp = array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
    }

    public static void selectionSort(int [] array,int no){
        for(int i=0;i<no-1;i++){
            int min=i;
            for(int j=i+1;j<no;j++){
                if(array[j]<array[min])
                    min=j;
            }
            int tmp = array[i];
            array[i]=array[min];
            array[min]= tmp;
        }

        /* Time complexcity :
        worst case: o(n^2)
        best case : o(n)
        */
    }

    public static void insertionSort(int [] array,int no){
        for(int i=1;i<no;i++){
            int tmp = array[i];
            int j=i-1;
            for(;j>=0;j--){
                if(array[j]>tmp)
                    array[j+1]=array[j];
                else
                    break;
            }
            array[j+1]=tmp;
        }

        /*
        * Time Complexity:
        * Best case: O(n)
        * Worst case: O(n^2) */
    }

    public static void merge(int arr[],int start,int mid,int end){

        int tmp [] = new int [100];
        int i=start,j=mid+1,index=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j])
                tmp[index++]=arr[i++];
            else
                tmp[index++]=arr[j++];
        }
        while(i<=mid)
            tmp[index++]=arr[i++];
        while (j<=end)
            tmp[index++]=arr[j++];

        for(int k=0;k<index;k++){
            arr[k+start]=tmp[k];
        }
    }

    public static void mergeSort(int arr[],int start,int end){

        if(start<end){
            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }


        /*Time complexity:
        best case: O(nlog(n))
        worst case : O(nlog(n))
        * */
    }

    public static int pivot(int arr[],int start,int end){

        int i=start-1,j=start;

        for(;j<end;j++){
            if(arr[j]<arr[end]){
                i++;
                int tmp = arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        i++;
        int tmp = arr[i];
        arr[i]=arr[end];
        arr[end]=tmp;
        return i;
    }

    public static void quickSort(int arr[],int start, int end){

        if(start<end){
            int pivotIndex=pivot(arr,start,end);
            quickSort(arr,start,pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }
    }

    public static void maximumAndMinimumElement(int arr[],int no){
        int min=arr[0];
        for(int i=1;i<no;i++){
            if(arr[i]<min)
                min=arr[i];
        }

        int max = arr[0];
        for(int i=1;i<no;i++){
            if(arr[i]>max)
                max=arr[i];
        }

        System.out.println("Minimum element:"+min+" Maximum element"+max);
    }

    public static void main(String[] args) {

        int [] array = {10,1,7,4,8,2,11};

        quickSort(array,0,6);
        Arrays.stream(array).forEach(value->{
            System.out.print(value+" ");
        });

//        maximumAndMinimumElement(array,7);

    }
}
