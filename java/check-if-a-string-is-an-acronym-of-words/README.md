# Description
Given an array of strings words and a string s, determine if s is an acronym of words.
<br>
The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
<br>
Return true if s is an acronym of words, and false otherwise.

# Example 1
<b>Input:</b> words = ["alice","bob","charlie"], s = "abc"
<br>
<b>Output:</b> true
<br>
<b>Explanation:</b> The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.

# Example 2:
<b>Input:</b> words = ["an","apple"], s = "a"
<br>
<b>Output:</b> false
<br>
<b>Explanation:</b> The first character in the words "an" and "apple" are 'a' and 'a', respectively.
<br>
The acronym formed by concatenating these characters is "aa".
<br>
Hence, s = "a" is not the acronym.

# Example 3
<b>Input:</b> words = ["never","gonna","give","up","on","you"], s = "ngguoy"
<br>
<b>Output:</b> true
<br>
<b>Explanation:</b> By concatenating the first character of the words in the array, we get the string "ngguoy".
<br>
Hence, s = "ngguoy" is the acronym.

# Constraints
- 1 <= words.length <= 100
- 1 <= words[i].length <= 10
- 1 <= s.length <= 100
- words[i] and s consist of lowercase English letters.