public class FizzBuzz {
     public static void main(String[] args) {
         int number = 5;

         if(number % 3 == 0 && number % 5 == 0){
             System.out.println("Fizz Buzz");
         } else if(number % 3 == 0){
             System.out.println("Fizz");
         } else if(number % 5 == 0){
             System.out.println("Buzz");
         } else{
             System.out.println("---");
         }
     }
}