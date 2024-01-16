class Solution {
    public static void main(String[] args) {
        int[] arr = {1, -3, 9};
        System.out.println(solution(arr));
    }
    public static int solution(int[] common) {
        int answer = 0;
        int first_num = common[0];
        int second_num = common[1];
        int a = second_num / first_num;
        int arr_size = common.length;

        if(second_num*a == common[2])
            answer = common[arr_size-1]*a;
        else
            answer = common[arr_size-1] + (second_num - first_num);
        return answer;
    }
}
