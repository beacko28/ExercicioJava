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
public class Funcionarios {
    public String Nome;
    public int RG;
    private double Salario_hora;
    private double Horas_mes;
    public Funcionarios(){
        Nome  = "Renata";
        RG = 403289440;
        Salario_hora = 1200;
        Horas_mes = 44;
    }
    public Funcionarios(String Nome, int RG, double Salario_hora, double Horas_mes){
        this.Nome = Nome;
        this.RG = RG;
        this.Salario_hora = Salario_hora;
        this.Horas_mes = Horas_mes;
    }
    public Funcionarios(Funcionarios f){
        this(f.Nome,f.RG,f.Salario_hora,f.Horas_mes);
    }
    public double getSalario_hora() {
        return Salario_hora;
    }

    public double getHoras_mes() {
        return Horas_mes;
    } 
    public String getNome() {
        return Nome;
    }
    public int getRG() {
        return RG;
    }
    public void setSalario_hora(double Salario_hora) {
        this.Salario_hora = Salario_hora;
    }
    public void setHoras_mes(double Horas_mes) {
        this.Horas_mes = Horas_mes;
    }  
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setRG(int RG) {
        this.RG = RG;
    }
    public void setNomeRG(String newNome, int newRG, double newSalario_hora, double newHoras_mes){
        Nome = newNome;
        RG = newRG;
        Salario_hora= newSalario_hora;
        Horas_mes = newHoras_mes;
    }
    public void assign(Funcionarios fu){
        Nome = fu.Nome;
        RG = fu.RG;
        Salario_hora = fu.Salario_hora;
        Horas_mes = fu.Horas_mes;
    }
    public String Nome(String Nome){
        return Nome;
    }
    public String RG(String RG){
        return RG;
    }
    public double Salario_hora(double Salario_hora){
        return Salario_hora;
    }
    public double Horas_mes(double Horas_mes){
        return Horas_mes;
    }
    @Override
    public String toString(){
        return  Nome +", "+RG+", "+Salario_hora+", "+Horas_mes;
    }
    public void print(){
        System.out.println(toString());
    }
    public void print(String caption){
        System.out.println(caption);
        print();
    }
    
}
