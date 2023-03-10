package Entities;

public class RegisterProfissional {
    private Integer ID;
    private String Nome;
    private String Email;
    private Double Salario;

    public RegisterProfissional(Integer ID, String nome, String email, Double salario) {
        this.ID = ID;
        this.Nome = nome;
        this.Email = email;
        this.Salario = salario;
    }

public Double CalcularSalario(double percentual){
    return this.Salario = this.Salario*(percentual/100)+this.Salario;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }
}
