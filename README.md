# Converter-from-binary-to-hexidecimal-and-vice-versa
The task is taken from the JavaRush website, the converter checks the passed parameter for validity and returns a hexadecimal representation of a binary number and vice versa.
The public static method toHex(String) must translate the string representation of a binary number received as an incoming parameter from binary to hexadecimal and return its string representation.
And the public static method toBinary(String) on the contrary — from a string representation of a hexadecimal number to a string representation of a binary number.
The methods only work with non-empty strings. If the incoming parameter is an empty string or null, then both methods return an empty string. If the incoming parameter of the toHex(String) method contains any character other than 0 or 1, the method returns an empty string. If the incoming parameter of the toBinary(String) method contains any character except digits from 0 to 9 or a Latin letter from a to f (in lowercase), the method returns an empty string.
Your task is to implement these methods.
One of the algorithms for translating a string representation of a binary number into a string representation of a hexadecimal number is as follows:
Check the length of the string received by the incoming parameter. It must be a multiple of 4.
If this is not the case, then add the required number of 0 to the beginning of the line. We take every four characters (bits) and check which hexadecimal character it corresponds to. For example:
the binary representation is "100111010000", where "1001" — "9", "1101" — " d", "0000" — "0", the hexadecimal representation is "9d0".
One of the algorithms for translating a string representation of a hexadecimal number into a string representation of a binary number is as follows: We take each character and check which binary number (4 bits) it corresponds to.
For example:
the hexadecimal representation is "9d0", where "9" is "1001", "d" — "1101", "0" — "0000", the binary representation is "100111010000". The main() method does not participate in testing.



