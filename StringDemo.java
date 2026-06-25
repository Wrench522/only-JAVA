public class StringDemo {
    public static void main(String[] args) {

        // =========================
        // STRING (IMMUTABLE)
        // =========================
        String text = "  Hello Java World  ";

        System.out.println("Original String: '" + text + "'");

        // length()
        System.out.println("Length: " + text.length());

        // toUpperCase()
        System.out.println("Uppercase: " + text.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + text.toLowerCase());

        // indexOf()
        System.out.println("Index of 'Java': " + text.indexOf("Java"));

        // charAt()
        System.out.println("Character at index 3: " + text.charAt(3));

        // trim()
        String trimmed = text.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // concat()
        String concatenated = trimmed.concat(" Programming");
        System.out.println("Concatenated: " + concatenated);

        // substring()
        System.out.println("Substring (6,10): " + trimmed.substring(6, 10));

        // split()
        String[] words = trimmed.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // equals()
        String str1 = "Java";
        String str2 = "Java";
        System.out.println("Equals: " + str1.equals(str2));

        // contains()
        System.out.println("Contains 'World': " + trimmed.contains("World"));



        // =========================
        // STRINGBUILDER (MUTABLE)
        // =========================
        StringBuilder sb = new StringBuilder("Hello");

        // append()
        sb.append(" Java");
        System.out.println("\nAppend: " + sb);

        // insert()
        sb.insert(5, " Amazing");
        System.out.println("Insert: " + sb);

        // replace()
        sb.replace(6, 13, "Awesome");
        System.out.println("Replace: " + sb);

        // delete()
        sb.delete(6, 14);
        System.out.println("Delete: " + sb);

        // reverse()
        System.out.println("Reverse: " + sb.reverse());

        // reverse back
        sb.reverse();

        // charAt()
        System.out.println("CharAt(1): " + sb.charAt(1));

        // setCharAt()
        sb.setCharAt(0, 'h');
        System.out.println("SetCharAt: " + sb);

        // substring()
        System.out.println("Substring(0,5): " + sb.substring(0, 5));

        // deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("DeleteCharAt: " + sb);

        // toString()
        String finalString = sb.toString();
        System.out.println("toString(): " + finalString);
    }
}
