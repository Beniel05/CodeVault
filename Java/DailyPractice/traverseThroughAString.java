package Java.DailyPractice;
class traverseThroughAString {
    public static void main(String[] args) {
        String s = "Hello World";
        for (int i = 0; i < s.length(); i++) {
            if ('o' == s.charAt(i)) {
                System.out.print('o');
            } else if (' ' == s.charAt(i)) {
                System.out.print("  ");
            } else {
                System.out.print(" _ ");
            }
        }
    }
}