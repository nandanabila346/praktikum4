package inheritance;

class Hewan {
    public void bernafas() {
        System.out.println("Hewan bernafas...");
    }
}

class Mamalia extends Hewan {
    public void menyusui() {
        System.out.println("Mamalia menyusui...");
    }
}

class Kucing extends Mamalia {
    public void suara() {
        System.out.println("Kucing mengeong...");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.bernafas();
        k.menyusui();
        k.suara();
    }
}
