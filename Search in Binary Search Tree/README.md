                                Search in Binary Search Tree:

Binary Search Tree is based on the following principles:
1) Value of left node is less than the value of parent node.
2) Value of right node is greater than the value of parent node.
3) Left and Right Subtree must also be binary search trees and follow the above constraints.

                10
               /   \
              5     15
             / \    / \
            1   7  12  18

So, we will compare the value of node with given val and there will be following cases:
* if node is null return null.
* if value of node equals given target value return node.
* If value of current node is greater than given target val then recursively search in left   subtree else recursively search in right subtree.

Time Complexity - O(h) where h is the height of binary search tree.