package javaStudy;

import java.util.Scanner;

public class JavaStudy_7 {

    public static void main(String[] args) {
        calc1();
        calc2();
    }

    static void calc1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int b = sc.nextInt();
        int add = Math.addExact(a, b);
        int subtractExact = Math.subtractExact(a, b);
        int mult = Math.multiplyExact(a, b);
        int floorDiv = Math.floorDiv(a, b);
        int floorMod = Math.floorMod(a, b);
        System.out.printf(" %d + %d = %d\n",a,b,add);
        System.out.printf(" %d - %d = %d\n",a,b,subtractExact);
        System.out.printf(" %d * %d = %d\n",a,b,mult);
        System.out.printf(" %d / %d = %d\n",a,b,floorDiv);
        System.out.printf(" %d %% %d = %d\n",a,b,floorMod);
        System.out.println("---------calc1 End---------");
    }

    static void calc2() {
        int a = 3;
        int b = 5;
        System.out.printf(" %d %d %d \n",++a + b--,a,++b);
        System.out.println("---------calc2 End---------");
    }
}
