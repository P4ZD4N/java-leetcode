class Solution {
    public String defangIPaddr(String address) {
        String[] octets = address.split("\\.");
        if (octets.length == 4 && areAllOctetsCorrect(octets)) {
            return address.replace(".", "[.]");
        } else {
            throw new IllegalArgumentException("Invalid IP address");
        }
    }
    private boolean areAllOctetsCorrect(String[] octets) {
        int correctOctets = 0;
        for (String octet : octets) {
            int octetToInt = Integer.parseInt(octet);
            if (octetToInt >= 0 && 255 >= octetToInt) {
                correctOctets++;
            }
        }
        return correctOctets == 4;
    }
}
