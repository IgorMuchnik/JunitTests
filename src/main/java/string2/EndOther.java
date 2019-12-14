package string2;

public class EndOther {

    public boolean endOther(String a, String b) {

        if (a == null || b == null) {
            throw new NullPointerException("arguments must be not null");
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        return (a.endsWith(b) || b.endsWith(a));
    }
}
