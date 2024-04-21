package sort.util;

/**
 * @description:
 * @author: sakana
 * @date: 2024/4/21 22:01
 * @version: 1.0
 */

public class VerifyUtil {
    public static void isSorted(int[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] < data[i - 1]) {
                System.out.println("排序错误");
                break;
            }
        }
    }
}
