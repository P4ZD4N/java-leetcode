# Description
You are given an array items, where each items[i] = [type<sub>i</sub>, color<sub>i</sub>, name<sub>i</sub>] describes the type, color, and name of the i<sup>th</sup> item. You are also given a rule represented by two strings, ruleKey and ruleValue.
<br>
The i<sup>th</sup> item is said to match the rule if one of the following is true:

- ruleKey == "type" and ruleValue == type<sub>i</sub>.
- ruleKey == "color" and ruleValue == color<sub>i</sub>.
- ruleKey == "name" and ruleValue == name<sub>i</sub>.

Return the number of items that match the given rule.

# Example 1
<b>Input:</b> items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
<br>
<b>Output:</b> 1
<br>
<b>Explanation:</b> There is only one item matching the given rule, which is ["computer","silver","lenovo"].

# Example 2
<b>Input:</b> items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
<br>
<b>Output:</b> 2
<br>
<b>Explanation:</b> There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.

# Constraints
- 1 <= items.length <= 104
- 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
- ruleKey is equal to either "type", "color", or "name".
- All strings consist only of lowercase letters.