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

## Code Challenge 16

**Challenge Summary**
Given a Binary Tree, find the maximum(or minimum) element in it.

**Whiteboard Process**
![whiteboard](https://am3pap003files.storage.live.com/y4mF6qPXnuC3sa71SNjfbAyxYRwiUkai6K2qgWeqgc5lZHHXHopsk-a_no_LOdMENZlGEZ-VZR1MePcxLIenjr1hPqM-8siPZ8uAWaY7DggTxIdoEgEHsmwIZwgYu2xKq-qFeLZsimFVdZZvo_OUo6vCyphqggk4wC94hLzHnuIwdDBpCk_43kWmmFraGAxkouPPpQG0h6JixtrmQpNvpxrqQ/code%20challenge%2016.png?psid=1&width=1771&height=780)

## Approach & Efficiency

We must check every node to figure out maximum. So the idea is to traverse the given tree and for every node return maximum of 3 values.

* Node’s key.
* Maximum in node’s left subtree.
* Maximum in node’s right subtree.

Time Complexity :  O(n)

