public class Makanan {
    // Variabel instance
    private String nama;
    private String bahanDasar;
    private int berat;

    // Getter & Setter Method dari nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Overloading constructor
    public Makanan() {
        this("Nasi", "Beras", 250); // Memanggil constructor lain dengan keyword "this"
    }

    public Makanan(String nama) {
        this(nama, "Nasi", 500); // Memanggil constructor lain dengan keyword "this"
    }

    public Makanan(String nama, String bahanDasar) {
        this(nama, bahanDasar, 750); // Memanggil constructor lain dengan keyword "this"
    }

    public Makanan(String nama, String bahanDasar, int berat) {
        this.nama = nama;
        this.bahanDasar = bahanDasar;
        this.berat = berat;
    }

    // Overloading method & method void
    public void deskripsi() {
        System.out.println("Nama makanan: " + nama);
        System.out.println("Bahan dasar: " + bahanDasar);
        System.out.println("Berat: " + berat + " gram");
        System.out.println("");
    }

    public void deskripsi(int harga) {
        System.out.println("Nama makanan : " + nama);
        System.out.println("Bahan dasar : " + bahanDasar);
        System.out.println("Berat : " + berat + " gram");
        System.out.println("Harga : " + harga + " ribu rupiah");
        System.out.println("");
    }

    public void deskripsi(int harga, int porsi) {
        System.out.println("Nama makanan : " + nama);
        System.out.println("Bahan dasar : " + bahanDasar);
        System.out.println("Berat : " + berat + " gram");
        System.out.println("Harga : " + harga + " ribu rupiah");
        System.out.println("Porsi : " + porsi + " mangkok");
        System.out.println("");
    }

    // Method non-void
    public double beratmg() {
        return berat * 1000;
    }
}
