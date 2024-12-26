package com.company.demo;

public class PossiblePermutations {
    public void swapElements(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void printPermutations(int arr[], int currentIndex)
    {
        if(currentIndex==arr.length-1)
        {
            for (int i=0; i<arr.length; i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        for(int i=currentIndex; i<arr.length; i++)
        {
            swapElements(arr,currentIndex,i);
            printPermutations(arr,currentIndex+1);
            swapElements(arr,i,currentIndex);
        }
    }

    public static void main(String[] args) {

        PossiblePermutations p = new PossiblePermutations();
        p.printPermutations(new int[]{1,2,3},0);
    }
}
