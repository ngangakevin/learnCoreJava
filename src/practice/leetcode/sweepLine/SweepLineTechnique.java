package practice.leetcode.sweepLine;

import java.util.ArrayList;
import java.util.List;

public class SweepLineTechnique {
    public static void sweepLine(int[][] list){
        List<int[]> events = new ArrayList<>();

        for(int[] interval: list){
            events.add(new int[]{interval[0], +1});
            events.add(new int[]{interval[1], -1});
        }

        events.sort((a, b) -> a[0] != b[0] ? a[0] - b[0]: a[1]- b[1]);

        int active = 0;
        int maxActive = 0;

        for(int[] event: events){
            active += event[1];
            maxActive = Math.max(maxActive, active);
        }
    }
}
