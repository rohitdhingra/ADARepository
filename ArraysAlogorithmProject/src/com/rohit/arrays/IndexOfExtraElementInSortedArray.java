package com.rohit.arrays;

/*
 * Find index of an extra element present in one sorted array
Given two sorted arrays. There is only 1 difference between the arrays. The first array has one element extra added in between. Find the index of the extra element.

Examples:

Input: {2, 4, 6, 8, 9, 10, 12};
       {2, 4, 6, 8, 10, 12};
Output: 4
Explanation: The first array has an extra element 9.
The extra element is present at index 4.

Input: {3, 5, 7, 9, 11, 13}
        {3, 5, 7, 11, 13}
Output: 3
Explanation: The first array has an extra element 9.
The extra element is present at index 3.
 */

public class IndexOfExtraElementInSortedArray {

	public static void main(String[] args) {
		int arr1[]= {3, 5, 7, 9, 11, 13};
		int arr2[]={3, 5, 7, 11, 13};
		int len1 = arr1.length;
		int len2 = arr2.length;
		int index = 0;
		System.out.println(len1+" "+len2);
		if(len1 == len2)
		{
			System.out.println("Length are equal");
		}
		else if(len1 > len2)
		{
			for(int i=0;i<len1-1;i++)
			{
				if(arr1[i]==arr2[i])
				{
					continue;
				}
				else
				{
					index = i;
					break;
				}
			}
		}
		else if(len2 > len1)
		{
			for(int i=0;i<len2-1;i++)
			{
				if(arr2[i]==arr1[i])
				{
					continue;
				}
				else
				{
					index = i;
					break;
				}
			}
		}
		System.out.println("Index is"+index);
	}

}
