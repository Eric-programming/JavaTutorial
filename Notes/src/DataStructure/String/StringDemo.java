package DataStructure.String;

/**
 * String is basically Arrays of Unicode Characters
 */
public class StringDemo {
    public static void main(String[] args) {
        // initialize
        String s1 = "Hello World";
        System.out.println("s1 is " + s1);
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
        String s3 = new String(s1);
        System.out.println("s3 is a copy of s1.");
        // compare using '=='
        System.out.println("Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("s1 and Hello World: " + (s1 == "Hello World"));
        // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is refered to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("s1 and Hello World: " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3 + "12"));
        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("s1 and Hello World: " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));

        s1 = "Hello World";
        System.out.println(s1.substring(6, 11));
        System.out.println(s1.indexOf("World"));
        System.out.println(s1.lastIndexOf("o"));

        String s = "";
        int n = 10;
        for (int i = 0; i < n; i++) {
            s += "a";
        }
        System.out.println(s);

        s = "Hello World";
        char[] str = s.toCharArray();
        str[5] = ',';
        System.out.println(str);

        StringBuilder strbBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            strbBuilder.append("A");
        }
        System.out.println(strbBuilder.toString());
    }
}
