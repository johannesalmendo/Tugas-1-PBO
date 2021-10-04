public class Main {

    public static void main(String[] args) {
        Produk barang1 = new Produk("BRG-001", "Tas Gucci");
        Produk barang2 = new Produk("BRG-002", "Printer Epson");

        barang1.setHarga(1200);
        barang2.setHarga(200);

        Produk barang3 = new Produk("BRG-003", "Koper", 150);
        Produk barang4 = new Produk("BRG-004", "Helm", 20);

        double totalHarga = barang1.getHarga() + barang3.getHarga() + barang4.getHarga();

        System.out.println("ID Produk ||  Nama  ||  Harga");
        System.out.println((barang1.getIdProduk() + "  ||  " + barang1.getNama() + "  ||   " + "$" +barang1.getHarga()));
        System.out.println((barang2.getIdProduk() + "  ||  " + barang2.getNama() + "  ||   " + "$" +barang2.getHarga()));
        System.out.println((barang3.getIdProduk() + "  ||  " + barang3.getNama() + " ||   " + "$" +barang3.getHarga()));
        System.out.println((barang4.getIdProduk() + "  ||  " + barang4.getNama() + "  ||   " + "$" +barang4.getHarga()));

        System.out.print("Total Harga =" + " " + "$" + totalHarga);
    }
}
