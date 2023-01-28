public class Coding_Bat_Recursion {
    
    public static void main(String [] args){
        
        // Coding Bat 1: Factorial
        // Status: Finish
        //System.out.println(factorial(4));

        // Coding Bat 2: BunnyEars
        // Status: Finish
        //System.out.println(Bunny_Ears(4));

        // Coding Bat 3: Fibonacci
        // Status: Finish
        //System.out.println(Fibonacci(5));

        // Coding Bat 4: 
        // Status: Finish
        //System.out.println(Bunny_Ears_2(4));

        // Coding Bat 5:
        // Status: Finish
        //System.out.println(Triangle(3));

        // Coding Bat 6
        // Status: Finish
        //System.out.println(sum(345));

        // Coding Bat 7 & count 8
        // Status: Finish
        //System.out.println(count7(77));\
        

        // Coding Bat 9
        // Status: Finishs
        //System.out.println(powerN(3,3));
    
    }

    // Coding bat 1: Factorial 
    public static int factorial(int n){
        if (n == 1){
            return (n);
        }
        else{
            return n*(factorial(n-1));
        }
    }

    // Coding bat 2: BunnyEars
    public static int Bunny_Ears(int n){
        if (n==1){
            return 2;
        }
        else {
            return 2+(Bunny_Ears(n-1));
        }
    }

    // Coding bat 3: fibonacci
    public static int Fibonacci(int x){
        // base case
        if(x ==0){
            return 0;
        }
        if (x == 1){
            return 1;
        }
        else {
            return Fibonacci(x-1)+Fibonacci(x-2);
        }
    }

    // Coding bat 4: Bunny_Ears_2
    public static int Bunny_Ears_2(int x){
        if (x == 0) return 0;
        if (x %2 == 0) return 3+Bunny_Ears_2(x-1);
        else return 2+Bunny_Ears(x-1);
    }

    // Coding bat 5: Triangle 
    public static int Triangle(int x){
        if (x == 0) return 0;
        else return x + (Triangle (x-1));
    
    }

    // Coding bat 6: Sum
    public static int sum(int x){
        if (x == 0) return 0;
         else return x%10 + sum(x/10);
    }

    // Coding bat 7&8: Count 7 and Count 8 replace 7 with 8 to get count 8
    public static int count7(int x){
        if (x == 0) return 0;

        if ( x%10 ==7) return 1 +count7(x/10);

        else return count7(x/10);
    }

    // coding bat 9: powerN
    public static int powerN(int x, int y){
        if (y == 1) return x;
        else return x*(powerN(x, y-1));
    }
}
