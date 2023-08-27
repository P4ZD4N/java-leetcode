# Description
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
<br>
Return the shuffled string.

# Example 1
<b>Input:</b> s = "codeleet", indices = [4,5,6,7,0,2,1,3]
<br>
<b>Output:</b> "leetcode"
<br>
<b>Explanation:</b> As shown, "codeleet" becomes "leetcode" after shuffling.

# Example 2

<b>Input:</b> s = "abc", indices = [0,1,2]
<br>
<b>Output:</b> "abc"
<br>
<b>Explanation:</b> After shuffling, each character remains in its position.


# Constraints
- s.length == indices.length == n
- 1 <= n <= 100
- s consists of only lowercase English letters.
- 0 <= indices[i] < n
- All values of indices are unique.