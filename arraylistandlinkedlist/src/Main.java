import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    private static  void showArray(ArrayList<String> data){
        for(String e:data){
            System.out.println(e);
        }
    }
    private static  void showLinked(LinkedList<String> data){
        for(String e:data){
            System.out.println(e);
        }
        System.out.println("--------iterator----------");
        ListIterator<String> iterator = data.listIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void sirali_ekle(LinkedList<String> data, String yeni){
        ListIterator<String> iterator = data.listIterator();

        while (iterator.hasNext()){
            int k = iterator.next().compareTo(yeni);
            if(k == 0){
                return;
            }else if(k < 0){
                // Yeni deger iterator.nextten daha buyuk

            }else if(k > 0){
                iterator.previous();
                iterator.add(yeni);

                return;
            }
        }
        iterator.add(yeni);

    }
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<String>();
        isimler.add("kerem");
        isimler.add("efe");
        isimler.add("taha");

        showArray(isimler);
        System.out.println("----------------------");

        LinkedList<String> isimler2 = new LinkedList<>();

        isimler2.add("aaaa");
        isimler2.add("dddd");
        isimler2.add("cccccc");

        isimler2.add(1,"asjdklasjd");
        showLinked(isimler2);

    }
}