import java.util.Scanner;

public class my_sixth_javaClass {

    public static void main(String[] args) {

        //Ask user to enter a character, then check whether the character is alphabet or not

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char chr = str.charAt(0);
        boolean b = Character.isAlphabetic(chr);
        System.out.println(b);
        if(b == true){
            System.out.println("Charecter is alphabet");
        }else{
            System.out.println("Charecter is not alphabet");
        }
    }
}
