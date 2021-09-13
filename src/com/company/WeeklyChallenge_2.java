package com.company;

public class WeeklyChallenge_2 {
    public String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int max = 0;
            int min = 100;
            float aver;

            for (int j = 0; j < scores[i].length; j++) {
                max = max(scores[j][i], max);
                min = min(scores[j][i], min);
                sum += scores[j][i];
                }


            if ((min == scores[i][i] || max == scores[i][i])) {
                sum -= scores[i][i];
                aver = sum / (float)(scores.length - 1);
            } else {
                aver = sum / (float)(scores.length);
            }

            getScore(sb, i, aver);
        }


        return sb.toString();
    }

    private void getScore(StringBuilder sb, int i, float aver) {
        if (aver >= 90) {
            sb.insert(i, "A");
        } else if (aver < 90 && aver >= 80) {
            sb.insert(i, "B");
        } else if (aver < 80 && aver >= 70) {
            sb.insert(i, "C");
        } else if (aver < 70 && aver >= 50) {
            sb.insert(i, "D");
        } else {
            sb.insert(i, "F");
        }
    }

    public int max(int a, int b) {
        if (a == b) {
            return 101;
        }
        return Math.max(a, b);
    }

    public int min(int a, int b) {
        if (a == b) {
            return -1; 
            //중복되는 최솟값, 최댓값이 존재할경우 1~100 범위를 벗어난 최댓값,최솟값을 설정해서 어느값하나 제외하지않고 정상적으로 연산시킴 
            //내가준 점수가 최솟값인데 그 점수랑 겹치는 값이 있으면 정상적으로 계산 , 그외에도 값이 겹치더라도 어쨌든 정상적으로 연산진행
        }
        return Math.min(a, b);
    }

    public void test() {
        int[][] scores = {{10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,30,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,}};

        int[][] scores2= {{0,0,0,0,0},
                          {0,0,0,0,0},
                          {0,0,0,0,0},
                          {0,0,0,0,0},
                          {0,0,0,0,0}};

        String result = solution(scores);
        System.out.println();
        System.out.print(result);
    }
}
