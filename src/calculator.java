import java.util.Scanner;

public class calculator {

    static class calculate{
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        public int add(){
            System.out.println("enter first number");
            this.a =sc.nextInt();

            System.out.println("enter first number");
            this.b = sc.nextInt();
            return this.a+this.b;
        }
        public int sub(){
            System.out.println("enter first number");
            this.a =sc.nextInt();

            System.out.println("enter first number");
            this.b = sc.nextInt();
            return this.a-this.b;
        }
        public int multiply(){
            System.out.println("enter first number");
            this.a =sc.nextInt();

            System.out.println("enter first number");
            this.b = sc.nextInt();
            return this.a*this.b;
        }
        public int divide(){
            System.out.println("enter first number");
            this.a =sc.nextInt();

            System.out.println("enter first number");
            this.b = sc.nextInt();
            return this.a/this.b;
        }
        public void function(){

            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");
            System.out.println("Enter your Choice :");
            int choice = sc.nextInt();

            final int continueloop=0;
            int test=1;
            switch (choice){
                case 1: System.out.println(add());break;
                case 2: System.out.println(sub());break;
                case 3: System.out.println(multiply());break;
                case 4: System.out.println(divide());break;
                case 5: test=continueloop;break;
            }

            if(test!=0) function();
        }
    }

    public static void main(String[] args) {
        calculate cal = new calculate(); //created object of calculate
        cal.function(); //called function
    }
}
