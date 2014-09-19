package no.hinesna;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Person> personer = new ArrayList<Person>();
        Scanner scanner = new Scanner(System.in);
        boolean b = true;

        System.out.println("Meny");
        System.out.println("E = exit");
        System.out.println("A = add");
        System.out.println("S = show");
        System.out.println("D = delete all");
        System.out.println("X = delete item");

        while(b == true){
            System.out.print("Ta et valg: ");
            char valg = scanner.nextLine().charAt(0);

            if(valg == 'E'){
                System.out.println("Avslutter.");
                b = false;
            }
            else if(valg == 'A'){
                System.out.print("Skriv inn fornavn: ");
                String forNavn = scanner.nextLine();
                System.out.print("Skriv inn etternavn: ");
                String etterNavn = scanner.nextLine();

                Person person = new Person(forNavn, etterNavn);
                personer.add(person);

                System.out.println("Personen ble lagt til.");
            }
            else if(valg == 'S'){
                System.out.println("Antall personer: " + personer.size());
                int i = 0;
                for(Person p : personer){
                    System.out.println("Index: "+i+", Fornavn: " + p.getForNavn() +", Etternavn: " + p.getEtterNavn());
                    i++;
                }
            }
            else if(valg == 'D'){
                personer = new ArrayList<Person>();
            }
            else if(valg == 'X'){
                System.out.print("Velg index du vil slette: ");
                int index = Integer.parseInt(scanner.nextLine());
                personer.remove(personer.get(index));
                System.out.println("Person ble slettet.");
            }
        }
    }
}
