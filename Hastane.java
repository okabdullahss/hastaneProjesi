package projects.hastaneDeneme;


import Projects.P08_HastaneOtomasyon_.Doktor;
import Projects.P08_HastaneOtomasyon_.Durum;
import Projects.P08_HastaneOtomasyon_.Hasta;
import Projects.P08_HastaneOtomasyon_.VeriBankasi;

public class Hastane extends VeriBankasi {

    private Doktor doktor;
    private Hasta hasta;
    private Durum durum;

    public Durum getDurum() {
        return durum;


    public void setDurum(Durum durum) {
        this.durum = durum;
    }

    public Doktor getDoktor() {
        return doktor;
    }

    public void setDoktor(Doktor doktor) {
        this.doktor = doktor;
    }

    public Hasta getHasta() {
        return hasta;
    }

    public void setHasta(Hasta hasta) {
        HastaAdiSoyadi.add(hasta.getHastaAdiSoyadi());
        HastaId.add(hasta.getHastaId());
        this.hasta = hasta;
    }


}