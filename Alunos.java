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
public class Alunos extends Funcionarios{
    private int RA;
    private String Turno;
    private String Status;
    public Alunos(){
        super();
        Nome="Carlos";
        RG=2977269;
        RA =  123456789;
        Turno = "Noturno";
        Status = "Ativo";
    }
    public Alunos(String Nome, int RG, double Salario_hora, double Horas_mes, int RA, String Turno, String Status){
        super(Nome, RG,Salario_hora,Horas_mes);
        this.RA=RA;
        this.Turno=Turno;
        this.Status=Status;
    }
    public Alunos(Alunos a){
        super(a);
        RA=a.RA;
        Turno=a.Turno;
        Status=a.Status;
    }
    public void assign(Alunos al){
        super.assign(al);
        RA=al.RA;
        Turno=al.Turno;
        Status=al.Status;
    }
    public String Trancar(){
        if(Status.equals("Ativo")){
            return Status ="Suspenso";
        }else{
            return "";
        }
    }
    public String Destrancar(){
        if(Status.equals("Suspenso")){
            return Status="Ativo";
        }else{
            return "";
        }
    }
    public String Formar(){
        if(Status.equals("Ativo")){
            return Status="Engresso";
        }else{
            return "";
        }
    }
    public String Desistir(){
        if(Status.equals("Ativo") || Status.equals("Suspenso")){
            return Status="Desistente";
        }else{
            return "";
        }
    }
    @Override
        public String toString(){
            return Nome + ", "+ RG + " ," + RA + " ," + Turno + " ," + Status;
        }
    @Override
        public void print(){
        System.out.println(toString());
    }
    }