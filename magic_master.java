import java.util.Scanner;
/**
 * magic_master
 */
public class magic_master {
    static Scanner jeya = new Scanner (System.in);
    public static void main(String[] args) {
        boolean wh= true;
       do{
        System.out.println("\n\t\t\tWelcom to the magic..master\n");
        System.out.println("1.Factorial\n2.count of digit and count of sum\n3.First and last given number");
        System.out.println("4.perfect number\n5.prime\n6.Xylame\n7.palindrom\n8.power of digits\n9.Strong number\n10.ArmsStrong\nEny one else number  you enter program closes...");
        System.out.print("Enter the number : ");
        String []s= {};
       // Factorial.main(s);
        int input= jeya.nextInt();
        if(10<input){
            wh = false;
            System.out.println("\n\t\t\tThankyou....");
        }
        /**
     * Factorial--number
        */

        else if(input == 1){
            Factorial.main(s);
        }
        /**
    * count of digit and count of sum
        */
        else if(input == 2){
            countofdigit_countofsum.main(s);
        }
        /**
     * First and last given number
         */
        else if(input == 3){
            First_lastgivennumber.main(s);
        }
        /**
    * perfect_number
        */
        else if(input == 4){
            perfect_number.main(s);
        }
        /**
     * prim_number
         */
        else if(input ==5){
            prim_number.main(s);
        }
        /**
    * Xylame
        */
        else if(input == 6){
            Xylame.main(s);
        }
        /**
    * palindrom
        */
        else if(input == 7){
            palindrom.main(s);
        }
        else if(input == 8){
            power_digits.main(s);
        }
        /**
    * Strong_number
        */
        else if (input == 9){
            Strong_number.main(s);
        }    
    /**
    * ArmsStrong
        */
        else if(input == 10){
            Arms_strong.main(s);
        }


       }while(wh);
    }
}
/**
 * Factorial--number
 */
class Factorial {
    static Scanner jeya = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter the factorial: ");
        int input = jeya.nextInt();
        int fact = 1;
        for (int i = 1; i <= input; i++) {
            fact = fact * i;
        }
        System.out.println(input + " The factorial number is "+ fact);

    }
    
}
/**
 * count of digit and count of sum
 */
class countofdigit_countofsum {
    static Scanner jeya = new Scanner (System.in);
    public static void main (String [] args){
        System.out.print("Enter the number: ");
        int input = jeya.nextInt();
        int count = 0;
        int sum = 0;
        for(int i = input; i > 0;i = i /10 ){
            count++;
            sum +=i % 10 ;
        }
        System.out.println("count of digit "+ count);
        System.out.println("sum of digit "+ sum);

    }

    
}


/**
 * First and last given number
 */
class First_lastgivennumber {
    static Scanner jeya = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Ente the input: ");
        int input = jeya.nextInt();
        int last = input % 10;
        int i;
    
        for( i = input; i >9;i = i / 10){

        }
        int sum = i + last;
        System.out.println(i + "sum of "+ last + " = " + sum);
        
    }
    
}


/**
 * perfect_number
 */
class perfect_number {
    static Scanner jeya = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Input: ");
        int input = jeya.nextInt();
        int sum= 0;
        for (int i = 1; i < input; i++ ){
            if(input % i == 0){
                sum = sum + i;
            }
        }
        if (input == sum ){
            System.out.println(input + " this a perfect number");
        }
        else{
            System.out.println(input + "This not perfect number");
        }
    }

    
}

/**
 * prim_number
 */
class prim_number {
    static Scanner jeya = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter the input");
        int input = jeya.nextInt();
        String res = "prime number";

        if (input == 1 || input == 0) {
            System.out.println("1 and 0 is not prime number ");
            
        }
        else{
            for (int i = 2; i < input; i++) {
                if (input % i == 0 ) {
                    res = "not prim_number";
                    break;
                    
                }
                
            }
            System.out.println(input + res);
        }
        
    }

    
}

/**
 * Xylame
 */
class Xylame {
    static Scanner jeya = new Scanner  (System.in);
    public static void main(String[] args) {
        System.out.println("Enter the input : ");
        int input = jeya.nextInt();
        int last = input % 10;
        int num = input / 10;
        int sum = 0;
        int i;
        for ( i = num; i > 9; i = i / 10) {
            
            sum = sum + i % 10 ;

        }
        if (last + i==sum) {
            System.out.println(input+ " this is xylame number : "+ (last +i));
            
        } else {
            System.out.println(input+ " this is not xylame number : "+ (last +i));
        }
        
    }

    
}


/**
 * palindrom
 */
class palindrom {
    static Scanner jeya = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter The Inpute: ");
        int input = jeya.nextInt();
        int bal = 0;
        int res = 0;
        int i ;
        for( i =input; i > 0;i = i / 10 ){
            bal = i % 10;
            res = res * 10 + bal; 

        }
        if (input == res) {
            System.out.println(input + " this palindrom "+ res);
            
        } else {
            System.out.println(input + " this not palindrom "+ res);
        }


        

    }
}
/**
 * power_digits
 */

 class power_digits{
    
    static Scanner jeya = new Scanner (System.in);
    public static void main (String [] args){
        System.out.print("Enter the number : ");
        int pase = jeya.nextInt();
        int num = pase;
        System.out.print("Enter the power of number : ");
        int power = jeya.nextInt();

        for (int i = 1; i < power; i++) {
            num *= num;
            
        }

        System.out.println(pase +" power of "+ power + "is "+ num);
    }

    
}

/**
 * Strong_number
 */
class Strong_number {
    
    static Scanner jeya = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the input: ");
        int input = jeya.nextInt();
        int i;
        int num1 = input;
        int digit = 0;
        int sum = 1;
        int total = 0;

        for(i =num1;i > 0; i = i/10 ){
            digit = i % 10;
            sum =1;
            for(int j = 1; j<=digit;j++){
                sum = sum * j;   

            }
            total = total+ sum;
            if (input == total) {
                System.out.println(input + " this is strong number : "+ total);
                
            } else {
                System.out.println(input + " this is not strong number : "+ total);
            }

        }
        
    }
}

/**
 * ArmsStrong
 */
class Arms_strong {
    static Scanner jeya = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.print("Enter the input:");
        int input = jeya.nextInt();
        int num1 = input;
        int num2 = input;
        int count = 0;
        int i;
        int ans;
        int final_ans=0;
        int digt =0;
        //count of the digt
        while(num1 > 0){
            num1 = num1 /10;
            digt++;
        
        }
        int fdigt = digt;///final digt 4




        while(num2 > 0){
            count = num2 %10;
            int count1= count;
            ans = 1;

            for(i = 1;i<=fdigt%10;i++){
                ans = ans * count1;
            }
           
            final_ans = final_ans +ans;
            num2 = num2 / 10;

        }

        if (final_ans == input) {
            System.out.println(input + " this is armstrong number");
        } else {
            System.out.println(input + " This is not armstrong number");
        }
    }
}








