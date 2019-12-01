public class String2 {

    public String doubleChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i + 1) + str.substring(i, i + 1);
        }

        return result;
    }

    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') count++;
        }

        return count;
    }

    public boolean catDog(String str) {
        int c = 0;
        int d = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') c++;
            else if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') d++;
        }

        return c == d;
    }

    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') count++;
        }

        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        return (a.endsWith(b) || b.endsWith(a));
    }

}
