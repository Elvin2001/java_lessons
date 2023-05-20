package _abstract;

public class Test {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.run());
        ferrari.stop();

        System.out.println();
        Porsche porsche = new Porsche();
        System.out.println(porsche.run());
        porsche.stop();
    }
}
