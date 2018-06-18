

package entregavel;


public class Aluno {

    //Atributos

    String nomeAluno;
    String sobrenomeAluno;
    int codigoAluno;

    //Construtor

    public Aluno(String nomeAluno, String sobrenomeAluno, int codigoAluno) {
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.codigoAluno = codigoAluno;
    }


    //Construtor MatricularAluno
    
    public Aluno (String nome, String sobrenome, Integer codigoAluno){
        this.nomeAluno = nome;
        this.sobrenomeAluno = sobrenome;
        this.codigoAluno = codigoAluno;
        
    }

    // Getters e setters

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getSobrenomeAluno() {
        return sobrenomeAluno;
    }

    public void setSobrenomeAluno(String sobrenomeAluno) {
        this.sobrenomeAluno = sobrenomeAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" + "Nome do Aluno= " + nomeAluno + "\n Sobrenome do Aluno=" + sobrenomeAluno + "\n Codigo do Aluno=" + codigoAluno + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if ((this.nomeAluno == null) ? (other.nomeAluno != null) : !this.nomeAluno.equals(other.nomeAluno)) {
            return false;
        }
        if ((this.sobrenomeAluno == null) ? (other.sobrenomeAluno != null) : !this.sobrenomeAluno.equals(other.sobrenomeAluno)) {
            return false;
        }
        if (this.codigoAluno != other.codigoAluno) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.nomeAluno != null ? this.nomeAluno.hashCode() : 0);
        hash = 17 * hash + (this.sobrenomeAluno != null ? this.sobrenomeAluno.hashCode() : 0);
        hash = 17 * hash + this.codigoAluno;
        return hash;
    }



}
