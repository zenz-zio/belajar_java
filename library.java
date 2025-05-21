import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class Buku {
    String id, judul, pengarang, kategori;
    int tahunTerbit;

    public Buku(String id, String judul, String pengarang, int tahunTerbit, String kategori) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
    }
}

class Peminjaman {
    String namaPeminjam, idBuku;
    String tanggalPinjam, tanggalKembali;

    public Peminjaman(String nama, String pinjam, String kembali, String idBuku) {
        this.namaPeminjam = nama;
        this.tanggalPinjam = pinjam;
        this.tanggalKembali = kembali;
        this.idBuku = idBuku;
    }
}

public class library extends JFrame {
    ArrayList<Buku> daftarBuku = new ArrayList<>();
    ArrayList<Peminjaman> daftarPinjam = new ArrayList<>();
    DefaultTableModel bukuModel, pinjamModel;

    public library() {
        setTitle("Aplikasi Perpustakaan");
        setSize(700, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        // Tab Buku
        JPanel bukuPanel = new JPanel(new BorderLayout());
        JPanel inputBuku = new JPanel(new GridLayout(6, 2));
        JTextField idField = new JTextField();
        JTextField judulField = new JTextField();
        JTextField pengarangField = new JTextField();
        JTextField tahunField = new JTextField();
        JTextField kategoriField = new JTextField();

        inputBuku.add(new JLabel("ID Buku:"));
        inputBuku.add(idField);
        inputBuku.add(new JLabel("Judul:"));
        inputBuku.add(judulField);
        inputBuku.add(new JLabel("Pengarang:"));
        inputBuku.add(pengarangField);
        inputBuku.add(new JLabel("Tahun Terbit:"));
        inputBuku.add(tahunField);
        inputBuku.add(new JLabel("Kategori:"));
        inputBuku.add(kategoriField);

        JButton tambahBuku = new JButton("Tambah");
        inputBuku.add(tambahBuku);

        bukuModel = new DefaultTableModel(new String[] { "ID", "Judul", "Pengarang", "Tahun", "Kategori" }, 0);
        JTable bukuTable = new JTable(bukuModel);

        tambahBuku.addActionListener(e -> {
            Buku buku = new Buku(
                    idField.getText(),
                    judulField.getText(),
                    pengarangField.getText(),
                    Integer.parseInt(tahunField.getText()),
                    kategoriField.getText());
            daftarBuku.add(buku);
            bukuModel.addRow(new Object[] { buku.id, buku.judul, buku.pengarang, buku.tahunTerbit, buku.kategori });
            idField.setText("");
            judulField.setText("");
            pengarangField.setText("");
            tahunField.setText("");
            kategoriField.setText("");
        });

        bukuPanel.add(inputBuku, BorderLayout.NORTH);
        bukuPanel.add(new JScrollPane(bukuTable), BorderLayout.CENTER);
        tabs.add("Data Buku", bukuPanel);

        // Tab Peminjaman
        JPanel pinjamPanel = new JPanel(new BorderLayout());
        JPanel inputPinjam = new JPanel(new GridLayout(5, 2));
        JTextField namaField = new JTextField();
        JTextField pinjamField = new JTextField();
        JTextField kembaliField = new JTextField();
        JTextField idBukuPinjamField = new JTextField();

        inputPinjam.add(new JLabel("Nama Peminjam:"));
        inputPinjam.add(namaField);
        inputPinjam.add(new JLabel("Tanggal Pinjam:"));
        inputPinjam.add(pinjamField);
        inputPinjam.add(new JLabel("Tanggal Kembali:"));
        inputPinjam.add(kembaliField);
        inputPinjam.add(new JLabel("ID Buku:"));
        inputPinjam.add(idBukuPinjamField);

        JButton tambahPinjam = new JButton("Pinjam");
        inputPinjam.add(tambahPinjam);

        pinjamModel = new DefaultTableModel(new String[] { "Nama", "Pinjam", "Kembali", "ID Buku" }, 0);
        JTable pinjamTable = new JTable(pinjamModel);

        tambahPinjam.addActionListener(e -> {
            if (kembaliField.getText().compareTo(pinjamField.getText()) < 0) {
                JOptionPane.showMessageDialog(this, "Tanggal kembali tidak boleh sebelum tanggal pinjam.");
                return;
            }
            Peminjaman pinjam = new Peminjaman(
                    namaField.getText(),
                    pinjamField.getText(),
                    kembaliField.getText(),
                    idBukuPinjamField.getText());
            daftarPinjam.add(pinjam);
            pinjamModel.addRow(
                    new Object[] { pinjam.namaPeminjam, pinjam.tanggalPinjam, pinjam.tanggalKembali, pinjam.idBuku });
            namaField.setText("");
            pinjamField.setText("");
            kembaliField.setText("");
            idBukuPinjamField.setText("");
        });

        pinjamPanel.add(inputPinjam, BorderLayout.NORTH);
        pinjamPanel.add(new JScrollPane(pinjamTable), BorderLayout.CENTER);
        tabs.add("Peminjaman", pinjamPanel);

        add(tabs);
        setVisible(true);
    }

    public static void main(String[] args) {
        new library();
    }
}