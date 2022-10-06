public class Hesap {

    private String username;
    private String password;
    private int base;

    public Hesap(String username, String password, int base) {
        this.username = username;
        this.password = password;
        this.base = base;
    }
    public  void paraCek(int money) {
        if(money > base){
            System.out.println("yetersiz bakiye");
        }else {
            base -= money;
            System.out.println("kalan para" + base);
        }
    }
    public void paraYatir(int money){
        base += money;
        System.out.println("yeni bakiyeniz = "+ base);
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
