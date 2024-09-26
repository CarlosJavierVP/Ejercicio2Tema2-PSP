public class Principal {
    public static void main(String[] args) {

        VariableCompartida vc = new VariableCompartida(5);

        Hebra hilo1 = new Hebra(vc);
        Hebra hilo2 = new Hebra(vc);

        hilo1.start();
        hilo2.start();
    }
}

/*
* Los resultados van aumentando progresivamente de 10 en 10, de la manera que se esperaba
* Sin embargo, los resultados finales de los dos hilos son distintos
*
* */
