package classes;

public class Main {
    public static void main(String[] args) {
        car porsche = new car();
        car BMW = new car();
        porsche.setModel("Carrera");
        System.out.println("Modle is "+porsche.getModel());
    }
}
