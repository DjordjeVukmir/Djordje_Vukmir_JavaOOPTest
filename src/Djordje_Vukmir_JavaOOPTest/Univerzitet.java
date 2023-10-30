package Djordje_Vukmir_JavaOOPTest;

import java.util.ArrayList;
import java.util.List;

public abstract class Univerzitet implements Servis {

    private String naziv;
    private List<Fakultet> fakulteti;

    public Univerzitet(String naziv, List<Fakultet> fakulteti) {
        this.naziv = naziv;
        this.fakulteti = fakulteti;
    }

    public Univerzitet(String naziv) {
        this.naziv = naziv;
        this.fakulteti = new ArrayList<>();
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Fakultet> getFakulteti() {
        return fakulteti;
    }

    public void setFakulteti(List<Fakultet> fakulteti) {
        this.fakulteti = fakulteti;
    }

    public double ukupniProsek(){
        double sum = 0;
        for(Fakultet fakultet : fakulteti){
            sum += fakultet.prosek();
        }
        return sum / fakulteti.size();
    }

    public Student najboljiStudent(){
        Student najbolji = new Student();
        for (Fakultet fakultet : fakulteti){
            for (Student student : fakultet.getStudenti()){
                if(student.getProsek() > najbolji.getProsek()){
                    najbolji = student;
                }
            }
        }
        return najbolji;
    }

    public Fakultet najjeftinijiFakultet(){
        double najskupljaSkolarina = Integer.MAX_VALUE;
        Fakultet najjeftiniji = new Fakultet(najskupljaSkolarina);
        for (Fakultet fakultet : fakulteti){
            if(fakultet.getSkolarina() < najjeftiniji.getSkolarina()){ //o
                najjeftiniji = fakultet;
            }
        }
        return najjeftiniji;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Univerzitet: ").append(naziv).append(" ima fakultete: ").append("\n");
        for (Fakultet fakultet : fakulteti){
            sb.append(fakultet.getNaziv()).append("\n");
        }
        sb.deleteCharAt(sb.toString().length() - 1);
        return sb.toString();
    }
}
