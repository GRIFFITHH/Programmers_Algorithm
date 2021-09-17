package javaStudy;

import java.util.Scanner;


/**
 * next() 에서 무시받은 Enter는 바로 nextLine()으로 넘어갑니다.
 */
public class JavaStudy_6 {

    public static void main(String[] args) {
        introduction();
    }

    static void introduction() {

        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        String bloodType;
        String MBTI;
        String words;
        String end;
        System.out.println("======== 자기소개 입력하기 =========");
        System.out.print("이름을 입력하세요:");name = sc.next();
        System.out.print("나이를 입력하세요:");age = sc.nextInt();
        System.out.print("혈액형을 입력하세요:");bloodType = sc.next();
        System.out.print("MBTI를 입력하세요:");MBTI = sc.next();
        sc.nextLine();
        System.out.print("좌우명 한 문장을 입력하세요:");words = sc.nextLine();
        System.out.printf( "======== 자기소개 입력 완료 =========\n" +
                           "\n" +
                           "\n" +
                           "아이엠 그라운드 자기소개 시작! => 시작하려면 엔터를 누르세요.\n");
        end = sc.nextLine();
        System.out.printf("저는 %s입니다. 나이는 %d살 이예요.\n" +
                          "혈액형은 %s형 이구요, %s입니다.\n" +
                          "\n" +
                          "%s",
                            name,age,bloodType,MBTI,words);
        sc.close();

    }
}
