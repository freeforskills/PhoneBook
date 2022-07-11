import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static List<String[]> abonents = new ArrayList<>(); // [name,phone]
    public static void main(String[] args) {
        addAbonent("Даша", "+79031234567");
        addAbonent("Маша", "+79164353221");
        addAbonent("Даша", "+79262783292");

        getAbonent("Даша");
        getAbonent();
    }

    public static void addAbonent(String name, String phone){
        if (name.length()>=2 && phone.length()>=3) abonents.add(new String[]{name, phone});
    }

    public static void getAbonent(String name){
        if (!abonents.isEmpty()) {
            System.out.println("Абоненты с именем: "+name);
            for (int i = 0; i < abonents.size(); i++) {
                if (name.equals(abonents.get(i)[0])){
                    System.out.println(Arrays.toString(abonents.get(i)));
                }
            }
        }
    }
    public static void getAbonent(){
        if (!abonents.isEmpty()) {
            System.out.println("Все абоненты листа:");
            for (int i = 0; i < abonents.size(); i++) {
                System.out.println(Arrays.toString(abonents.get(i)));
            }
        }
    }
}
