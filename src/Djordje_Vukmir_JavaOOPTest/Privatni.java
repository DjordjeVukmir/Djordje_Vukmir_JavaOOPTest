package Djordje_Vukmir_JavaOOPTest;

import java.util.List;

public class Privatni extends Univerzitet{
    public Privatni(String naziv, List<Fakultet> fakulteti) {
        super(naziv, fakulteti);
    }

    public Privatni(String naziv) {
        super(naziv);
    }

    @Override
    public Fakultet nalaziSe(Student s) {
        Fakultet togStudenta = new Fakultet();
        for (int i = 0; i < getFakulteti().size(); i++) {
            for (int j = 0; j < getFakulteti().get(i).getStudenti().size() ; j++) {
                if (getFakulteti().get(i).getStudenti().get(j).jednaki(s)){
                    togStudenta = getFakulteti().get(i);
                }
            }
        }
        return togStudenta;
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
        int duzinaSamoglasnikaUimenu = 0;
        String samoglasnici = "AEIOUaeiou";
        for (int i = 0; i < s.getIme().length() ; i++) {
            for (int j = 0; j < s.getPrezime().length(); j++) {
                if (s.getIme().contains(samoglasnici)){
                    duzinaSamoglasnikaUimenu++;
                }
                if(s.getPrezime().contains(samoglasnici)){
                    duzinaSamoglasnikaUimenu++;
                }
            }
        }
        if(s.getProsek() > (9.5 - (0.1 * duzinaSamoglasnikaUimenu))){
            return true;
        }

        return false;
    }
}
