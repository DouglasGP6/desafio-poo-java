package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate date;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }


    public Mentoria() {
    }



    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", date=" + date +
                '}';
    }


}
