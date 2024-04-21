package sort;

/**
 * @description: 插入排序（将每个元素插入正确的位置）
 * @author: sakana
 * @date: 2024/4/18 22:36
 * @version: 1.0
 */

public class ChaRu {
    private static final int[] data = new int[]{5, 25, 27, 29, 45, 15, 21, 12, 7, 48, 9
            , 24, 24, 35, 2, 42, 35, 25, 3, 18, 43, 24, 44, 45, 48};

    public static void main(String[] args) {
        for (int i = 1; i < data.length; i++) {
            int num = data[i];
            int index = i - 1;
            while (index >= 0 && num < data[index]) {  //向前找到当前元素应该在的位置
                data[index + 1] = data[index];
                index--;
            }
            data[index + 1] = num; //插入
        }
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
