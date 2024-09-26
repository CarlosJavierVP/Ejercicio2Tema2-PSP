

public class VariableCompartida {

    private int v;


    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int incrementar(int inc){
        int resultado = 0;
        resultado += v+inc;

        return resultado;
    }


}
