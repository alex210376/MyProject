package academy.lesson03;

public class MyString {
    public static void main(String[] args) {
        String str1 = "abcd";
        System.out.println("Исходная строка:"+str1);
        char s1 = str1.charAt(3);
        //System.out.println(s1);
        char s2 = str1.charAt(2);
        //System.out.println(s2);
        char s3 = str1.charAt(1);
        //System.out.println(s3);
        char s4 = str1.charAt(0);
        //System.out.println(s4);

        char[] tmp = {s1, s2, s3, s4};
        String reversed = new String(tmp);
        System.out.println("Перевернутая строка:"+reversed);
    }
}
