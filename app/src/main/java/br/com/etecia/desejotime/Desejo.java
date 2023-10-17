package br.com.etecia.desejotime;

public class Desejo {
    private int ID;
    private String Nome, Time;
    private int Classficao;
    private String Motivo ;

    public Desejo() {
    }

    public Desejo(int ID, String Nome, String Time, int Classficao, String Motivo) {
        this.ID = ID;
        this.Nome = Nome;
        this.Time = Time;
        this.Classficao = Classficao;
        this.Motivo = Motivo;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public int getClassficao() {
        return Classficao;
    }

    public void setClassficao(int Classificao) {
        this.Classficao = Classificao;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo (String Motivo) {
        this.Motivo = Motivo;
    }
}
