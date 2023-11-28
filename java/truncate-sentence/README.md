# Description
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).

- For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.

You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

# Example 1
<b>Input:</b> s = "Hello how are you Contestant", k = 4
<br>
<b>Output:</b> "Hello how are you"
<br>
<b>Explanation:</b>
<br>
The words in s are ["Hello", "how" "are", "you", "Contestant"].
<br>
The first 4 words are ["Hello", "how", "are", "you"].
<br>
Hence, you should return "Hello how are you".

# Example 2
<b>Input:</b> s = "What is the solution to this problem", k = 4
<br>
<b>Output:</b> "What is the solution"
<br>
<b>Explanation:</b>
<br>
The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
<br>
The first 4 words are ["What", "is", "the", "solution"].
<br>
Hence, you should return "What is the solution".

# Example 3
<b>Input:</b> s = "chopper is not a tanuki", k = 5
<br>
<b>Output:</b> "chopper is not a tanuki"

# Constraints
- 1 <= s.length <= 500
- k is in the range [1, the number of words in s].
- s consist of only lowercase and uppercase English letters and spaces.
- The words in s are separated by a single space.
- There are no leading or trailing spaces.