# Description
Write an algorithm to determine if a number n is happy.
<br>
A happy number is a number defined by the following process:

- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
- Those numbers for which this process ends in 1 are happy.

Return true if n is a happy number, and false if not.

# Example 1
<b>Input:</b> n = 19
<br>
<b>Output:</b> true
<br>
<b>Explanation:</b>
<br>
1<sup>2</sup> + 9<sup>2</sup> = 82
<br>
8<sup>2</sup> + 2<sup>2</sup> = 68
<br>
6<sup>2</sup> + 82 = 100
<br>
1<sup>2</sup> + 0<sup>2</sup> + 0<sup>2</sup> = 1

# Example 2
<b>Input:</b> n = 2
<br>
<b>Output:</b> false


# Constraints
1 <= n <= 231 - 1