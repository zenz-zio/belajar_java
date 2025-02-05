
import javax.swing.JOptionPane;

public class latihan5 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("silahkan masukkan nama anda : ");
        String msg = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}
