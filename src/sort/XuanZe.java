package sort;

import sort.util.RandomData;

/**
 * @description: 选择排序（每次选择最小的交换到前面）
 * @author: sakana
 * @date: 2024/4/18 22:30
 * @version: 1.0
 */

public class XuanZe {
    private static int[] data = RandomData.getRandomData(100000, 1000000);

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    index = j;
                }
            }
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}
