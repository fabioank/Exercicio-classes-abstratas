package application;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Contribuinte> list = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < n; i++) {
            System.out.printf("Tax payer #%d data%n", i + 1);
            System.out.print("Individual or Company? (i/c)");
            char ic = scan.next().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = scan.nextDouble();
            if(ic == 'i') {
                System.out.print("Health expenditures: ");
                double expenditures = scan.nextDouble();
                Contribuinte con = new PessoaFisica(name, anualIncome, expenditures);
                list.add(con);
            }else{
                System.out.print("Numbers of employees: ");
                int employees = scan.nextInt();
                scan.nextLine();
                Contribuinte con = new PessoaJuridica(name, anualIncome, employees);
                list.add(con);
            }

        }
        System.out.println("TAXES PAID: ");
        for(Contribuinte cont: list){
            System.out.println(cont);
        }
        System.out.println();
        double sum = 0.0;
        for(Contribuinte cont: list){
            sum += cont.calcImposto();
        }
        System.out.printf("TOTAL TAXES: $ %.2f",sum);
    }
}
