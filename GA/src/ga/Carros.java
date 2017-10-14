/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

/**
 *
 * @author nagaden
 */
public class Carros {
    private long tempoParado;
    private long tempoInicial;
    private long tempoFinal;
    
    public Carros(){
        tempoInicial = System.currentTimeMillis();
    }

    public long getTempoParado() {
        return tempoParado;
    }

    public void setTempoParado(long tempoParado) {
        this.tempoParado = tempoParado;
    }

    public long getTempoInicial() {
        return tempoInicial;
    }

    public void setTempoInicial(long tempoInicial) {
        this.tempoInicial = tempoInicial;
    }

    public long getTempoFinal() {
        return tempoFinal;
    }

    public void setTempoFinal(long tempoFinal) {
        this.tempoFinal = tempoFinal;
    }
    
    
    
}
