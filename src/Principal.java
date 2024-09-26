public class Principal {
    public static void main(String[] args) {

        VariableCompartida vc = new VariableCompartida(5);
        VariableCompartida vc2 = new VariableCompartida(5);


        Hebra hilo1 = new Hebra(vc);
        Hebra hilo2 = new Hebra(vc2);

        hilo1.start();
        hilo2.start();

    }
}
