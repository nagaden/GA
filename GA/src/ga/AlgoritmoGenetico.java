/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author nagaden
 */
public class AlgoritmoGenetico {
    
    private double fitness = 0;

    public double getFitness() {
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }
    
    
    
    public ArrayList<Semaforo> GetFitness(ArrayList<Semaforo> semaforos){
        
        Random gerador = new Random();
        double qtd1 = 0;
        double qtd2 = 0;
        double tempoEsvazia = 0;
        double resultado = 0;
        Semaforo sem;
         
        for (int i = 0; i < semaforos.size(); i++){
            if (i+1 == semaforos.size()){
                break;
            }
            sem = (Semaforo)semaforos.get(i+1);
            
            tempoEsvazia = sem.getQtdCarros() * 0.5;
            
            resultado = semaforos.get(i).getTempoTotal() - tempoEsvazia;
            
            if (Math.abs(resultado) >= 0 && Math.abs(resultado) < 4){
                semaforos.get(i).setFitness(Math.abs(resultado));
               
            }
        }
        return semaforos;
    }
    
    public ArrayList<Semaforo> Mutacao (ArrayList<Semaforo> semaforos){
        Random gerador = new Random();
        
        for(int i = 0; i < semaforos.size(); i++){
            if(semaforos.get(i).getFitness() > 3){
                double valor = 0;
                valor = (double)gerador.nextInt(60)+1;
                semaforos.get(i).setTempoTotal(valor);
            }
        }
        return semaforos;
    }

    
    
}
