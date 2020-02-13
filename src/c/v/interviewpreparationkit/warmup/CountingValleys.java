package c.v.interviewpreparationkit.warmup;

public class CountingValleys {
    public static void main(String[] args) {
        int n = 8;
        String route = "UUDDDUDUU";

        assert 2 == countingValleys(n, route);

        n = 12;
        route = "DDUUDDUDUUUD";

        assert 2 == countingValleys(n, route);
    }

    private static int countingValleys(int n, String route) {
        int previousLevel = 0;
        int currentLevel = 0;
        int numberOfValleys = 0;

        for (int i = 0; i < route.length(); i++) {
            char currentStep = route.charAt(i);
            if (currentStep == 'U') {
                currentLevel++;
            } else {
                currentLevel--;
            }

            if (previousLevel < 0 && currentLevel >= 0) {
                numberOfValleys++;
            }
            previousLevel = currentLevel;
        }

        return numberOfValleys;
    }
}
