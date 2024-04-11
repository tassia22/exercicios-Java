package Set;

import java.util.Date;
import java.util.Objects;

public class LoginEntrada {
    private String nomeUsuario;
    private Date momento;

    public LoginEntrada(String nomeUsuario, Date momento) {
        this.nomeUsuario = nomeUsuario;
        this.momento = momento;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        LoginEntrada that = (LoginEntrada) o;
        return Objects.equals(nomeUsuario, that.nomeUsuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeUsuario);
    }
}
