# What is Merge Sort?

[www.patika.dev](www.patika.dev)

> **[16,21,11,8,12,22]** --> Let's sort this array with Merge Sort algorithm.
> 
> - Write down the steps.
> - Show the Bog-O notation.

---

## What is Merge Sort?

It is one of the sorting algorithms developed to keep the data in order in memory. **It simply divides the array to be sorted in two continuously until its two elements are reduced to the remaining parts.** Then the algorithm combines these parts in order among themselves. The resulting array is the sorted array itself. In this respect, it is a *divide and conquer approach*.

> The complexity of this algorithm is **O(nlogn)**.

We will start with splitting the array into two pieces.

Our array is;

    [16,21,11,8,12,22]

### Step 1

When I divide it into two;

    [16,21,11] || [8,12,22]

### Step 2

Then I will split this two different array into two again.

    [16] - [21,11] || [8] - [12,22]

Now, I can compare the element 16 with other first two elements. I will do the same for also the other group of element. 

### Step 3

I will ask 21 that if it is greater than 16 or not. If yes, I will write it on the right side of 16. So, this will look like;

    [11,16,21]

### Step 4

Now, let's do the same thing with the other group of elements.

     [8,12,22]

It was already sorted, so I didn't change anything.

### Step 5

Now, we will combine these two different array into one. But, I will ask pair of [11] and [8] that which one is the greater one. Since [11] is greater than [8], I will write [11] on the left side of [8]. Looks like this;

    [8,11,12,16,21,22]

### Finally

We've sorted the array **[16,21,11,8,12,22]** and it becomes this; **[8,11,12,16,21,22].**

## THANK YOU!

-----> [LinkedIn](https://www.linkedin.com/in/ali-yavuz-yalcin/)

