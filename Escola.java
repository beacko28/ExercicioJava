/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;
/**
 *
 * @author beatriz
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionarios f1, f2;
        f1 = new Funcionarios();
        f2 = new Funcionarios("Marcos",987654321,1000,40);
        f1.print();
        f2.print();
        Alunos a1, a2;
        a1 = new Alunos();
        a2 = new Alunos("Jose",403289440,0,0,987654321,"Diurno","Suspenso");
        a1.print();
        a2.print();
        Professores p1, p2;
        p1 = new Professores();
        p2 = new Professores("Matheus",418757896,2000,40,"Exatas");
        p1.print();
        p2.print();
        a1.Trancar();
        a1.print();
        a2.Desistir();
        a2.print();
    }
    
}
