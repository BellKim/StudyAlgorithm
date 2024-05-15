package org.example.SINCE2024.LV0;

public class LV0_20240515 {
    public static void main(String[] args) {
        String message1 = "happy birthday!";    // 30
        String message2 = "I love you~";        // 22

//        System.out.println(solution1(message1));
//        System.out.println(solution1(message2));

        System.out.println(solution2(2,2));
        System.out.println(solution2(2,5));
        System.out.println(solution2(1,1));


    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120898
        편지
        편지지에 한글자당 2cm 크기로 적으려할때, 최소 가로길이를 구하시오.
        1글자당 2cm로 잡으면된다. 즉, 10글짜면 20cm 로 계산하여 리턴해도록한다.
     */
    public static int solution1(String message) {
        int answer = 0;
        return answer = message.length()*2;
    }

    /* https://school.programmers.co.kr/learn/courses/30/lessons/120922
    종이 자르기
    2 * 2 의 종이를 자르려 할때 자르기 위해서는 3번의 컷팅이 필요하다.
    이와같이 m, n 의 길이를 가진 종이를 1*1 의 종이로 자르려 할때 몇번의 종이를 잘라야 하는지 컷팅횟수를 리턴하시오.
    결론
        수식 : (m-1) + (m*(n-1))
       수식정리: mn-1

     */
    public static int solution2(int M, int N) {
        int answer = 0;

        if(M == 1 && N > 1){
            answer = N-1;

        } else if (M > 1 && N == 1) {
            answer = (M)-1;

        } else{
            answer = (M*N)-1;
        }

        return answer;
    }
}
