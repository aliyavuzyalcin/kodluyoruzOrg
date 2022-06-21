# What is Insertion Sort?
[Patika.dev](www.patika.dev)

> - **[22,27,16,2,18,6]**
>
>- Write down the steps of the process of sorting this array above.
>
>- Show the Big-O Notation.
>
>- Time Complexity:
>
>	* ***Average Case:*** *The situation which the number we look for is located in the middle of the array.
>	* ***Worst Case:*** *The situation which the number we look for is located in the end of the array.
>	* ***Best Case:*** *The situation which the number we look for is located in the head of the array.
>
>- What case does the number 18 fall into after the array is sorted? 
>
>**Lastly, sort the array below with Insertion Sort and write its first 4 steps.**
>	
>- **[7,3,5,8,2,9,4,15,6]**

---

## What is Sorting?
Sorting refers to ordering data in an increasing or decreasing fashion according to some linear relationship among the data items. Sorting can be done on names, numbers and records.

There are many sorting algorithms used for this. Some are very fast but hard to code, some are very fast for a small amount of data, and some are easy to code.

It is the arrangement of any number of types of data in a certain order with limited memory and processing power. The important thing here is to obtain an algorithm that will give the optimum memory and performance pair.

Sorting can be performed using several methods, some of them are:

- Insertion Sort
- Merge Sort
- Quick Sort
- Selection Sort
- Bubble Sort

***In this work, we are going to see the Insertion Sort algorithm.***

## What is Insertion Sort ?

This algorithm starts with the second element of the array. Each element after the second element is compared with the elements before it. Then large elements are shifted to the right in the array, while small elements are shifted to the left in the array.


> **The worst-case (and average-case)** complexity of the insertion sort algorithm is **O(n²)**. Meaning that, in the worst case, the time taken to sort a list is proportional to the square of the number of elements in the list.

> **The best-case** time complexity of insertion sort algorithm is **O(n)** time complexity. Meaning that the time taken to sort a list is proportional to the number of elements in the list; this is the case when the list is already in the correct order. There’s only one iteration in this case since the inner loop operation is trivial when the list is already in order.


**Now that we have learned "Insertion Sort", let's sort the following array according to this algorithm.**

- **[22,27,16,2,18,6]**


### Step 1

As we said before, the algorithm starts with the second element in the array. In this case, we are going to start with 27. In Step 1, we checked if 27 is smaller than 22. Since it is greater than 22, we didn't move 27.

    [22,27,16,2,18,6]

### Step 2

Then, we are going to compare 16 with 27. After 27, we will compare it with 22 too. After that, we will do the same for the rest till the point where we know the array has been sorted.

    [16,22,27,2,18,6]

### Step 3

    [2,16,22,27,18,6]

### Step 4

    [2,16,18,22,27,6]

### Step 5

    [2,6,16,18,22,27]

### FINALLY

Our array has been sorted and looks like this;

    [22,27,16,2,18,6] ----{Insertion Sort Algorithm}----> [2,6,16,18,22,27]

So, when we come to the question; ***What case does the number 18 fall into after the array is sorted?***

In this case, our array has been sorted and looks like this; [2,6,16,18,22,27]. So 18 is in the middle of the array. That means, if we want to find number 18 in the array the case of complexity will be ***"Average Case"***, which is **O(n^2)**.

---

### **Lastly, sort the array below with Insertion Sort and write its first 4 steps.**
	
- **[7,3,5,8,2,9,4,15,6]**

### **Step 1**

    [3,7,5,8,2,9,4,15,6]

### **Step 2**

    [3,5,7,8,2,9,4,15,6]

### **Step 3**

    [3,5,7,8,2,9,4,15,6]

### **Step 4**

    [2,3,5,7,8,9,4,15,6]

**So, you, now, able to finish the rest of the sorting activity. Aren't you? :)**

## THANK YOU!

----> **[LinkedIn](https://www.linkedin.com/in/ali-yavuz-yalcin/)**
