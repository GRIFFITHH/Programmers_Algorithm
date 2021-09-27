package javaStudy;

import java.util.Scanner;

public class JavsStudy_11 {

    public void reverse() {

        System.out.print("입력하려는 숫자의 개수를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] args = new int[num];

        System.out.println("숫자를 입력하세요");

        for (int i = args.length - 1; i >= 0; i--) {
            int index = sc.nextInt();
            args[i] = index;
        }

        System.out.println("짜자잔");
        for (int a : args) {
            System.out.print(a+" ");
        }

        sc.close();

    }
}
