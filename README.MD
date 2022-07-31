# Core Java Problem Statements for Hands-on practice

## Working Environment

Didn't used any build tool such as Maven or Gradle as this code we will not be used in production.

**Explicitly downloaded the jar files required in the lib folder for solving the below problems:-**

## Problem 1

Create class box and box3d. box3d is extended class of box. The above two classes going to pull fill following requirement Include constructor,set value of length, breadth, height. Find out area and volume.

Note: **Base class and sub classes have respective methods and instance variables**.

## Problem 2

Create class Number with only one private instance variable as a double primitive type. To include the following methods (include respective constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ),isPrime(), isAmstrong() the above methods return boolean primitive type. getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above methods return double primitive type. void listFactor(), void dispBinary().

## Problem 3

Write a program to create a class named shape. In this class we have three sub classes circle, triangle and square each class has two member function named draw () and erase (). Create these using polymorphism concepts.

## Problem 4

Write a program to find the solution for the following problems using
Recursion.
 i)Find the maximum of an array. Let a[] be an array of integers. if n= 1,a[0] is the only number in the array and so, maximum = a[0]. if n > 1 ,then do the following: find the maximum of n-1 entries of the array.Compare this maximum with the last entry a[n-1] and finalize.
ii) Find the Fibonacci numbers are defined as F0=1,F1=1 and Fi=Fi-1+Fi-2 for i >2.

## Problem 5

i) Write a program that will
- append 2 List of Students collections
- and make sure the appended list has only unique objects (by value)

ii) write a program that will
- Search a arraylist of students, for matching firstname and lastname
Show case with for loop and iterator option

## Problem 6

Write a program to maintain students information in a hashmap, using students id as key and students objects as value. And perform following action fetch students objects based on supplied key (students id) search students value(s) based on name and email sort the students objects values based on name and email.

## Problem 7

Write a program that will add a group of students to a treeset, and write the sorted contents to a file.

## Problem 8

Write a program to show case Upper and lower bound generics

## Problem 9

Develop a Program using Runnable that will
Read a large volume of data(10K of Students[id, name, subject,marks scored] records) from CSV file, and load it to an LinkedList.Split the list into multiple partition Spin out a thread that will process each partition, and in the thread logic identify stuedents who scored distinction, passed, not cleared category (based on the marks) Write the content to another file.
Employ start, yeild, join methods.

## Problem 10

I have a large size integer array. Develop a program with 2 threads. Thread 1 prints only even number from this input array, and Thread 2 prints only odd number. The logic should be such a way that, the identfication and printing should happen in alternate fashion.Employ Notify,sleep and wait methods

