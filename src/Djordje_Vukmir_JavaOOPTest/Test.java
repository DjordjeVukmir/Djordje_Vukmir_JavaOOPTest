package Djordje_Vukmir_JavaOOPTest;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student("Djordje", "Vukmir",10.0);
        Student student2 = new Student("Marjan", "Gavranovic",7.2);
        Student student3 = new Student("Marko","Milinkovic", 6.2);
        Student student4 = new Student("Dejan","Dejanovic", 6.2);
        Student student5 = new Student("Zarko","Petrusevic", 6.2);
        Student student6 = new Student("Marinko","Lovokradica", 6.2);
        Student student7 = new Student("Kokan","Kokanovic", 6.2);
        /*
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student1.jednaki(student2));
*/
        List<Student> listaStudenata = new ArrayList<>(List.of(student1, student2, student3, student4, student5,student6,student7));


        Fakultet fakultet1 = new Fakultet("PMF", 1400.99, listaStudenata);
        Fakultet fakultet2 = new Fakultet("ETF", 1500.99, listaStudenata);
        Fakultet fakultet3 = new Fakultet("VTS", 1000.00, listaStudenata);
        Fakultet fakultet4 = new Fakultet("Megatrend", 499.99, listaStudenata);
        Fakultet fakultet5 = new Fakultet("UltraMegaGigaTrend", 1200.99, listaStudenata);
        Fakultet fakultet6 = new Fakultet("Singidunum", 99.9, listaStudenata);


        List<Fakultet> listaPrivatnih = new ArrayList<>(List.of(fakultet4, fakultet5, fakultet6, fakultet3));
        Univerzitet ul1 = new Privatni("Prajvt", listaPrivatnih);

        List<Fakultet> listaDrzavnih = new ArrayList<>(List.of(fakultet1, fakultet2));
        Univerzitet ul2 = new Drzavni("Prajvt", listaDrzavnih);


        System.out.println(ul2.daLiJeNaBudzetu(student1));
        System.out.println(ul2.daLiJeNaBudzetu(student7));

        Univerzitet ul3 = new Kombinovani("Kombajn", listaDrzavnih);


        ul3.ispisi(student3);
        System.out.println(ul3.getFakulteti().get(1));

        System.out.println(ul2.najjeftinijiFakultet());
    }
}
