package com.m3c.BinaryTree;

import java.util.List;

/**********************
 * Name: BinarySearchTree
 * Author: Alex Ingram
 * Version: 1.0
 * TODO: Test
 **********************/
public class Main
{
    public static void main( String[] args ) {

        int[] arr = {2, 4, 15, 1, 11, 14, 13, 7, 15, 12, 10, 4, 15};

        BinarySearchTree bTree = new BinarySearchTree(arr);
        System.out.println(bTree.getNumberOfElements());
        System.out.println(bTree.getRootElement());
        System.out.println(bTree.findElement(2));
        try {
            System.out.println(bTree.getLeftChild(11));
        } catch (ElementNotFoundException ex) {}
        try {
            System.out.println(bTree.getRightChild(2));
        } catch (ElementNotFoundException ex) {}

        List<Integer> list = bTree.getSortedTreeAsc();
        for (int item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
