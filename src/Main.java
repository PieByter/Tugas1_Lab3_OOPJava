public class Main {
    public static void main(String[] args) {
        //Penggunaan constructor overloading
        Makanan makanan1 = new Makanan();
        Makanan makanan2 = new Makanan("Nasi Goreng");
        Makanan makanan3 = new Makanan("Mie Ayam", "Mie");

        //Penggunaan method overloading
        makanan1.deskripsi();
        makanan2.deskripsi(20);
        makanan3.deskripsi(30,5);

        // Membuat variabel baru untuk menampung nilai return dari method non-void
        double beratmg = makanan2.beratmg();
        System.out.println("Berat " + makanan2.getNama() + " dalam miligram: " + beratmg);
    }
}