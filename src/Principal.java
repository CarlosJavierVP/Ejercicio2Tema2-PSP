public class Principal {
    public static void main(String[] args) {

        VariableCompartida vc = new VariableCompartida(5);
        VariableCompartida vc2 = new VariableCompartida(5);

        vc.start();
        vc2.start();


        System.out.println("Resultado hebra 1: "+vc.getV()+"\n Resultado hebra 2: "+vc2.getV());

    }
}
