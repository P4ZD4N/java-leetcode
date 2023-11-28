# Description
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
<br>
For each index i, names[i] and heights[i] denote the name and height of the ith person.
<br>
Return names sorted in <b>descending</b> order by the people's heights.

# Example 1
<b>Input:</b> names = ["Mary","John","Emma"], heights = [180,165,170]
<br>
<b>Output:</b> ["Mary","Emma","John"]
<br>
<b>Explanation:</b> Mary is the tallest, followed by Emma and John.

# Example 2
<b>Input:</b> names = ["Alice","Bob","Bob"], heights = [155,185,150]
<br>
<b>Output:</b> ["Bob","Alice","Bob"]
<br>
<b>Explanation:</b> The first Bob is the tallest, followed by Alice and the second Bob.


# Constraints:
- n == names.length == heights.length
- 1 <= n <= 103
- 1 <= names[i].length <= 20
- 1 <= heights[i] <= 105
- names[i] consists of lower and upper case English letters.
- All the values of heights are distinct.