package datastructure.brainstorm.sorting;

import java.util.Arrays;

public class MergeSort
{
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		new MergeSort().mergerSortAlgo(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		System.out.println("Testing");
	}
	
	private void mergerSortAlgo(int [] arr, int low, int high)
	{
		if(low<high)
		{
			int mid=low+(high-low)/2;
			mergerSortAlgo(arr, 0, mid);
			mergerSortAlgo(arr, mid+1, high);
			merge(arr,low, mid, high);
		}
	}
	private void merge(int[] arr, int low, int mid, int high)
	{
		int len1=mid-low+1;
		int len2=high-mid; //high-mid-1+1
		
		int[] leftArray=new int[len1];
		int[] rightArray=new int[len2];
		
		for(int i=0; i<len1; i++)
		{
			leftArray[i]=arr[i+low];
		}
		for(int i=0; i<len2; i++)
		{
			rightArray[i]=arr[i+mid+1];
		}
		int i=0, j=0, k=low;
		
		while(i<len1 &&  j<len2)
		{
			if(leftArray[i]<=rightArray[j])
			{
				arr[k]=leftArray[i];
				i++;
			}
			else
			{
				arr[k]=rightArray[j];
				j++;
			}
			k++;
		}
		while(i<len1)
		{
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		while(j<len2)
		{
			arr[k]=rightArray[j];
			j++;
			k++;
		}
	}
}
