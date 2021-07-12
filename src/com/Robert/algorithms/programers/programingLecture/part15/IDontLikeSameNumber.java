package programers.programingLecture.part15;

public class IDontLikeSameNumber {

    public static void main(String[] args) {
        System.out.println("hello");


        //  https://programmers.co.kr/learn/courses/30/lessons/12906
        /*
        배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

        arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
                arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
                배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

        제한사항
        배열 arr의 크기 : 1,000,000 이하의 자연수
        배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
        */

        int[] arr1 = { 1, 1, 3, 3, 0, 1, 1 };
        int[] arr2 = { 4, 4, 4, 3, 3 };


        int [] res = solution(arr2);

        System.out.println(res);



    }//end of main



    public static int[] solution(int[] arr){
        int [] answer = {};
        String watiValue = "";
        int beforeData =arr[0];//초기값 셋팅
        watiValue+=beforeData;

        for(int i=1; i<arr.length; i++){
            System.out.println("int값 : " + i +" /// 현재값 : " + arr[i]);
            //1.현재 값이 다음값과 같을경우 pass
            if(arr[i] == beforeData){
                //동일한값이므로 pass.
                beforeData=arr[i];
            }else{
                //2. 현재값이 다음값과 다를경우 기록해준다.

                watiValue+=arr[i];
                beforeData=arr[i];
            }
        }


        answer=new int[watiValue.length()];
        for(int i=0; i<watiValue.length(); i++){
            answer[i] = Integer.parseInt(String.valueOf(watiValue.charAt(i)));

        }


        return answer;

    }




}//end of class
