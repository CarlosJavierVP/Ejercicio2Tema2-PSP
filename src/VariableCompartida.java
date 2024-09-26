

public class VariableCompartida {

    private int v;


    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void incrementar(int inc){
        int resultado =0;
        resultado += getV()+inc;
        setV(resultado);
    }


}
