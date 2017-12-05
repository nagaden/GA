/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ga;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author nagaden
 */
public class GA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Inicia a passagem de tempo da simulacao
      //long tempoSimulacao = System.currentTimeMillis();
       AlgoritmoGenetico ag = new AlgoritmoGenetico();
       
       ArrayList semaforos = new ArrayList<Semaforo>();
       ArrayList semaforosOtimizados = new ArrayList<Semaforo>();
       
        Semaforo s1 = new Semaforo();
        s1.setNome("S1");
        s1.setQtdCarros(7);
        s1.setTempoTotal(59);
        semaforos.add(s1);
       
        Semaforo s2 = new Semaforo();
        s2.setNome("S2");
        s2.setQtdCarros(18);
        s2.setTempoTotal(56);
        semaforos.add(s2);
       
        Semaforo s3 = new Semaforo();
        s3.setNome("S3");
        s3.setQtdCarros(12);
        s3.setTempoTotal(59);
        semaforos.add(s3);
       
        Semaforo s4 = new Semaforo();
        s4.setNome("S4");
        s4.setQtdCarros(16);
        s4.setTempoTotal(56);
        semaforos.add(s4);
       
        Semaforo s5 = new Semaforo();
        s5.setNome("S5");
        s5.setQtdCarros(12);
        s5.setTempoTotal(59);
        semaforos.add(s5);
       
        Semaforo s6 = new Semaforo();
        s6.setNome("S6");
        s6.setQtdCarros(16);
        s6.setTempoTotal(56);
        semaforos.add(s6);
       
        Semaforo s7 = new Semaforo();
        s7.setNome("S7");
        s7.setQtdCarros(12);
        s7.setTempoTotal(59);
        semaforos.add(s7);
       
        Semaforo s8 = new Semaforo();
        s8.setNome("S8");
        s8.setQtdCarros(14);
        s8.setTempoTotal(56);
        semaforos.add(s8);
       
       	Semaforo s9 = new Semaforo();
        s9.setNome("S9");
        s9.setQtdCarros(14);
        s9.setTempoTotal(59);
	semaforos.add(s9);
       
	Semaforo s10 = new Semaforo();
        s10.setNome("S10");
        s10.setQtdCarros(11);
        s10.setTempoTotal(56);
	semaforos.add(s10);
       
	Semaforo s11 = new Semaforo();
        s11.setNome("S11");
        s11.setQtdCarros(1);
        s11.setTempoTotal(59);
        semaforos.add(s11);
	   
	Semaforo s12 = new Semaforo();
        s12.setNome("S12");
        s12.setQtdCarros(14);
        s12.setTempoTotal(56);
        semaforos.add(s12);

        Semaforo s13 = new Semaforo();
        s13.setNome("S13");
        s13.setQtdCarros(8);
        s13.setTempoTotal(59);
        semaforos.add(s13);
       
	Semaforo s14 = new Semaforo();
        s14.setNome("S14");
        s14.setQtdCarros(8);
        s14.setTempoTotal(56);
        semaforos.add(s14);

        Semaforo s15 = new Semaforo();
        s15.setNome("S15");
        s15.setQtdCarros(12);
        s15.setTempoTotal(59);
        semaforos.add(s15);

        Semaforo s16 = new Semaforo();
        s16.setNome("S16");
        s16.setQtdCarros(16);
        s16.setTempoTotal(56);
        semaforos.add(s16);

        Semaforo s17 = new Semaforo();
        s17.setNome("S17");
        s17.setQtdCarros(6);
        s17.setTempoTotal(59);
        semaforos.add(s17);

        Semaforo s18 = new Semaforo();
        s18.setNome("S18");
        s18.setQtdCarros(11);
        s18.setTempoTotal(56);
        semaforos.add(s18);

        Semaforo s19 = new Semaforo();
        s19.setNome("S19");
        s19.setQtdCarros(4);
        s19.setTempoTotal(59);
        semaforos.add(s19);

        Semaforo s20 = new Semaforo();
        s20.setNome("s20");
        s20.setQtdCarros(12);
        s20.setTempoTotal(56);
        semaforos.add(s20);

        Semaforo s21 = new Semaforo();
        s21.setNome("S21");
        s21.setQtdCarros(14);
        s21.setTempoTotal(59);
        semaforos.add(s21);

        Semaforo s22 = new Semaforo();
        s22.setNome("S22");
        s22.setQtdCarros(9);
        s22.setTempoTotal(56);
        semaforos.add(s22);

        Semaforo s23 = new Semaforo();
        s23.setNome("S23");
        s23.setQtdCarros(12);
        s23.setTempoTotal(59);
        semaforos.add(s23);

        Semaforo s24 = new Semaforo();
        s24.setNome("S24");
        s24.setQtdCarros(10);
        s24.setTempoTotal(56);
        semaforos.add(s24);

        Semaforo s25 = new Semaforo();
        s25.setNome("s25");
        s25.setQtdCarros(12);
        s25.setTempoTotal(59);
        semaforos.add(s25);

        Semaforo s26 = new Semaforo();
        s26.setNome("s26");
        s26.setQtdCarros(5);
        s26.setTempoTotal(56);
        semaforos.add(s26);

        Semaforo s27 = new Semaforo();
        s27.setNome("S27");
        s27.setQtdCarros(15);
        s27.setTempoTotal(59);
        semaforos.add(s27);

        Semaforo s28 = new Semaforo();
        s28.setNome("S28");
        s28.setQtdCarros(14);
        s28.setTempoTotal(56);
        semaforos.add(s28);

        Semaforo s29 = new Semaforo();
        s29.setNome("S29");
        s29.setQtdCarros(5);
        s29.setTempoTotal(59);
        semaforos.add(s29);

        Semaforo s30 = new Semaforo();
        s30.setNome("S30");
        s30.setQtdCarros(10);
        s30.setTempoTotal(56);
        semaforos.add(s30);

        Semaforo s31 = new Semaforo();
        s31.setNome("S31");
        s31.setQtdCarros(10);
        s31.setTempoTotal(59);
        semaforos.add(s31);

        Semaforo s32 = new Semaforo();
        s32.setNome("S32");
        s32.setQtdCarros(11);
        s32.setTempoTotal(56);
        semaforos.add(s32);

        Semaforo s33 = new Semaforo();
        s33.setNome("S33");
        s33.setQtdCarros(12);
        s33.setTempoTotal(59);
        semaforos.add(s33);

        Semaforo s34 = new Semaforo();
        s34.setNome("S34");
        s34.setQtdCarros(11);
        s34.setTempoTotal(56);
        semaforos.add(s34);

        Semaforo s35 = new Semaforo();
        s35.setNome("S35");
        s35.setQtdCarros(8);
        s35.setTempoTotal(59);
        semaforos.add(s35);

        Semaforo s36 = new Semaforo();
        s36.setNome("S36");
        s36.setQtdCarros(10);
        s36.setTempoTotal(56);
        semaforos.add(s36);

        Semaforo s37 = new Semaforo();
        s37.setNome("S37");
        s37.setQtdCarros(8);
        s37.setTempoTotal(59);
        semaforos.add(s37);

        Semaforo s38 = new Semaforo();
        s38.setNome("S38");
        s38.setQtdCarros(12);
        s38.setTempoTotal(56);
        semaforos.add(s38);

        Semaforo s39 = new Semaforo();
        s39.setNome("S39");
        s39.setQtdCarros(16);
        s39.setTempoTotal(59);
        semaforos.add(s39);

        Semaforo s40 = new Semaforo();
        s40.setNome("S40");
        s40.setQtdCarros(11);
        s40.setTempoTotal(56);
        semaforos.add(s40);

        Semaforo s41 = new Semaforo();
        s41.setNome("S41");
        s41.setQtdCarros(3);
        s41.setTempoTotal(59);
        semaforos.add(s41);

        Semaforo s42 = new Semaforo();
        s42.setNome("S42");
        s42.setQtdCarros(7);
        s42.setTempoTotal(56);
        semaforos.add(s42);

        Semaforo s43 = new Semaforo();
        s43.setNome("S43");
        s43.setQtdCarros(5);
        s43.setTempoTotal(59);
        semaforos.add(s43);

        Semaforo s44 = new Semaforo();
        s44.setNome("S44");
        s44.setQtdCarros(16);
        s44.setTempoTotal(56);
        semaforos.add(s44);

        Semaforo s45 = new Semaforo();
        s45.setNome("S45");
        s45.setQtdCarros(9);
        s45.setTempoTotal(59);
        semaforos.add(s45);

        Semaforo s46 = new Semaforo();
        s46.setNome("S46");
        s46.setQtdCarros(10);
        s46.setTempoTotal(56);
        semaforos.add(s46);

        Semaforo s47 = new Semaforo();
        s47.setNome("S47");
        s47.setQtdCarros(4);
        s47.setTempoTotal(59);
        semaforos.add(s47);

        Semaforo s48 = new Semaforo();
        s48.setNome("S48");
        s48.setQtdCarros(7);
        s48.setTempoTotal(56);
        semaforos.add(s48);

        Semaforo s49 = new Semaforo();
        s49.setNome("S49");
        s49.setQtdCarros(4);
        s49.setTempoTotal(59);
        semaforos.add(s49);

        Semaforo s50 = new Semaforo();
        s50.setNome("S50");
        s50.setQtdCarros(10);
        s50.setTempoTotal(56);
        semaforos.add(s50);

        Semaforo s51 = new Semaforo();
        s51.setNome("S51");
        s51.setQtdCarros(14);
        s51.setTempoTotal(59);
        semaforos.add(s51);

        Semaforo s52 = new Semaforo();
        s52.setNome("S52");
        s52.setQtdCarros(13);
        s52.setTempoTotal(56);
        semaforos.add(s52);

        Semaforo s53 = new Semaforo();
        s53.setNome("S53");
        s53.setQtdCarros(4);
        s53.setTempoTotal(59);
        semaforos.add(s53);

        Semaforo s54 = new Semaforo();
        s54.setNome("S54");
        s54.setQtdCarros(14);
        s54.setTempoTotal(56);
        semaforos.add(s54);

        Semaforo s55 = new Semaforo();
        s55.setNome("S55");
        s55.setQtdCarros(10);
        s55.setTempoTotal(59);
        semaforos.add(s55);

        Semaforo s56 = new Semaforo();
        s56.setNome("S56");
        s56.setQtdCarros(15);
        s56.setTempoTotal(56);
        semaforos.add(s56);

        Semaforo s57 = new Semaforo();
        s57.setNome("S57");
        s57.setQtdCarros(20);
        s57.setTempoTotal(59);
        semaforos.add(s57);

        Semaforo s58 = new Semaforo();
        s58.setNome("S58");
        s58.setQtdCarros(12);
        s58.setTempoTotal(56);
        semaforos.add(s58);

        Semaforo s59 = new Semaforo();
        s59.setNome("S59");
        s59.setQtdCarros(9);
        s59.setTempoTotal(59);
        semaforos.add(s59);

        Semaforo s60 = new Semaforo();
        s60.setNome("S60");
        s60.setQtdCarros(7);
        s60.setTempoTotal(56);
        semaforos.add(s60);

        Semaforo s61 = new Semaforo();
        s61.setNome("S61");
        s61.setQtdCarros(7);
        s61.setTempoTotal(59);
        semaforos.add(s61);

        Semaforo s62 = new Semaforo();
        s62.setNome("S62");
        s62.setQtdCarros(8);
        s62.setTempoTotal(56);
        semaforos.add(s62);

        Semaforo s63 = new Semaforo();
        s63.setNome("S63");
        s63.setQtdCarros(18);
        s63.setTempoTotal(59);
        semaforos.add(s63);

        Semaforo s64 = new Semaforo();
        s64.setNome("S64");
        s64.setQtdCarros(4);
        s64.setTempoTotal(56);
        semaforos.add(s64);

        Semaforo s65 = new Semaforo();
        s65.setNome("S65");
        s65.setQtdCarros(1);
        s65.setTempoTotal(59);
        semaforos.add(s65);

        Semaforo s66 = new Semaforo();
        s66.setNome("S66");
        s66.setQtdCarros(7);
        s66.setTempoTotal(56);
        semaforos.add(s66);

        Semaforo s67 = new Semaforo();
        s67.setNome("S67");
        s67.setQtdCarros(3);
        s67.setTempoTotal(59);
        semaforos.add(s67);

        Semaforo s68 = new Semaforo();
        s68.setNome("S68");
        s68.setQtdCarros(13);
        s68.setTempoTotal(56);
        semaforos.add(s68);

        Semaforo s69 = new Semaforo();
        s69.setNome("S69");
        s69.setQtdCarros(12);
        s69.setTempoTotal(59);
        semaforos.add(s69);

        Semaforo s70 = new Semaforo();
        s70.setNome("S70");
        s70.setQtdCarros(5);
        s70.setTempoTotal(56);
        semaforos.add(s70);

        Semaforo s71 = new Semaforo();
        s71.setNome("S71");
        s71.setQtdCarros(1);
        s71.setTempoTotal(59);
        semaforos.add(s71); 
       
       // for (int i = 0; i < semaforos.size(); i++){
         //  Semaforo sem = new Semaforo();
         //  sem = (Semaforo)semaforos.get(i);
          
         //  System.out.println(sem.getNome() + "; " + sem.getQtdCarros() + "; " + sem.getTempoTotal() + "; " + sem.getFitness());
        //}
        
        
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        double tempoGastoB = 0;
        double qtdTotalCarrosB = 0;
        double tempoAGB = 0;
        Semaforo semAG;
        for(int x = 0; x < semaforos.size(); x++){
            if(x + 1 == semaforos.size()){
                break;
            }
            
            semAG = (Semaforo)semaforos.get(x);
            qtdTotalCarrosB = qtdTotalCarrosB + semAG.getQtdCarros();
            tempoGastoB = tempoGastoB + (semAG.getQtdCarros() * semAG.getTempoTotal());
            tempoAGB = tempoGastoB/qtdTotalCarrosB;
            
        }
        
        
        //Iterando minhas geracoes
        for(int i = 0; i < 100; i++){
            semaforos = ag.GetFitness(semaforos);
            semaforos = ag.Mutacao(semaforos);
            
            for (int iu = 0; iu < semaforos.size(); iu++){
            Semaforo sem = new Semaforo();
            sem = (Semaforo)semaforos.get(iu);
          
                    System.out.println("Semaforo > " + sem.getNome() + "; quantidade de carros parados " + sem.getQtdCarros() + "; Tempo parado " + sem.getTempoTotal() + "; Fitness " + sem.getFitness());
            }
            
            System.out.println();
            System.out.println("----------------------------------------------------------- GERACAO " + i + " -----------------------------------------------------------");
            System.out.println();
        } 
         

        //Apos aplicar o AG preciso descobrir afinal com a media da melhor configuracao para essa populacao
        double melhorTempo = 0;
        Semaforo s;
        for(int u = 0; u < semaforos.size(); u++){
            
            if(u + 1 == semaforos.size()){
                break;
            }
            s = (Semaforo)semaforos.get(u);
            
            melhorTempo = melhorTempo + s.getTempoTotal();
            
            
        }
        melhorTempo = melhorTempo/(semaforos.size()-1);
        
        
       //Display do resultado apos AG
     //  for (int i = 0; i < semaforos.size(); i++){
         //  Semaforo sem = new Semaforo();
         //  sem = (Semaforo)semaforos.get(i);
          
        //   System.out.println("Semaforo > " + sem.getNome() + "; quantidade de carros parados " + sem.getQtdCarros() + "; Tempo parado " + sem.getTempoTotal() + "; Fitness " + sem.getFitness());
      // }
       
       
        //Calculo do tempo medio gasto apos aplicacao do AG
        double tempoGasto = 0;
        double qtdTotalCarros = 0;
        double tempoComAG = 0;
        Semaforo se;
       for(int d = 0; d < semaforos.size(); d++){
            if(d + 1 == semaforos.size()){
                break;
            }
            se = (Semaforo)semaforos.get(d);
            qtdTotalCarros = qtdTotalCarros + se.getQtdCarros();
            tempoGasto = tempoGasto + (se.getQtdCarros() * se.getTempoTotal());
       }
       tempoComAG = tempoGasto/qtdTotalCarros;
       
       System.out.println("Melhor configuracao de tempo aplicado apos AG " + Math.round(melhorTempo));
       System.out.println("Tempo médio gasto por veiculo sem AG: " + Math.round(Math.abs(tempoAGB)) + " carros " + qtdTotalCarros);
       System.out.println("Tempo médio gasto por veiculo após AG: " + Math.round(Math.abs(tempoComAG)) + " carros " + qtdTotalCarros);
       
       
       
       
       
       
       
       
       
       
    }
    
    public static String millisToShortDHMS(long duration) {
    String res = "";
    long days  = TimeUnit.MILLISECONDS.toDays(duration);
    long hours = TimeUnit.MILLISECONDS.toHours(duration)
                   - TimeUnit.DAYS.toHours(TimeUnit.MILLISECONDS.toDays(duration));
    long minutes = TimeUnit.MILLISECONDS.toMinutes(duration)
                     - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(duration));
    long seconds = TimeUnit.MILLISECONDS.toSeconds(duration)
                   - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration));
    if (days == 0) {
      res = String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
    else {
      res = String.format("%dd%02d:%02d:%02d", days, hours, minutes, seconds);
    }
    return res;
  }
}
