import com.sun.jdi.IntegerValue;
import java.util.ArrayList;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> data1 = new ArrayList<String>();
        ArrayList<String> data2 = new ArrayList<String>();
        ArrayList<String> Newdata = new ArrayList<String>();
        int k = 0;
        int sum = 0;
        String b = "0";
        int count = 1;

        System.out.print("Введите элемент массива ");
        String a = in.next();
        while (!a.equals("quit")) {
            data1.add(a);
            b = Integer.toString(Integer.valueOf(a) + Integer.valueOf(b));
            data2.add(b);
            String c = Double.toString(Double.valueOf(b) / count);
            Newdata.add(c);
            count = count + 1;
            System.out.print("Введите элемент массива ");
            a = in.next();
        }
        System.out.println("Пользовательский лист: " + data1);
        System.out.println("Обработанный лист: " + Newdata);
    }
}

