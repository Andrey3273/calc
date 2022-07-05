import java.util.Scanner;

class Calculator {
    public static void main(String[] args) throws Exception {
        int num1 = 0, num2 = 0;
        int result = 0;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int length = str.length();
        if (length < 5) {
            throw new Exception("Строка не является математической операцией");
        }
        String[] words = str.split(" ");
        for (String word : words) {
        }
        if (length > 8) {
            String string = words[3];
            if (string.equals("+")) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            if (string.equals("-")) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            if (string.equals("*")) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            if (string.equals("/")) {
                throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
        try {
            num1 = Integer.parseInt(words[0]);
            num2 = Integer.parseInt(words[2]);
            if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
                String operation = words[1];
                if (operation.equals("+")) {
                    result = num1 + num2;
                }
                if (operation.equals("-")) {
                    result = num1 - num2;
                }
                if (operation.equals("*")) {
                    result = num1 * num2;
                }
                if (operation.equals("/")) {
                    result = num1 / num2;
                }
            } else throw new Exception("Введенные числа не от 1 до 10");
            System.out.println(result);
        } catch (NumberFormatException e) {
            num1 = romanToNumber(words[0]);
            num2 = romanToNumber(words[2]);
            if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
                String operation = words[1];
                if (operation.equals("+")) {
                    result = num1 + num2;
                }
                if (operation.equals("-")) {
                    result = num1 - num2;
                    if (result < 1) {
                        throw new Exception("В римской системе нет отрицательных чисел и нуля");
                    }
                }
                if (operation.equals("*")) {
                    result = num1 * num2;
                }
                if (operation.equals("/")) {
                    result = num1 / num2;
                }
                String resultRoman = convertNumToRoman(result);
                System.out.println(resultRoman);
            } else
                throw new Exception("Используются одновременно разные системы счисления. Введите: Ариф. + Ариф или Рим. + Рим.");
        }
    }

    private static String convertNumToRoman(int numArabian) {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        final String s = roman[numArabian];
        return s;
    }


    private static int romanToNumber(String roman) {
        if (roman.equals("I")) {
            return 1;
        } else if (roman.equals("II")) {
            return 2;
        } else if (roman.equals("III")) {
            return 3;
        } else if (roman.equals("IV")) {
            return 4;
        } else if (roman.equals("V")) {
            return 5;
        } else if (roman.equals("VI")) {
            return 6;
        } else if (roman.equals("VII")) {
            return 7;
        } else if (roman.equals("VIII")) {
            return 8;
        } else if (roman.equals("IX")) {
            return 9;
        } else if (roman.equals("X")) {
            return 10;
        }
        return -1;
    }
}