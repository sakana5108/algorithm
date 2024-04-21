package sort;

import sort.util.RandomData;
import sort.util.VerifyUtil;

/**
 * @description: 冒泡排序
 * @author: sakana
 * @date: 2024/4/18 22:21
 * @version: 1.0
 */
public class MaoPao {
    private static int[] data = RandomData.getRandomData(1000, 100000);

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[i]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
        VerifyUtil.isSorted(data);
    }
}
