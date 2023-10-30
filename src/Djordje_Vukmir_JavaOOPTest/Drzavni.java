package Djordje_Vukmir_JavaOOPTest;

import java.util.List;

public class Drzavni extends Univerzitet{

    public Drzavni(String naziv, List<Fakultet> fakulteti) {
        super(naziv, fakulteti);
    }

    public Drzavni(String naziv) {
        super(naziv);
    }

    @Override
    public Fakultet nalaziSe(Student s) {
        Fakultet togStudenta = new Fakultet();
        for (int i = 0; i < getFakulteti().size(); i++) {
            for (int j = 0; j < getFakulteti().get(i).getStudenti().size() ; j++) {
                if (getFakulteti().get(i).getStudenti().get(j).jednaki(s)){
                    togStudenta = getFakulteti().get(i);
                    return togStudenta;
                }
            }
        }
        return null;

    }

    @Override
    public void ispisi(Student s) {
        for (int i = 0; i < getFakulteti().size(); i++) {
            for (int j = 0; j < getFakulteti().get(i).getStudenti().size(); j++) {
                if (getFakulteti().get(i).getStudenti().get(j).jednaki(s)){
                    getFakulteti().get(i).getStudenti().remove(getFakulteti().get(i).getStudenti().get(j));
                }
            }
        }
    }

    @Override
    public boolean daLiJeNaBudzetu(Student s) {
        if (s.getProsek() >= 7.5){
            return true;
        }
        return false;
    }
}
