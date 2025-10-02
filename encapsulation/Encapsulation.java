package encapsulation;

class Mahasiswa {
    // atribut private (hanya bisa diakses melalui setter/getter)
    private String nama;
    private int umur;
    private double ipk;

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    public void setIpk(double ipk) {
        if (ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid!");
        }
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getIpk() {
        return ipk;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Andi");
        mhs.setUmur(20);
        mhs.setIpk(3.75);

        System.out.println("Data Mahasiswa:");
        System.out.println("Nama : " + mhs.getNama());
        System.out.println("Umur : " + mhs.getUmur());
        System.out.println("IPK  : " + mhs.getIpk());
    }
}
