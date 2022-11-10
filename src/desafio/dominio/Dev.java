package desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Dev {
    private String nome;
    private Set<Conteudo> counteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> counteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.counteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.counteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.counteudosConcluidos.add(conteudo.get());
            this.counteudosInscritos.remove(conteudo.get());
        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        return this.counteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getCounteudosInscritos() {
        return counteudosInscritos;
    }

    public void setCounteudosInscritos(Set<Conteudo> counteudosInscritos) {
        this.counteudosInscritos = counteudosInscritos;
    }

    public Set<Conteudo> getCounteudosConcluidos() {
        return counteudosConcluidos;
    }

    public void setCounteudosConcluidos(Set<Conteudo> counteudosConcluidos) {
        this.counteudosConcluidos = counteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(counteudosInscritos, dev.counteudosInscritos) && Objects.equals(counteudosConcluidos, dev.counteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, counteudosInscritos, counteudosConcluidos);
    }
}
