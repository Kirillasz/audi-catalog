package hu.nye.progkor.audicatalog.data.model;

import java.util.Objects;

public class Audi {
    private Long Id;
    private Type tipus;
    private int evjarat;
    private String üzemanyag;
    private String motor;
    private int LE;
    private String szín;


    public Audi(Long id, Type tipus, int evjarat, String üzemanyag, String motor, int LE, String szín) {
        Id = id;
        this.tipus = tipus;
        this.evjarat = evjarat;
        this.üzemanyag = üzemanyag;
        this.motor = motor;
        this.LE = LE;
        this.szín = szín;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Type getTipus() {
        return tipus;
    }

    public void setTipus(Type tipus) {
        this.tipus = tipus;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }

    public String getÜzemanyag() {
        return üzemanyag;
    }

    public void setÜzemanyag(String üzemanyag) {
        this.üzemanyag = üzemanyag;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getLE() {
        return LE;
    }

    public void setLE(int LE) {
        this.LE = LE;
    }

    public String getSzín() {
        return szín;
    }

    public void setSzín(String szín) {
        this.szín = szín;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Audi audi = (Audi) o;

        if (evjarat != audi.evjarat) return false;
        if (LE != audi.LE) return false;
        if (!Objects.equals(Id, audi.Id)) return false;
        if (tipus != audi.tipus) return false;
        if (!Objects.equals(üzemanyag, audi.üzemanyag)) return false;
        if (!Objects.equals(motor, audi.motor)) return false;
        return Objects.equals(szín, audi.szín);
    }

    @Override
    public int hashCode() {
        int result = Id != null ? Id.hashCode() : 0;
        result = 31 * result + (tipus != null ? tipus.hashCode() : 0);
        result = 31 * result + evjarat;
        result = 31 * result + (üzemanyag != null ? üzemanyag.hashCode() : 0);
        result = 31 * result + (motor != null ? motor.hashCode() : 0);
        result = 31 * result + LE;
        result = 31 * result + (szín != null ? szín.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "Id=" + Id +
                ", tipus=" + tipus +
                ", evjarat=" + evjarat +
                ", üzemanyag='" + üzemanyag + '\'' +
                ", motor='" + motor + '\'' +
                ", LE=" + LE +
                ", szín='" + szín + '\'' +
                '}';
    }
}
