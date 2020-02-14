package c.v.interviewpreparationkit.warmup;

public class RepeatedString {
    public static void main(String[] args) {
        String s = "aba";
        long n = 10;

        assert 7 == repeatedString(s, n);

        s = "a";
        n = 1000000000000L;

        assert 1000000000000L == repeatedString(s, n);

        s = "ababa";
        n = 3L;

        assert 2L == repeatedString(s, n);

        s = "cfimaakj";
        n = 554045874191L;

        assert 138511468548L == repeatedString(s, n);
    }

    private static long repeatedString(String sourceString, long n) {
        int sourceStringLength = sourceString.length();
        int numberOfEntriesInSourceString = sourceStringLength
                - sourceString.replace("a", "").length();

        long l = n % sourceStringLength;
        String substring = sourceString.substring(0, Math.toIntExact(l));

        return numberOfEntriesInSourceString * (n / sourceStringLength)
                        + (substring.length() - substring.replace("a", "").length());
    }
}
