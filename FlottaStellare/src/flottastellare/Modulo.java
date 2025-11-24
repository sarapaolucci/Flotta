/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flottastellare;

/**
 *
 * @author paolucci.sara
 */
public class Modulo {
    private String nome;
    private Tipi tipo;
    private boolean stato;
    private int salute;
    
    public Modulo(String n, Tipi t){
        this.nome = n;
        this.tipo = t;
        this.stato = true;
        this.salute = 100;
    }
    
    public int getSalute(){
        return this.salute;
    }
    
    public void danni(){
        this.salute -= 30;
    }
    
    public String stampaStato (){
        return "Nome: " + this.nome + "Tipo: " + this.tipo;
    }
    
}
