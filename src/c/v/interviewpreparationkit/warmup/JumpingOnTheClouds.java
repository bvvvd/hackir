package c.v.interviewpreparationkit.warmup;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        int n = 7;
        int[] clouds = {0, 0, 1, 0, 0, 1, 0};

        assert 4 == jumpingOnClouds(clouds);

        n = 6;
        clouds = new int[]{0, 0, 0, 1, 0, 0,};

        assert 3 == jumpingOnClouds(clouds);
    }

    private static int jumpingOnClouds(int[] clouds) {
        int numberOfJumps = 0;
        int currentCloudNumber = clouds.length - 1;

        while (currentCloudNumber > 0) {
            numberOfJumps++;
            if (currentCloudNumber - 2 >= 0 && clouds[currentCloudNumber - 2] == 0) {
                currentCloudNumber -= 2;
            } else  {
                currentCloudNumber--;
            }
        }

        return numberOfJumps;
    }
}
