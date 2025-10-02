package inheritance;

// Parent class
class Kendaraan {
    String merk = "Yamaha";

    public void nyalakanMesin() {
        System.out.println("Mesin kendaraan dinyalakan...");
    }
}

// Child class
class Motor extends Kendaraan {
    public void jenisMotor() {
        System.out.println("Ini adalah motor matic.");
    }
}

public class Single {
    public static void main(String[] args) {
        Motor m = new Motor();
        m.nyalakanMesin();
        m.jenisMotor();
        System.out.println("Merk: " + m.merk);
    }
}
