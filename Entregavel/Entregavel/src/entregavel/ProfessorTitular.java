

package entregavel;


public class ProfessorTitular extends Professor {
  
    String especialidadeProf;

  
   public ProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){
        super.setNomeProf(nome);
        super.setSobrenomeProf(sobrenome);
        super.setCodigoProf(codigoProfessor);
        this.especialidadeProf =especialidade;
    }
        

    //Getter e setters
    public String getEspecialidadeProf() {
        return especialidadeProf;
    }

    public void setEspecialidadeProf(String especialidadeProf) {
        this.especialidadeProf = especialidadeProf;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProfessorTitular other = (ProfessorTitular) obj;
        if ((this.especialidadeProf == null) ? (other.especialidadeProf != null) : !this.especialidadeProf.equals(other.especialidadeProf)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.especialidadeProf != null ? this.especialidadeProf.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "ProfessorTitular{" + "especialidadeProf=" + especialidadeProf + '}';
    }

    

}
