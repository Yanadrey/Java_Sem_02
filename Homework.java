public class Homework {

    /**
     * 1. Реализовать метод isPalindrome
     * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
     */

    /**
     * Проверить, является ли строка палиндромом.
     * Палиндром - это строка, которая читается одинаково слева и справа
     * abcdedcba -> true
     * a -> true
     * abc -> false
     * abcd -> false
     * abba -> true
     */
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcdedcba"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("abc"));
        System.out.println(isPalindrome("abcd"));
        System.out.println(isPalindrome("abba"));
    }

    public static boolean isPalindrome(String source) {
        char[] arr = source.toCharArray();
        for (int i=0; i< arr.length/2; i++){
        if (arr[i]!=arr[arr.length-1-i]) {
            return false;
        }
        }     
    return true;
    }
}

