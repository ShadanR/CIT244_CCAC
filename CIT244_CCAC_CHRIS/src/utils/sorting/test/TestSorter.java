/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.sorting.test;

import java.math.BigInteger;
import utils.sorting.Sorter;
import week10.TimePractice;
import week8.spooky.SpookyTest;

/**
 * Class to test the SortUtility
 *
 * @author christopher.eckles
 */
public class TestSorter {

    public static void main(String[] args) {
        
        SorterUnitTests.runTest();

//           callMyself(10);
        
//        System.out.println("Creating a new sort utility");
        Sorter su;
//
//        System.out.println("Turning on debugging");
//        su.setDebug(true);
//
//        System.out.println("FIRST TEST......");
//
        su = new Sorter();
        
        ///create an int array with random numbers;
        
        
        //copy int array
        
        //time a

        
        
        //sort using bubble sort
        
        //time b
        //print difference
        
        //time a

        
        
        //sort using bucket sort
        
        //time b
        //print difference
        int[] sortInts = new int[]{6,4,1,7,3,2};
        printIntArray(sortInts);
        TimePractice.getTimestamp();
        su.bucketSort(sortInts);
        TimePractice.getTimestamp();
        printIntArray(sortInts);
        
        su = new Sorter();
        int[] sortInts2 = new int[]{10,6,4,1};
        printIntArray(sortInts2);
        su.bucketSort(sortInts2);
        printIntArray(sortInts2);
//        
//
//        System.out.println("SECOND TEST.....");
//        BigInteger[] sortBigIntegers = {BigInteger.valueOf(23232), BigInteger.valueOf(1), BigInteger.valueOf(982342), BigInteger.valueOf(234343), BigInteger.valueOf(3), BigInteger.valueOf(2), BigInteger.valueOf(1), BigInteger.valueOf(9), BigInteger.valueOf(97)};
//        printArray(sortBigIntegers);
//        su.sort(sortBigIntegers);
//        printArray(sortBigIntegers);
//
//        System.out.println("NEXT TEST.....");
//        String[] sortString = {"Zelda", "Test", "Second", "Third", "Aaron"};
//        printArray(sortString);
//        su.sort(sortString);
//        printArray(sortString);
//        
//      System.out.println("FAILED TEST.....");
//      Comparable[] sortRandomObjects = {"Zelda",BigInteger.valueOf(23232), Long.lowestOneBit(0),"Third","Aaron"};
//      printArray(sortRandomObjects);
//      su.sort(sortRandomObjects);
//      printArray(sortRandomObjects);

    }

    public static void printIntArray(int[] array) {
        System.out.print("Printing Array:   ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((array.length - 1) == i ? "\n\n\n" : ", "));
        }
    }

    public static void printArray(Object[] array) {
        System.out.print("Printing Array:   ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].toString() + ((array.length - 1) == i ? "\n\n\n" : ", "));
        }
    }
    
    
    public static void callMyself(int i ){
        System.out.println(SpookyTest.indent(11-i)+ "Value i: " + i);
        if(i > 0){
        callMyself(i-1);
        }
        System.out.println(SpookyTest.indent(11-i)+ "  End i: "  + i);
    }
}
