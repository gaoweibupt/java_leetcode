# [Java_Leetcode](https://leetcode.com/)
按题目顺序进行排序
### [1.Two Sum](https://leetcode.com/problems/two-sum/)
Given an array of integers, find two numbers such that they add up to a specific target number.
* 向后遍历数组，直到获得两个数的和是给定的值

### [2.Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)
You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
* 新建一个链表，同时向后遍历两个链表，将他们的value相加

### [3.Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
Given a string, find the length of the longest substring without repeating characters. For example, the longest substring without repeating letters for "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
* 使用两个标志位遍历字符串，保证两个标志位之间没有重复的字符，记录它们之间最大的差则为最长的非重复字符字符串

### [4.Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/)
There are two sorted arrays nums1 and nums2 of size m and n respectively. Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
* 要求的算法复杂度为O(log (m+n))，所以不能使用传统的遍历方法，二分查找的算法复杂度为O(log (n))，所以该题目使用二分查找法来查找数组中的第k个元素。依次对nums1 和 nums2 进行二分，而不是对整体数组进行二分。另外需要注意，要求的返回值为double类型，以及输入的数组有没有空的情况。

### [5.Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
* 回文字符串最简单的是枚举字符串中的每一个子串，复杂度为O(N^3)；现在做了稍许改进，枚举每一个子回文串的中点，算法复杂度为O(N^2)，但是要注意回文串的长度为奇数还是偶数的问题。
* 还有一些线性时间的回文串检测算法，待学习

### [6.ZigZag Conversion](https://leetcode.com/problems/zigzag-conversion/)
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)      
```java
P   A   H   N     
A P L S I I G    
Y   I   R   
```
And then read line by line: "PAHNAPLSIIGYIR"
* 锯齿状String，例如：    
```java
A     G     M   
B   F H   L  
C E   I K   
D     J   
```
所以每一行中，与下一个字符的距离可以求出来

### [7.Reverse Integer](https://leetcode.com/problems/reverse-integer/)
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
* 需要特别注意边界条件

### [8.String to Integer (atoi)](https://leetcode.com/problems/string-to-integer-atoi/)
Implement atoi to convert a string to an integer.
* 实现函数atoi，就是从第一个非空字符开始转换直到遇到非数字字符停止。

### [9.Palindrome Number](https://leetcode.com/problems/palindrome-number/)
Determine whether an integer is a palindrome. Do this without extra space
* 特别注意条件不使用额外的空间，所以不能使用字符串，需要将int倒序保存在另一个int中

### [10.Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/)
Implement regular expression matching with support for '.' and '*'.   
'.' Matches any single character.   
'*' Matches zero or more of the preceding element.   
The matching should cover the entire input string (not partial).   
The function prototype should be:   
bool isMatch(const char *s, const char *p)   
Some examples:    
isMatch("aa","a") → false   
isMatch("aa","aa") → true   
isMatch("aaa","aa") → false   
isMatch("aa", "a*") → true   
isMatch("aa", ".*") → true    
isMatch("ab", ".*") → true     
isMatch("aab", "c*a*b") → true    
* 可以使用递归或者是动态规划的方式
* 递归时，需要判断p字符串的第二位是否为*，不是则都向后移一位；是则检测p向后移两位是否可以，不可以则s向后移一位

### [11.Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.   
Note: You may not slant the container.
* 从两端不断向中间靠拢遍历，复杂度O(N)
