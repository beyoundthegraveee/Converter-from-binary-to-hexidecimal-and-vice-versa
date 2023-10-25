public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number: " + binaryNumber + " = Hexadecimal  number: " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal  number: " + hexNumber + " = Binary number: " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        if (binaryNumber == null || binaryNumber.isEmpty()) {
            return hexNumber;
        } else if (!binaryNumber.matches("^[0-1]*$")) {
            return hexNumber;
        }
        if(binaryNumber.length() % 4 != 0) {
            while (binaryNumber.length() % 4 != 0) {
                String zero = "0";
                binaryNumber += zero;
            }
        }
        StringBuilder result = new StringBuilder(binaryNumber);
        String element;
        for (int i = 0; i < binaryNumber.length(); i += 4) {
            String substring = result.substring(i, i + 4);
            if (substring.equals("0000")) {
                element = "0";
            } else if (substring.equals("0001")) {
                element = "1";
            } else if (substring.equals("0010")) {
                element = "2";
            } else if (substring.equals("0011")) {
                element = "3";
            } else if (substring.equals("0100")) {
                element = "4";
            } else if (substring.equals("0101")) {
                element = "5";
            } else if (substring.equals("0110")) {
                element = "6";
            } else if (substring.equals("0111")) {
                element = "7";
            } else if (substring.equals("1000")) {
                element = "8";
            } else if (substring.equals("1001")) {
                element = "9";
            } else if (substring.equals("1010")) {
                element = "a";
            } else if (substring.equals("1011")) {
                element = "b";
            } else if (substring.equals("1100")) {
                element = "c";
            } else if (substring.equals("1101")) {
                element = "d";
            } else if (substring.equals("1110")) {
                element = "e";
            } else if (substring.equals("1111")) {
                element = "f";
            } else {
                break;
            }

            hexNumber += element;
        }


        return hexNumber;
    }

    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (hexNumber == null || hexNumber.equals("")) {
            return binaryNumber;
        }
        if(!hexNumber.matches("^[0-9-a-f]+$")){
            return binaryNumber;
        }
        String element;
        StringBuilder result = new StringBuilder(hexNumber);
        for (int i = 0; i < hexNumber.length(); i++) {
            String substring = result.substring(i, i+1);
            if (substring.equals("0")) {
                element = "0000";
            } else if (substring.equals("1")) {
                element = "0001";
            } else if (substring.equals("2")) {
                element = "0010";
            } else if (substring.equals("3")) {
                element = "0011";
            } else if (substring.equals("4")) {
                element = "0100";
            } else if (substring.equals("5")) {
                element = "0101";
            } else if (substring.equals("6")) {
                element = "0110";
            } else if (substring.equals("7")) {
                element = "0111";
            } else if (substring.equals("8")) {
                element = "1000";
            } else if (substring.equals("9")) {
                element = "1001";
            } else if (substring.equals("a")) {
                element = "1010";
            } else if (substring.equals("b")) {
                element = "1011";
            } else if (substring.equals("c")) {
                element = "1100";
            } else if (substring.equals("d")) {
                element = "1101";
            } else if (substring.equals("e")) {
                element = "1110";
            } else if (substring.equals("f")) {
                element = "1111";
            } else {
                break;
            }
            binaryNumber+=element;
        }
        return binaryNumber;
    }

}
