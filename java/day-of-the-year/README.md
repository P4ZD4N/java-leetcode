# Description
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

# Example 1
<b>Input:</b> date = "2019-01-09"
<br>
<b>Output:</b> 9
<br>
<b>Explanation:</b> Given date is the 9th day of the year in 2019.

# Example 2
<b>Input:</b> date = "2019-02-10"
<br>
<b>Output:</b> 41

# Constraints
- date.length == 10
- date[4] == date[7] == '-', and all other date[i]'s are digits
- date represents a calendar date between Jan 1<sup>st</sup>, 1900 and Dec 31<sup>th</sup>, 2019.