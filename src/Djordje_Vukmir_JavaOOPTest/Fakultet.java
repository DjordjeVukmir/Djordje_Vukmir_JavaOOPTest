package Djordje_Vukmir_JavaOOPTest;

import java.util.ArrayList;
import java.util.List;

public class Fakultet {
    private String naziv;

    private  double skolarina;

    private List<Student> studenti;

    public Fakultet(String naziv, double skolarina, List<Student> studenti) {
        this.naziv = naziv;
        this.skolarina = skolarina;
        this.studenti = studenti;
    }

    public Fakultet() {
    }

    public Fakultet(String naziv) {
        this.naziv = naziv;
        this.skolarina = 0.0;
        this.studenti = new ArrayList<>();
    }

    public Fakultet(double skolarina) {
        this.skolarina = skolarina;
    }

    public Fakultet(String naziv, double skolarina) {
        this.naziv = naziv;
        this.skolarina = skolarina;
        this.studenti = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getSkolarina() {
        return skolarina;
    }

    public void setSkolarina(double skolarina) {
        this.skolarina = skolarina;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    public double prosek(){
        double sum = 0;
        for(Student student : studenti){
            sum+=student.getProsek();
        }
        return sum / studenti.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fakultet: ").append(naziv).append("\n");
        sb.append("Skolarina: ").append(skolarina).append("\n");
        sb.append("Studenti: ").append("\n");
        for(Student student : studenti){
            sb.append(student.toString()).append("\n");
        }
        sb.deleteCharAt(sb.toString().length() - 1);
        return sb.toString();
    }
}
