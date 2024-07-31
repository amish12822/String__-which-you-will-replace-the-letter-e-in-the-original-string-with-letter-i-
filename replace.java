// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.Scanner;

/**
 * replace
 */
public class replace {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: "); String a = sc.nextLine();

        String result = "";

        for (int i=0; i<a.length(); i++){

            if ( 'E' == a.charAt(i) || 'e' == a.charAt(i) ){

                result = result + 'z';
            } else {

                result = result + a.charAt(i);
            }

        }

        System.out.println("Result: "+result);
    }
}