package org.example.programmers_lv0;


import java.util.Comparator;
import java.util.TreeSet;

public class example011_empty implements Comparator{


    /*
     *
     * 배열에 저장된 숫자 증가 감소
     * compaire to 이용.
     *
     *
     *
     */

    public static void main(String[] args) {

        int [] input = {20,50,10,80,90,30};
        int res = solution(input);



        System.out.println(res);

    }

    public static int solution(int[] input) {
        int answer= 0;

        TreeSet set1 = new TreeSet();
        TreeSet set2 = new TreeSet(new example011_empty());

        for(int i : input){
            set1.add(new Integer(i));
            set2.add(new Integer(i));
        }

        System.out.println("set1 = " + set1);
        System.out.println("set1 = " + set2);


        return answer;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if( o1 instanceof Comparable && o2 instanceof Comparable){
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;

            return c1.compareTo(c2) * -1;
        }
        return -1;
    }

}




