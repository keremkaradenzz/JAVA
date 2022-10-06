import java.util.Scanner;

public class Login {

       public boolean login(Hesap hesap){
           Scanner scanner = new Scanner(System.in);
           System.out.println("Kullanici adi : ");
           String username = scanner.nextLine();
           System.out.println("parola : ");
           String password = scanner.nextLine();
           if(hesap.getUsername().equals(username) && hesap.getPassword().equals(password)){
               return  true;
           }else {
               return  false;
           }
    }


}
