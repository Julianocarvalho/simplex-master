package simplex;

/**
 *
 * @author juliano
 */
public class Problema {
    /* Matriz de Restrições do problema */
    private float[][] restricoes;
    
    /* Vetor de Custos e Bezinho */
    private float[] custos_funcao, b;
    
    /* Vetor de Sinais das restrições e Indicador da função (Max ou Min). */
    private String[] sinais;
    
    /* Vetores de variáveis Básicas e não Básicas */
    private int[] basicas, nao_basicas;

    public Problema(float[][] restricoes, float[] C, float[] b, String[] sinais) {
        this.restricoes = restricoes;
        this.custos_funcao = C;
        this.b = b;
        this.sinais = sinais;
        this.basicas = null;
        this.nao_basicas = null;
    }
    
    public Problema(float[][] restricoes, float[] C, float[] b, String[] sinais, int[] basicas, int[] nao_basicas) {
        this.restricoes = restricoes;
        this.custos_funcao = C;
        this.b = b;
        this.sinais = sinais;
        this.basicas = basicas;
        this.nao_basicas = nao_basicas;
    }

    public void setRestricoes(float[][] restricoes) {
        this.restricoes = restricoes;
    }

    public void setC(float[] C) {
        this.custos_funcao = C;
    }

    public void setB(float[] b) {
        this.b = b;
    }

    public void setSinais(String[] sinais) {
        this.sinais = sinais;
    }

    public void setBasicas(int[] basicas) {
        this.basicas = basicas;
    }

    public void setNao_basicas(int[] nao_basicas) {
        this.nao_basicas = nao_basicas;
    }
    
    public float[][] getRestricoes() {
        return restricoes;
    }

    public float[] getC() {
        return custos_funcao;
    }

    public float[] getB() {
        return b;
    }

    public String[] getSinais() {
        return sinais;
    }

    public int[] getBasicas() {
        return basicas;
    }

    public int[] getNao_basicas() {
        return nao_basicas;
    }
}
