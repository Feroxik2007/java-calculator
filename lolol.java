import java.util.Scanner;



    public class lolol {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
        
        


            System.out.print("First Number :  ");
            int x = scanner.nextInt();

            System.out.print("Second Number :  ");
            int y = scanner.nextInt();

            System.out.print(" /, * , + , -  :  ");
            String vysledok =scanner.next();

        int result;

    
    switch (vysledok) {
        case "+":
        result = x + y;
        System.out.println(result);
            
            break;
    
        case "-":
        result = x - y;
        System.out.println(result);
            break;
        

        case "*":
        result= x * y;
        System.out.println(result);

        break;


        case "/":
        result= x / y;
        System.out.println(result);


        break;


    
    }

            

        
       

      
            
        

       


        



    }
}