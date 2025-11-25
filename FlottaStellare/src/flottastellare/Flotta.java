/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author paolucci.sara
 */
public class Flotta {
    private ArrayList<Astronave> astronavi = new ArrayList();
    
    Random random = new Random();
    
    public void aggiungiAstronave(Astronave a){
        if(a != null && astronavi.contains(a) == false){
            astronavi.add(a);
        }
    }
    
    public void eliminaAstronave(Astronave a){
        if(a != null && astronavi.contains(a) == true){
            astronavi.remove(a);
        }
    }
    
    public void alieniAbordo(){
        int r = random.nextInt(astronavi.size());
        astronavi.get(r).alieniAbordo();
    }
    
    public void danni(){
        int r = random.nextInt(astronavi.size());
        astronavi.get(r).danni();
    }
    
    public void collisione(){
        int r = random.nextInt(astronavi.size());
        int s =random.nextInt(astronavi.size());
        eliminaAstronave( astronavi.get(r));
        eliminaAstronave( astronavi.get(s));
    }
    
    public String stampaStato(){
        String astronavistampa = "";
        for(int i = 0; i < astronavi.size(); i++){
            astronavistampa += astronavi.get(i).stampaStato();
        }
        return "Astronavi: " + astronavistampa;
    }
    
}
