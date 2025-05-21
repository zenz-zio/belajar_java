public class Kucing extends mamalia {

    public static void main(String[] args) {
        // binatang B = new binatang();
        mamalia M = new mamalia();
        Kucing K = new Kucing();

        System.out.println(M instanceof binatang);
        System.out.println(K instanceof mamalia);
        System.out.println(K instanceof binatang);
    }
}
