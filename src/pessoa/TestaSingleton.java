/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author geovane.saraujo
 */
public class TestaSingleton extends Thread {

    @Override
    public void run() {
        Pessoa pessoa = Pessoa.getInstancia();
        System.out.println(pessoa);
        System.out.println(pessoa.getId());
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.getInstancia();
        pessoa.setId(1);
        pessoa.setIdade(new Random().nextInt(100));
        pessoa.setNome("João");

        //teste em singleton que funciona mesmo utilizando thread
        TestaSingleton testeSingleton = new TestaSingleton();
        TestaSingleton testeSingleton2 = new TestaSingleton();
        testeSingleton.start();
        testeSingleton2.start();
    }

}
