package com.company;

public class WeeklyChallenge_2 {
    public String solution(int[][] scores) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int max = 0;
            int min = 100;
            float aver = 0;

            for (int j = 0; j < scores[i].length; j++) {
                max = Math.max(scores[j][i], max); //최고점수
                min = Math.min(scores[j][i], min); //최저점수
                sum += scores[j][i];
                }
//            System.out.println("Before ="+sum); //최고점수 , 최저점수 빼기전test

            if ((min == scores[i][i] || max == scores[i][i])) {//자기자신에게 준 점수가 최대점수 or 최소점수일경우 종합에서 제외
                sum -= scores[i][i];
                aver = sum / (float)(scores.length - 1);
            } else {
                aver = sum / (float)(scores.length);
            }


            System.out.println(aver);
            //System.out.println(aver); // 평균 구하는것까진 완료.. String을 배열로이용해서 학점을 출력해야함..
            if (aver >= 90) {
                sb.insert(i, "A");
            } else if (aver < 90 && aver >= 80) {
                sb.insert(i, "B");
            } else if (aver < 80 && aver >= 70) {
                sb.insert(i, "C");
            } else if (aver < 70 && aver >= 50) {
                sb.insert(i , "D");
            } else {
                sb.insert(i, "F");
            }
//            System.out.println("After = "+sum); // 검증후 최대점수 , 최소점수 제거test
//            System.out.println("Max = "+max);
//            System.out.println("Min = "+min);
        }

//        System.out.println("scores[0][0] = " + scores[0][0]);
//        System.out.println("scores[1][1] = " + scores[1][1]);
//        System.out.println("scores[2][2] = " + scores[2][2]);
//        System.out.println("scores[3][3] = " + scores[3][3]);
//        System.out.println("scores[4][4] = " + scores[4][4]);
        return sb.toString();
    }

    public void test() {
        int[][] scores = {{10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},
                            {10,20,30,60,60,40,30,40,30,},};

        int[][] scores2= {{0,90,98,88,65},
                          {0,40,99,85,77},
                          {0,88,95,80,67},
                          {0,57,100,80,65},
                          {0,90,94,75,65}};

        String result = solution(scores2);
        System.out.println();
        System.out.print(result);
    }
}
