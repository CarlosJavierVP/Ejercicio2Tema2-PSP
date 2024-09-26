

public class VariableCompartida extends Thread {

    private int v;

    public VariableCompartida(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void incrementar(int inc){
        this.v += inc;
    }

    @Override
    public void run(){
        incrementar(10);
    }


}
