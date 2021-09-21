package javaStudy;

import java.util.Scanner;

public class JavaStudy_8 {

    public static void main(String[] args) {
        method1();
        method2();
        for(int i=1 ; i<=3;i++) {
            System.out.println("메서드 테스트 :"+i);
            method3();
        }
    }

    private static void method1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2개를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.print("둘 중에 큰 수는 : ");
            System.out.println(a);
        }else{
            System.out.print("둘 중에 큰 수는 : ");
            System.out.println(b);
        }
        System.out.println("------ 난이도 (하) method1 END------");
    }

    private static void method2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2개를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.print("둘 중에 큰 수는 : ");
            System.out.println(a);
        }else if(a==b){
            System.out.println("같음");
        }else {
            System.out.print("둘 중에 큰 수는 : ");
            System.out.println(b);
        }
        System.out.println("------ 난이도 (상) method2 END------");
    }

    private static void method3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 2개를 입력하세요 : ");
        int i = sc.nextInt();
        int j = sc.nextInt();
        if (i == j)
            System.out.println("같음");
        else
            System.out.println("둘 중에 큰 수는 : " + Math.max(i, j));
    }

}
