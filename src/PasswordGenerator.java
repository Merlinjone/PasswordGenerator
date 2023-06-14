import java.util.*;
import java.lang.*;




public class PasswordGenerator {
    public static void main(String[] args) {
        int passwordLength;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the password:");
        passwordLength =sc.nextInt();

        String Letters="qwertyuioplkjhgfdsazxcvbnm"+"QWERTYUIOPLKJHGFDSAZXCVBNM"+"!@#$%^&*<>?/";
        String generatedPassword=createPassword(passwordLength,Letters);
        System.out.println(generatedPassword);
    }

    public static String createPassword(int passwordLength,String Letters) {
        StringBuilder sb=new StringBuilder(passwordLength);
        Random random=new Random();
        for(int i=0;i<passwordLength;i++){

            int randomIndex=random.nextInt(Letters.length());
            char RandomChar=Letters.charAt(randomIndex);
            sb.append(RandomChar);


        }
        return sb.toString();
    }
}
