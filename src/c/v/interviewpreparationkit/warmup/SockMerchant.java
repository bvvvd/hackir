package c.v.interviewpreparationkit.warmup;

import java.util.HashMap;

public class SockMerchant {
    public static void main(String[] args) {
        int n = 9;
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        assert 3 == sockMerchant(n, socks);

        n = 10;
        socks = new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        assert 4 == sockMerchant(n, socks);

        assert 0 == sockMerchant(1, new int[]{100});
    }

    private static int sockMerchant(int n, int[] socks) {
        HashMap<Integer, Integer> sockPairs = new HashMap<>();

        for (int sock : socks) {
            sockPairs.merge(sock, 1, Integer::sum);
        }

        return sockPairs
                .values()
                .stream()
                .filter(value -> value > 1)
                .mapToInt(value -> value / 2)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
