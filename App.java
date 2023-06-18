//import util.Arrays; 
import java.time.LocalTime;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception{ 
        


        task1();
        //task2();
        //task3();
    }

    public static void task1() {
                int i, j;
            boolean res;
            for (i = 2; i < 1000; i++) {
            res = true;
               for (j = 2; j < i; j++) {
                if ((i % j) == 0) {

                 res = false;

     break;
    }
   }
    if (res) {
        
        System.out.println(i);
         
 }
 }
}

// 1) Вычислить сумма чисел от 1 до n
 

    
    public static void task2() {
       System.out.println(sum(5));             
    }
    public static int sum(int n){
         if (n==1)return 1;
         return n+ sum(n-1);
    }                

    //калькулятор                
public static void task3() {
    double num1;
    double num2;
    double ans;
    char op;
    Scanner iScanner = new Scanner(System.in);
    System.out.print("введите первое число: ");
     num1 = iScanner.nextDouble();
    Scanner iScanner1 = new Scanner(System.in);
    System.out.print("введите второе число: ");
    num2 = iScanner.nextDouble();
    System.out.print("\nвведите операцию (+, -, *, /): ");
     op = iScanner.next().charAt(0);
    switch(op) {
      case '+': ans = num1 + num2;
     break;
    case '-': ans = num1 - num2;
     break;
     case '*': ans = num1 * num2;
     break;
    case '/': ans = num1 / num2;
     break;
    default:  System.out.printf("Error! Enter correct operator");
     return;
    }
    System.out.print("\nрезультат:\n");
     System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
                    
}
}
  

