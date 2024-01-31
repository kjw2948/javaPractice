package zeroex;

public class Ex {
    public static boolean upperCheck(char a){
        if((int)a >= 97)
            return true;
        else return false;
    }
    public static void solution(char alphabet){
        if(upperCheck(alphabet))
            alphabet -= 32;
        else{
            alphabet += 32;
        }
        System.out.println(alphabet);
    }
    public static void main(String[] args) {
        solution('c');
    }
}
