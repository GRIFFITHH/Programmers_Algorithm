package javaStudy;

public class JavaStudy_10 {

    public static void main(String[] args) {
        sum_for(1354);
        sum_while(10);
        sum(1354);
    }

    public static void sum_for(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println("sum_for = "+result);
    }

    public static void sum_while(int num) {
        int i = 1;
        int result = 0;
        while (i<=num) {
            result += i;
            i++;
        }
        System.out.println("sum_while = "+result);
    }

    public static void sum(int num) {
        int sum =( num * (1 + num) ) / 2;
        System.out.println("등차수열의 합 공식 = "+sum);
    }
}
