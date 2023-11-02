# Description
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
<br><br>
In the American keyboard:
- the first row consists of the characters "qwertyuiop",
- the second row consists of the characters "asdfghjkl", and
- the third row consists of the characters "zxcvbnm".

# Example 1
<b>Input:</b> words = ["Hello","Alaska","Dad","Peace"]
<br>
<b>Output:</b> ["Alaska","Dad"]

# Example 2
<b>Input:</b> words = ["omk"]
<br>
<b>Output:</b> []

# Example 3
<b>Input:</b> words = ["adsdf","sfd"]
<br>
<b>Output:</b> ["adsdf","sfd"]


# Constraints:
- 1 <= words.length <= 20
- 1 <= words[i].length <= 100
- words[i] consists of English letters (both lowercase and uppercase). 