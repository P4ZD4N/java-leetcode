# Description
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i<sup>th</sup> customer has in the j<sup>th</sup> bank. Return the wealth that the richest customer has.
<br>
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

# Example 1
<b>Input:</b> accounts = [[1,2,3],[3,2,1]]
<br>
<b>Output:</b> 6
<br>
<b>Explanation:</b>
- 1st customer has wealth = 1 + 2 + 3 = 6
- 2nd customer has wealth = 3 + 2 + 1 = 6

Both customers are considered the richest with a wealth of 6 each, so return 6.

# Example 2
<b>Input:</b> accounts = [[1,5],[7,3],[3,5]]
<br>
<b>Output:</b> 10
<br>
<b>Explanation:</b>
- 1st customer has wealth = 6
- 2nd customer has wealth = 10
- 3rd customer has wealth = 8

The 2nd customer is the richest with a wealth of 10.

# Example 3
<b>Input:</b> accounts = [[2,8,7],[7,1,3],[1,9,5]]
<br>
<b>Output:</b> 17

# Constraints
- m == accounts.length
- n == accounts[i].length
- 1 <= m, n <= 50
- 1 <= accounts[i][j] <= 100