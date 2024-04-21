package leetcode;

import java.util.*;

/**
 * @description:
 * @author: sakana
 * @date: 2024/4/18 22:20
 * @version: 1.0
 */
class Solution {
    int ans = Integer.MAX_VALUE;
    Map<Integer, Integer> cache = new HashMap<>();

    public int minimumOperations(int[][] grid) {
        //统计每一列出现的数字及数目
        List<Map<Integer, Integer>> cnt = new ArrayList<>(grid[0].length);
        for (int j = 0; j < grid[0].length; j++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            cnt.add(map);
            for (int i = 0; i < grid.length; i++) {
                map.merge(grid[i][j], 1, Integer::sum);
            }
        }
        //深搜
        return bfs(cnt, 0, 0, -1, grid.length);


    }

    private int bfs(List<Map<Integer, Integer>> cnt, int length, int mod, int num, int total) {
        if (length == cnt.size()) {
            return mod;
        }
        Map<Integer, Integer> map = cnt.get(length);
        boolean flag = false;
        for (Integer key : map.keySet()) {
            if (key == num) {
                continue;
            }
            flag = true;
            bfs(cnt, length + 1, mod + total - map.get(key), key, total);
        }
        if (!flag) {
            bfs(cnt, length + 1, mod + total, new Random().nextInt(), total);
        }
    }
}
