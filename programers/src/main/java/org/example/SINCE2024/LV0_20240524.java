package org.example.SINCE2024.LV0;

public class LV0_20240524 {
    public static void main(String[] args) {

        String mystring1 = "Bcad"; //	"abcd"
        String mystring2 = "heLLo";	// "ehllo"
        String mystring3 = "Python";	// "hnopty"
        System.out.println(solution1(solution1(mystring1)));
        System.out.println(solution1(solution1(mystring2)));
        System.out.println(solution1(solution1(mystring3)));
    }
    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/120911
        문자열 정렬하기(2)
        입력받은 문자열을 sort 하는 코드를 작성하여라
        문자열을 모두 소문자로 변경하고 알파벳 오름차순으로 변경하기.
        collection.sort();
        "String".toLowerCase();
        함수 사용.

     */

    public static String solution1(String my_string) {
        String answer = "";
        String[] words = my_string.toLowerCase().split("");
        List<String> stringlist = new ArrayList<String>();
        for (String val: words){
            stringlist.add(val);
        }
        Collections.sort(stringlist);
        StringBuilder sb = new StringBuilder();
        for (String val: stringlist){
            sb.append(val);
        }

        answer = sb.toString();
        return answer;
    }

}
