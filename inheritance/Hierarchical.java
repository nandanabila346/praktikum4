package inheritance;

class Pegawai {
    public void bekerja() {
        System.out.println("Pegawai bekerja...");
    }
}

class Dosen extends Pegawai {
    public void mengajar() {
        System.out.println("Dosen sedang mengajar...");
    }
}

class Staff extends Pegawai {
    public void mengurusAdministrasi() {
        System.out.println("Staff mengurus administrasi...");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Staff s = new Staff();

        d.bekerja();
        d.mengajar();

        s.bekerja();
        s.mengurusAdministrasi();
    }
}
