package javaStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaStudy_9 {

    public static void main(String[] args) {

        String[] mbtis = {"ISTJ","INFT","ISTP","INTJ","ISFP","INFP","INTP","ISTJ"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(mbtis));

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)
            for (int j = 0; j < 8; j++) {
                mbtiBot1(arrayList.get(j));
            }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)
            for (int j = 0; j < 8; j++) {
                mbtiBot2(arrayList.get(j));
            }
        long end2 = System.currentTimeMillis();
        System.out.println("if 문 :"+ (end1 - start1) + "ms");
        System.out.println("switch 문 :"+(end2 - start2) + "ms");
    }


    private static void mbtiBot1(String mbti) {

        if (mbti.equals("ISTJ")) {
            System.out.println("소금형");
        }else if (mbti.equals("ISFJ")){
            System.out.println("권력형");
        }else if (mbti.equals("INFJ")){
            System.out.println("예언자형");
        }else if (mbti.equals("INTJ")){
            System.out.println("과학자형");
        }else if (mbti.equals("ISTP")){
            System.out.println("백과사전형");
        }else if (mbti.equals("ISFP")){
            System.out.println("성인군자형");
        }else if (mbti.equals("INFP")){
            System.out.println("잔다르크형");
        }else if (mbti.equals("INTP")){
            System.out.println("아이디어형");
        }else if (mbti.equals("ESTP")){
            System.out.println("활동가형");
        }else if (mbti.equals("ESFP")){
            System.out.println("사교형");
        }else if (mbti.equals("ENFP")){
            System.out.println("스파크형");
        }else if (mbti.equals("ENTP")){
            System.out.println("우리형");
        }else if (mbti.equals("ESTJ")){
            System.out.println("사업가형");
        }else if (mbti.equals("ESFJ")){
            System.out.println("친선도모형");
        }else if (mbti.equals("ENFJ")){
            System.out.println("언변능숙형");
        }else if (mbti.equals("ENTJ")){
            System.out.println("지도자형");
        } else
            System.out.println("MBTI가 아닙니다.");
    }


    private static void mbtiBot2(String mbti) {

        switch (mbti) {
            case "ISTJ":
                System.out.println("소금형");
                break;
            case "ISFJ":
                System.out.println("권력형");
                break;
            case "INFJ":
                System.out.println("예언자형");
                break;
            case "INTJ":
                System.out.println("과학자형");
                break;
            case "ISTP":
                System.out.println("너네형");
                break;
            case "ISFP":
                System.out.println("우리형");
                break;
            case "INFP":
                System.out.println("~~형");
                break;
            case "INTP":
                System.out.println("소금형");
                break;
            case "ESTP":
                System.out.println("소금형");
                break;
            case "ESFP":
                System.out.println("소금형");
                break;
            case "ENFP":
                System.out.println("소금형");
                break;
            case "ENTP":
                System.out.println("소금형");
                break;
            case "ESTJ":
                System.out.println("소금형");
                break;
            case "ESFJ":
                System.out.println("소금형");
                break;
            case "ENFJ":
                System.out.println("소금형");
                break;
            case "ENTJ":
                System.out.println("소금형");
                break;
            default:
                System.out.println("MBTI가 아닙니다.");
        }
    }

}
