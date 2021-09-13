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
public class Professores extends Funcionarios{
    private String Area;
    public Professores(){
        super();
        Nome="Ana";
        RG=911225341;
        Area ="Humanas";
    }
    public Professores(String Nome, int RG, double Salario_hora, double Horas_mes, String Area){
        super(Nome, RG,Salario_hora,Horas_mes);
        this.Area = Area;
    }
    public Professores(Professores p){
        super(p);
        Area=p.Area;
    }
    public void assign(Professores pr){
        super.assign(pr);
        Area=pr.Area;
    }
    public String Humanas(){
        return Area ="Humanas";
    }
    public String Exatas(){
        return Area ="Exatas";
    }
    public String Biologicas(){
        return Area ="Biologicas";
    }
    @Override
    public String toString(){
        return super.toString() + ", "+ Area;
    }
    @Override
    public void print(){
        System.out.println(toString());
    }
}
