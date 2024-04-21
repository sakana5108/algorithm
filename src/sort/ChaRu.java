package sort;

import sort.util.RandomData;

/**
 * @description: 插入排序（将每个元素插入正确的位置）
 * @author: sakana
 * @date: 2024/4/18 22:36
 * @version: 1.0
 */

public class ChaRu {
    private static int[] data = RandomData.getRandomData(100000, 100000);

    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 1; i < data.length; i++) {
            int num = data[i];
            int index = i - 1;
            while (index >= 0 && num < data[index]) {  //向前找到当前元素应该在的位置
                data[index + 1] = data[index];
                index--;
            }
            data[index + 1] = num; //插入
        }
        long e = System.currentTimeMillis();
        System.out.println(e - s);
    }
}
