# Trees
A binary tree is a recursive data structure where each node can have 2 children at most.

A common type of binary tree is a binary search tree, in which every node has a value that is greater than or equal to the node values in the left sub-tree, and less than or equal to the node values in the right sub-tree.

## Challenge
**Node**

* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

**Binary Tree**

* Create a Binary Tree class
* Define a method for each of the depth first traversals:
  
  1- pre order

  2- in order

  3- post order which returns an array of the values, ordered appropriately.

**Binary Search Tree**

* Create a Binary Search Tree class: This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:

* Add :
  1- Arguments: value
  
  2- Return: nothing

  Adds a new node with that value in the correct location in the binary search tree.

* Contains:

  1- Argument: value

  2- Returns: boolean indicating whether or not the value is in the tree at least once.

