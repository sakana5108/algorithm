package sort.util;

import java.util.Random;

/**
 * @description:
 * @author: sakana
 * @date: 2024/4/21 21:44
 * @version: 1.0
 */

public class RandomData {
    private static final Random random = new Random();


    public static int[] getRandomData(int len, int range) {
        int[] data = new int[len];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(range);
        }
        return data;
    }
}
