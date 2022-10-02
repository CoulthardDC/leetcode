import java.nio.file.Paths;

public class Main{
    public static void main(String[] args) {
        String test = "MCMXCIV";
        int result = romanToInt(test);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'V') {
                        i++;
                        result += 4;
                    } else if (s.charAt(i + 1) == 'X') {
                        i++;
                        result += 9;
                    } else {
                        result += 1;
                    }
                } else {
                    result += 1;
                }
            } else if (s.charAt(i) == 'V') {
                result += 5;
            } else if (s.charAt(i) == 'X') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'L') {
                        i++;
                        result += 40;
                    } else if (s.charAt(i + 1) == 'C') {
                        i++;
                        result += 90;
                    } else {
                        result += 10;
                    }
                } else {
                    result += 10;
                }
            } else if (s.charAt(i) == 'L') {
                result += 50;
            } else if (s.charAt(i) == 'C') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'D') {
                        i++;
                        result += 400;
                    } else if (s.charAt(i + 1) == 'M') {
                        i++;
                        result += 900;
                    } else {
                        result += 100;
                    }
                } else {
                    result += 100;
                }
            } else if (s.charAt(i) == 'D') {
                result +=  500;
            } else if (s.charAt(i) == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}