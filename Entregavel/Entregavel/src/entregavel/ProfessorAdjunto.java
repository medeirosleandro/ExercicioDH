

package entregavel;


public class ProfessorAdjunto extends Professor {

    int horasMonitoria;

    public ProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        this.nomeProf = nome;
        this.sobrenomeProf = sobrenome;
        this.codigoProf = codigoProfessor;
        this.horasMonitoria = quantidadeDeHoras;


    }

    public int getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(int horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProfessorAdjunto other = (ProfessorAdjunto) obj;
        if (this.horasMonitoria != other.horasMonitoria) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.horasMonitoria;
        return hash;
    }

    @Override
    public String toString() {
        return "ProfessorAdjunto{" + "horasMonitoria=" + horasMonitoria + '}';
    }



}
