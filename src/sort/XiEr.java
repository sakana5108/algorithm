package sort;

import sort.util.RandomData;

/**
 * @description: 希尔排序（直接插入排序的优化,将数据分组对每一组进行插入排序）
 * @author: sakana
 * @date: 2024/4/21 21:15
 * @version: 1.0
 */

public class XiEr {
    private static int[] data = RandomData.getRandomData(10000, 100000);

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        int gap = data.length;
        while (gap > 1) {
            gap /= 2;
            shell(data, gap);
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }

    private static void shell(int[] data, int gap) {
        //从gap开始
        for (int i = gap; i < data.length; i++) {
            //组内排序
            for (int j = i; j - gap >= 0; j -= gap) {
                int v2 = data[j];
                int v1 = data[j - gap];
                if (v2 >= v1) {
                    break;
                }
                data[j] = v1;
                data[j - gap] = v2;
            }
        }
    }
}
