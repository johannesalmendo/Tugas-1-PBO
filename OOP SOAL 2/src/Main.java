public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        System.out.println("Daftar Buku");
        System.out.println("Judul Buku : " + buku1.getJudul() + "\n" +
                "Pengarang : " + buku1.getPengarang() + "\n" +
                "Harga : " + buku1.getHarga() + "\n");

        System.out.println("Judul Buku : " + buku2.getJudul() + "\n" +
                "Pengarang : " + buku2.getPengarang() + "\n" +
                "Harga : " + buku2.getHarga() + "\n");
    }
}
