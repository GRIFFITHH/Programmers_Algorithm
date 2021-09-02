package com.company;

public class WeeklyChallenge_1 {
//    public long solutionWrong(int price, int money, int count) {
//
//        long cost = 0;
//
//
//        for (long i = 1; i <= count; i++) {
//            cost += price * i;
//            if (cost > money) {
//                return cost - money;
//            }
//        }
//        return 0;
//    }
//
//    public void test() {
//        //long result1 = solution(3, 20, 400);
//        //long result2 = solution(1000, 20, 4);
//        long result3 = solution(25555, 120000000, 45565);
//        //System.out.println(result1);
//        //System.out.println(result2);
//        System.out.println(result3);
//    } //틀린답

//        public long MySolution(int price, int money, int count) {
//
//        long cost = 0;
//
//        for (long i = 1; i <= count; i++) {
//            cost = cost + price * i ;
//        }
//
//        if(cost > money){
//        return cost - money;
//        } else {
//        return 0;
//        }
//    } //내가 푼 답

    class AnswerSolution {
        public long solution(long price, long money, long count) {
            return Math.max(price * (count * (count + 1) / 2) - money, 0);
        }
    }
}