import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("===================");
        System.out.println("Bankamiza hosgeldiniz....");
        System.out.println("===================");
        int hak = 3;
        while (true){
            if(login.login(hesap)){
                System.out.println("Giris basarili...");
                break;
            }else{
                hak--;
                System.out.println("Kullanici adi veya sifre yanlis ..." + hak + "hakkiniz kaldi");

            }
            if(hak == 0) {
                System.out.println("hakkiniz bitti ...");
                return;
            }
        }

        while (true){
            String  islem = "1.Bakiye getir\n"
                    +"para yatirmak 2 ya bas"
                    +"para cekmek icin 3 ya bas"
                    +"4. cikis yapmak icin q ya bas";
            System.out.println(islem);
            System.out.println("===================");
            String str = scanner.nextLine();
            if(str.equals("q")){
                break;
            }else if(str.equals("1")){
                System.out.println("Bakiyeniz = "+ hesap.getBase());

            }else if(str.equals("2")){
                System.out.println("para yatir");
                int m = scanner.nextInt();
                hesap.paraYatir(m);
            }else if(str.equals("3")){
                System.out.println("cekilecek tutar");
                int m = scanner.nextInt();
                hesap.paraCek(m);
            }
        }


    }
}
