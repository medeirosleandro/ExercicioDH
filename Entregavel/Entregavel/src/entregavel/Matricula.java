package entregavel;

import java.text.DateFormat;
import java.util.Date;

public class Matricula {

    Aluno aluno;
    Curso curso;
    Date data;
  



    //CONSTRUTOR 1

    public Matricula(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = new Date();
        data.getTime();
       

    }

    Matricula(Aluno aluno, Curso curso, Date data) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = new Date();
        data.getTime();
       
    }

    public String getDate(){
        DateFormat dataFormat = DateFormat.getDateInstance();
        String dataFormatada = dataFormat.format(data);

        return dataFormatada;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matricula other = (Matricula) obj;
        if (this.aluno != other.aluno && (this.aluno == null || !this.aluno.equals(other.aluno))) {
            return false;
        }
        if (this.curso != other.curso && (this.curso == null || !this.curso.equals(other.curso))) {
            return false;
        }
        if (this.data != other.data && (this.data == null || !this.data.equals(other.data))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.aluno != null ? this.aluno.hashCode() : 0);
        hash = 67 * hash + (this.curso != null ? this.curso.hashCode() : 0);
        hash = 67 * hash + (this.data != null ? this.data.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Matricula{" + "aluno=" + aluno + "curso=" + curso + "data=" + data + '}';
    }


   


}
