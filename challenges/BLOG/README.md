# Blog
## Code Challenge 26

**Challenge Summary**

* Write a function that sort an array element.

**Whiteboard Process**
![whiteboard](https://am3pap003files.storage.live.com/y4mx4o_cQP5F_0hYxpa2OMedzZztkunjhtkf-yjUCJ6bkzucQIdJwMgFQFG1ctaoovz2DOE6vhyWuaqfkR5jNfluzHxXJfFXr3y7bGibafAXqd5sj7ZKy4Za7NPQBOnj08Odi579_Q4hZUFW3ONVMggWXyfWamNQeIkH6UGqzzscO25p4RVKUZY7wFhXHrazKc8pz-yOniJ6Pc2hva1dOSzGg/code%20challenge%2026.png?psid=1&width=1526&height=709)

## Approach & Efficiency


Selection Sort is a sorting algorithm that traverses the array multiple times as it slowly builds out the sorting sequence. The traversal keeps track of the minimum value and places it in the front of the array which should be incrementally sorted.

Time Complexity :  O(n^2) : Two loops.

## Code Challenge 27

**Challenge Summary**

* Write a function that sort an array element using merge sort approach.

**Whiteboard Process**
![whiteboard](img/code challenge 27.png)

## Approach & Efficiency
1. Find the middle point to divide the array into two halves.
2. Call mergeSort for first half.
3. Call mergeSort for second half.
4. Merge the two halves sorted in step 2 and 3.

Time Complexity : O(nLogn)

Merge Sort is a recursive algorithm and time complexity can be expressed as following recurrence relation.

T(n) = 2T(n/2) + O(n)