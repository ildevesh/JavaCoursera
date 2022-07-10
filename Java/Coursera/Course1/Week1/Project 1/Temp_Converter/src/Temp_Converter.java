// This program is just for practice and its formuales are wrong.



import java.util.*;
public class Temp_Converter {
    public static void main(String[] args) throws Exception {
        double c,k,f,result;
        char action;
        System.out.println("::::::::::Temperature Converter::::::::::");
        System.out.println("Please Enter the Values for:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Celsius: ");
        c = sc.nextDouble();
        System.out.print("Farenheit: ");
        f = sc.nextDouble();
        System.out.print("Kelvin: ");
        k = sc.nextDouble();
        System.out.println("\nPlease Choose a Input: ");
        System.out.println("\n\nCelsius to Farenheit: 1\nCelsius to Kelvin: 2\nFarenheit to Celsius: 3\nFarenheit to Kelvin: 4\nKelvin to Celsius: 5\nKelvin to Farenheit: 6\n");
        action = sc.next().charAt(0);

        switch (action) {
            
                        case '1':
                        f = c * 1.8 + 32;
                        System.out.println("Celsius to Farenheit: "+f);
                        break;

                        case '2':
                        k = c + 273;
                        System.out.println("Celsius to kelvin: "+k);
                        break;
                        
                        case '3':
                        c = ((f-32) * 5) / 9;
                        System.out.println("Farenheit to Celsius: "+c);
                        break;
                        
                        case '4':
                        k = ((f + 459.67) * 5) / 9;
                        System.out.println("Farenheit to Kelvin: "+k);
                        break;
                        
                        case '5':
                        c = k - 273;
                        System.out.println("Kelvin to Celsius: "+c);
                        break;
                        
                        case '6':
                        f = 1.8 * (k - 273) +32;
                        System.out.println("Kelvin to Farenheit: "+f);
                        break;
                        
            default:
            System.out.println("::::::::::Bye-Bye::::::::::");
                break;
        }
        
        sc.close();
    }
}
