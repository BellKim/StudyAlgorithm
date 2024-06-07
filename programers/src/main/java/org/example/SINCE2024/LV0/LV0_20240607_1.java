package org.example.SINCE2024.LV0;

public class LV0_20240607_1 {
    public static void main(String[] args) {
        //i	j	k	result
        int i1 = 1;	    int j1= 13;	int k1 = 1;	// 6
        int i2 = 10;	int j2 = 50;	int k2 = 5;	//5
        int i3 = 3; 	int j3 = 10;	int k3 = 2;	//0
        System.out.println(solution1(i1, j1, k1));
        System.out.println(solution1(i2, j2, k2));
        System.out.println(solution1(i3, j3, k3));


    }

    /*  https://school.programmers.co.kr/learn/courses/30/lessons/120887
        k   의 개수
    1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
    정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

     */
    public static int solution1(int i, int j, int k) {
        String str = "";
        for(int start=i; start<=j; start++) {
            str += start+"";
        }
        return str.length() - str.replace(k+"", "").length();
    }


}
