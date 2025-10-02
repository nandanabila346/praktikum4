package inheritance;

interface Musik {
    void bermainMusik();
}

class Orang {
    public void identitas() {
        System.out.println("Saya adalah seorang mahasiswa.");
    }
}

class MahasiswaMusik extends Orang implements Musik {
    public void bermainMusik() {
        System.out.println("Mahasiswa bermain gitar.");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        MahasiswaMusik mm = new MahasiswaMusik();
        mm.identitas();
        mm.bermainMusik();
    }
}
