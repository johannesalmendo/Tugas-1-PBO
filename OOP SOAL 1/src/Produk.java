public class Produk {

    private String idProduk;
    private String nama;
    private double harga;

    public Produk(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public Produk(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}
