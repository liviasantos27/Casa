/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Pichau
 */
public class Casa {

    public Casa(String azul, Porta porta1, Porta porta2, Object par3) {
        this(azul, porta1, porta2);
    }

    public Casa(String azul, Porta porta1, Porta porta2) {
    }

    public Casa(String azul, Porta porta1, Porta porta2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String quantPortasAbertas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void pintar(String verde) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public class Porta {
    private boolean aberta;
    private String cor;

    public Porta(String cor) {
        this.cor = cor;
    }

    public void abrir() {
        aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fechar() {
        aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public boolean estaAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    public void pintar(String novaCor) {
        cor = novaCor;
        System.out.println("A porta foi pintada de " + novaCor + ".");
    }
}

    //<editor-fold defaultstate="collapsed" desc=" ">
    
//</editor-fold>
    public class Casa {
        private final Porta porta1;
        private final Porta porta2;

    public Casa(String cor, Porta porta1, Porta porta2) {
        this.porta1 = porta1;
        this.porta2 = porta2;
    }

    public void pintar(String novaCor) {
        System.out.println("A casa foi pintada de " + novaCor + ".");
    }

    public int quantPortasAbertas() {
        int count = 0;
        if (porta1.estaAberta()) {
            count++;
        }
        if (porta2.estaAberta()) {
            count++;
        }
        return count;
    }
  }
    
