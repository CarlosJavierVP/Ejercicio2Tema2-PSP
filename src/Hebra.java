public class Hebra extends Thread{

    VariableCompartida vc;

    public Hebra(VariableCompartida vc) {
        this.vc = vc;
    }

    public void incrementar(int inc){
        for (int i = 0; i<inc; i++){
           vc.setV(vc.getV()+inc);
        }
        System.out.println("Hilo: "+vc.getV());

    }

    @Override
    public void run(){
        incrementar(10);
    }

}
