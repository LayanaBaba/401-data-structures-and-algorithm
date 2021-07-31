package trees;

public class FizzBuzz {
    public static void main(String[] args) {
        int i = 100;

        for (int j = 1; j <=i ; j++) {
            if (j%3==0){
                System.out.println("Fizz ");
            }else if(j%5==0) {
                System.out.println("Buzz ");
            }else if(j%5==0&& j%3==0){
                System.out.println("FizzBuzz ");
            }else if( !(j%5==0) || !(j%3==0) ||  !(j%5==0&& j%3==0) ){

                System.out.println(j +" ");
            }
        }
    }
}
