package Djordje_Vukmir_JavaOOPTest;

public interface Servis {

    Fakultet nalaziSe(Student s);
    //Vraca fakultet koji pohadja
    //prosledjen student. Moguce je proslediti i duboku kopiju studenta. Ako
    //prosledjeni student ne pohadja ni jedan fakultet vratiti null vrednost.
    //Predpostaviti da jedan student moze da pohadja najvise jedan fakultet!
    void ispisi(Student s);
    //Ispisuje prosledjenog studenta iz fakulteta
    //ukoliko je to moguce. Moguce je proslediti i duboku kopiju studenta ili
    //studenta koji nije upisan ni u jedan fakultet.

    boolean daLiJeNaBudzetu(Student s);
    //Vraca odgovor na pitanje
    //da li je student na budzetu ili ne.

}
