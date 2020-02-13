package pl.polami.wewportal.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="HT_REJNA")
public class Goods {
    @Id
    @Column(name = "INDEKS")
    private int id;
    @Column(name = "NAZPOT", insertable = false, updatable = false)
    private String skrot;
    @Column(name = "NAZDOP")
    private String nazwa;
    @Column(name = "JM")
    private String jm;
    @Column(name = "KOD_TOW")
    private String ean;
    @Column(name = "FD_NR_KAT")
    private String skrot3;
    @Column(name = "ILE_MAM")
    private int ilosc;
    @Column(name = "ILE_ZBIOR")
    private int zbiorczy;
    @Column(name = "ZAMOWIENIA")
    private int zamow;
    @Column(name = "MIEJSCA_MA")
    private String miejsce;

    public int getId() {
        return id;
    }

    public String getSkrot() {
        return skrot;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getJm() {
        return jm;
    }

    public String getEan() {
        return ean;
    }

    public String getSkrot3() {
        return skrot3;
    }

    public int getIlosc() {
        return ilosc;
    }

    public int getZbiorczy() {
        return zbiorczy;
    }

    public int getZamow() {
        return zamow;
    }

    public String getMiejsce() {
        return miejsce;
    }
}
