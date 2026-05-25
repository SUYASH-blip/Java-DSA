package Strings;

public class IndexOf {
    public static void main(String[] args) {
        String s = "Suyash";
        System.out.println(s.indexOf('S')); // Return First Occurence
        System.out.println(s.indexOf('v')); // Returns -1 for false values
        System.out.println(s.lastIndexOf('h'));//Return last occurence
        System.out.println(s.lastIndexOf('S'));
        System.out.println(s.lastIndexOf('t'));//Return -1 if not found
        String a = "banana";
        System.out.println(a.indexOf('a'));
        System.out.println(a.lastIndexOf('a'));

    }
}
