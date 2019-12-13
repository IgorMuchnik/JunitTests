public class DoubleChar {

    public String doubleChar(String str) {

        if (str == null) throw new NullPointerException("argument must be not null");

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            result.append(str.substring(i, i + 1)).append(str.substring(i, i + 1));
        }

        return result.toString();
    }

}
