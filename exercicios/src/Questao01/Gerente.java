package Questao01;

public class Gerente extends Funcionario{
    private String departamento;

    public double calcularBonus(){
        return 0.10 * salario;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }

}
