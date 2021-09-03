package com.company;

public class WeeklyChallenge_2 {
    public String solution(int[][] scores) {
        String answer = "1";

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            int max = 0;
            int min = 100;
            int aver = 0;

            for (int j = 0; j < scores[i].length; j++) {
                max = Math.max(scores[i][j], max); //최고점수
                min = Math.min(scores[i][j], min); //최저점수
                sum += scores[i][j];
                }
//            System.out.println("Before ="+sum); //최고점수 , 최저점수 빼기전test
            if (( min==scores[i][i] || max==scores[i][i] )) {
                sum -= scores[i][i];

            }//자기자신에게 준 점수가 최대점수 or 최소점수일경우 종합에서 제외
            aver = sum / scores.length;
            System.out.println(aver); // 평균 구하는것까진 완료.. String을 배열로이용해서 학점을 출력해야함..

            if (sum / scores[i].length >= 90) {
                System.out.println("1");
               answer = answer+"A";
            } else if (sum / scores[i].length < 90 && sum / scores[i].length >= 80) {
                answer = answer+"B";
            } else if (sum / scores[i].length < 80 && sum / scores[i].length >= 70) {
                answer = answer+"C";
            } else if (sum / scores[i].length < 70 && sum / scores[i].length >= 50) {
                answer = answer+"D";
            } else {
                answer = answer+"F";
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
        return answer;
    }

    public void test() {
        int[][] scores = {{10,20,30,40,50},
                          {50,50,40,60,70},
                          {60,30,40,20,67},
                          {70,60,50,40,20},
                          {10,20,40,50,20}};

        solution(scores);

    }
}
