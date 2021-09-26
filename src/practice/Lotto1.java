package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 코딩테스트 연습
 2021 Dev-Matching: 웹 백엔드 개발자(상반기)
 로또의 최고 순위와 최저 순위

 lottos = new int[]{44, 1, 0, 0, 31, 25};
 win_nums = new int[]{31, 10, 45, 1, 6, 19};

 */
public class Lotto1 {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = matchNum(lottos, win_nums);
        return answer;
    }

    public int[] matchNum(int[] lottos, int[] win_nums) {
        int matchNum = 0;
        int zero = 0;
        int win_min = 0;
        int win_max = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zero++;
                continue;
            }
            for (int j = 0;j<win_nums.length;j++){
                if (lottos[i] == win_nums[j]) {
                    matchNum++;
                }
            }
        }

        System.out.println("zero = " + zero);
        System.out.println("matchNum = " + matchNum);

        if (matchNum == 0 && zero ==0) {
            win_max = 6;
            win_min = 6;
        } else if (matchNum == 0 && zero != 0) {
            win_max = 1;
            win_min = 6;
        } else if (matchNum != 0 && zero == 0) {
            win_min = 7 - matchNum;
            win_max = 7 - matchNum;
        } else {
            win_min = 7 - matchNum;
            win_max = 7 - matchNum - zero;
        }

        System.out.println(win_max);
        System.out.println(win_min);

        int[] answer = {win_max, win_min};
        return answer;
    }
}