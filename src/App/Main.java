package App;

import Entities.RegisterProfissional;

public class Main {
    public static void main(String[] args) {

        RegisterProfissional profissional = new RegisterProfissional(2545, "Andrezza","andrezza@gmail.com",7000.00 );

        System.out.println("O profissional é: "+profissional.getID()+" " + profissional.getNome()+" "+profissional.getEmail() +" "+profissional.getSalario());

        profissional.CalcularSalario(10);

        System.out.println("O novo salário é: "+profissional.getSalario());


    }

}
