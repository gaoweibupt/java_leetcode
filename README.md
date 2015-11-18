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
