package com.company;

import practice.Lotto1;

public class Main {

    public static void main(String[] args) {
        Lotto1 lotto1 = new Lotto1();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        lotto1.solution(lottos, win_nums);
    }
}
