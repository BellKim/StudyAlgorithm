package org.example.SINCE2024.LV0;

import org.junit.Test;

public class LV0_20240627 {

    public static void main(String[] args) {

        String[] id_pw1 = {"meosseugi", "1234"};	        String[][] db1 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};	                    //"login"
        String[] id_pw2 = {"programmer01", "15789"};	    String[][] db2 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};    //"wrong pw"
        String[] id_pw3 = {"rabbit04", "98761"};	        String[][] db3 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};              //"fail"

        System.out.println(solution1(id_pw1, db1));
        System.out.println(solution1(id_pw2, db2));
        System.out.println(solution1(id_pw3, db3));

    }

    /*   https://school.programmers.co.kr/learn/courses/30/lessons/120883
            로그인 성공?
            회원들의 아이디는 문자열입니다.
            회원들의 아이디는 알파벳 소문자와 숫자로만 이루어져 있습니다.
            회원들의 패스워드는 숫자로 구성된 문자열입니다.
            회원들의 비밀번호는 같을 수 있지만 아이디는 같을 수 없습니다.
            id_pw의 길이는 2입니다.
            id_pw와 db의 원소는 [아이디, 패스워드] 형태입니다.
            1 ≤ 아이디의 길이 ≤ 15
            1 ≤ 비밀번호의 길이 ≤ 6
            1 ≤ db의 길이 ≤ 10
            db의 원소의 길이는 2입니다.

            입출력 예 #1

            db에 같은 정보의 계정이 있으므로 "login"을 return합니다.
            입출력 예 #2

            db에 아이디는 같지만 패스워드가 다른 계정이 있으므로 "wrong pw"를 return합니다.
            입출력 예 #3

            db에 아이디가 맞는 계정이 없으므로 "fail"을 return합니다.

     */


    public static String solution1(String[] id_pw, String[][] db) {
        String answer = "";



        int idPwAllFailStatus = 0;
        int passwdFailStatus = 0;
        for (int i = 0; i < db.length; i++) {

            if(id_pw[0].equals(db[i][0])) {
                if(id_pw[1].equals(db[i][1])) {
                    return "login";
                }else{
                    return "wrong pw";
                }
            }
        }
        if(idPwAllFailStatus == db.length) {
            return "fail";
        }
        return answer;
    }



    @Test
    public void test1() {


    }





}
