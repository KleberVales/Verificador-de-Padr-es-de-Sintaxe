package verificador_de_padroes;

import java.util.Scanner;
import java.util.regex.*;

public class Verifica {
	public static void main(String[] args){
		 Scanner in = new Scanner(System.in);

    int testCases = Integer.parseInt(in.nextLine());

    for (int i = 0; i < testCases; i++) {
        String regex = in.nextLine();
        try{
            Pattern path = Pattern.compile(regex);
            System.out.println("Valid");
        }catch(Exception e){
            System.out.println("Invalid");
        }
    }       
	}
}




