public class CatDog {

    public boolean catDog(String str) {

        if (str == null) throw new NullPointerException("argument must be not null");

        int c = 0;
        int d = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 't') c++;
            else if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 'g') d++;
        }

        return c == d;
    }
}
