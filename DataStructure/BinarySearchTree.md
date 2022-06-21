# Binary Search Tree
---
[Patika.dev](www.patika.dev)


Search algorithms consist of two elements; Linear Search and Binary Search.

### Linear Search
---

-	It searches through the list by looking at each elements.
-	If there are N elements;

	-	**Worst case:** would be O(n).


### Binary Search
---
-	We assume that the list is ordered.
-	Instead of looking at the elements one by one, half of the list is looked at. If the sought element is in the first half, the remaining half is discarded. In this way, the sought element is reached by dividing the problem in half.

	-	2^x = n ---> x = logn which means O(logn) is the time complexity of this algorithm.

### Binary Search Tree
---

*	It is one of the data structures consisting of nodes and each node has a maximum of 2 child nodes.
*	There is a **root** and root has elements greater than itself to the right and elements less than root to the left.

---

### In the light of the above information, let's write the stages of **[7,5,1,8,3,6,0,9,4,2]** sequence according to the ***Binary Search Tree*** algorithm.

## Solution

First, let's choose a '***root*** '. Let's set the root as **7**.

In this case, numbers greater than 7 will be written to the right of 7, and numbers less than 7 will be written to the left of 7. This process will be applied to each node in the same way. So our 'tree' structure will be like this;

![Binary-Search-Tree](https://user-images.githubusercontent.com/63460173/174351713-1e565588-8441-4b46-857f-da4779b76e97.jpg)


---

## THANK YOU!

**[LinkedIn](https://www.linkedin.com/in/ali-yavuz-yalcin/)**
