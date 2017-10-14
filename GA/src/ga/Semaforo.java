/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import java.util.ArrayList;

/**
 *
 * @author nagaden
 */
public class Semaforo {
    
   
    private String nome;
    private static ArrayList Carros = new ArrayList<Carros>();
    // Tempo total armazanado dos veiculos que ficaram nesse semaforo
    private double qtdCarros;
    private double fitness = 999;
    private double tempoTotal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQtdCarros() {
        return qtdCarros;
    }

    public void setQtdCarros(double qtdCarros) {
        this.qtdCarros = qtdCarros;
    }

    public double getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(double tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public static ArrayList getCarros() {
        return Carros;
    }

    public static void setCarros(ArrayList Carros) {
        Semaforo.Carros = Carros;
    }

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }
    
            
    
}
