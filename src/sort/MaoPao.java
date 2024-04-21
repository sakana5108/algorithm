package sort;

/**
 * @description: 冒泡排序
 * @author: sakana
 * @date: 2024/4/18 22:21
 * @version: 1.0
 */
public class MaoPao {
    private static final int[] data = new int[]{5, 25, 27, 29, 45, 15, 21, 12, 7, 48, 9, 24, 24, 35, 2, 42, 35, 25, 3, 18, 43, 24, 44, 45, 48};

    public static void main(String[] args) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[i]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
