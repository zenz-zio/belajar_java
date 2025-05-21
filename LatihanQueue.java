import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class LatihanQueue {
    String str;
    int num;

    public static void main(String[] args) {
    }

    public LatihanQueue() {
        try {
            LinkedList<Integer> list = new LinkedList<Integer>();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Jumlah Data:");
            str = bf.readLine();
            if ((num = Integer.parseInt(str)) == 1) {
                System.out.println("Anda menekan angka satu");
                System.exit(0);
            } else {
                for (int i = 0; i < num; i++) {
                    str = bf.readLine();
                    int n = Integer.parseInt(str);
                    list.add(n);
                }
            }
            System.out.println("Isi queue: " + list);
            System.out.println("Elemen pertama: " + list.removeFirst());
            System.out.println("Elemen terakhir: " + list.removeLast());
            System.out.print("Elemen Tengah:");
            while (list.isEmpty()) {
                System.out.print(list.remove() + " ");
            }
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "adalah string)");
            System.exit(num);
        }

    }

}