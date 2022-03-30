package perpustakaan;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Andro", 2015061031, "TI A", 20);
        new Peminjaman(mhs1);
        mhs1.daftarAnggota(new Peminjaman(mhs1));
        System.out.println("Peminjaman ke : " + mhs1.anggota.id_anggota);

        //EKSEKUSI BUKU
        Buku buku1 = new Buku("LineUp di Setiap Map Valorant", "Ei-chan", 50, 99);
        buku1.show();
        mhs1.anggota.pinjamBuku(buku1);
    }
    
}
