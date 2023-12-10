
import modelo.Casa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pichau
 */
public class principal {
    public class TesteCasa {
    public static void main(String[] args) {
        // Criando portas
        Porta porta1 = new Porta("Marrom");
        Porta porta2 = new Porta("Branco");

        // Criando casa e associando portas
        Casa minhaCasa = new Casa("Azul", porta1, porta2);

        // Testando métodos da casa
        minhaCasa.pintar("Verde");
        System.out.println("Número de portas abertas: " + minhaCasa.quantPortasAbertas());

        porta1.abrir();
        porta2.abrir();

        System.out.println("Número de portas abertas: " + minhaCasa.quantPortasAbertas());

        porta1.fechar();

        System.out.println("Número de portas abertas: " + minhaCasa.quantPortasAbertas());
    }
}
}
