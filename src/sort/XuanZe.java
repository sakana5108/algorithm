package sort;

/**
 * @description: 选择排序（每次选择最小的交换到前面）
 * @author: sakana
 * @date: 2024/4/18 22:30
 * @version: 1.0
 */

public class XuanZe {
    private static final int[] data = new int[]{5, 25, 27, 29, 45, 15, 21, 12, 7, 48, 9
            , 24, 24, 35, 2, 42, 35, 25, 3, 18, 43, 24, 44, 45, 48};

    public static void main(String[] args) {
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
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
