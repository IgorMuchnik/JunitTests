package string2;

public class CountHi {

    public int countHi(String str) {

        if (str == null) {
            throw new NullPointerException("argument must be not null");
        }

        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') count++;
        }

        return count;
    }
}
