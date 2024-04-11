package Set;

import java.util.Objects;

public class RegistroVotacao {
    private String nomeCandidato;
    private int qntdVotos;

    public RegistroVotacao(String nomeCandidato, int qntdVotos) {
        this.nomeCandidato = nomeCandidato;
        this.qntdVotos = qntdVotos;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public int getQntdVotos() {
        return qntdVotos;
    }

    public void setQntdVotos(int qntdVotos) {
        this.qntdVotos = qntdVotos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistroVotacao that = (RegistroVotacao) o;
        return qntdVotos == that.qntdVotos && Objects.equals(nomeCandidato, that.nomeCandidato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCandidato, qntdVotos);
    }
}
