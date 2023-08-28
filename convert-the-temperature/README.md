# Description
You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
<br>
You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
<br>
Return the array <b>ans</b>. Answers within 10-5 of the actual answer will be accepted.
<br><br>
Note that:
- Kelvin = Celsius + 273.15
- Fahrenheit = Celsius * 1.80 + 32.00

# Example 1
<b>Input:</b> celsius = 36.50
<br>
<b>Output:</b> [309.65000,97.70000]
<br>
<b>Explanation:</b> Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

# Example 2
<b>Input:</b> celsius = 122.11
<br>
<b>Output:</b> [395.26000,251.79800]
<br>
<b>Explanation:</b> Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.

# Constraints
- 0 <= celsius <= 1000