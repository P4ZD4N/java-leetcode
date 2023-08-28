class Solution {
    public double[] convertTemperature(double celsius) {
        if (0 > celsius) {
            throw new IllegalArgumentException("Temperature must be greater than or equal to 0");
        } else {
            double kelvin = celsius + 273.15;
            double fahrenheit = celsius * 1.80 + 32.00;
            double[] ans = new double[] {kelvin, fahrenheit};
            return ans;
        }
    }
}
