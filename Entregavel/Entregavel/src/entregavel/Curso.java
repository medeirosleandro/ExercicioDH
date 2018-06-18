
package entregavel;

import java.util.ArrayList;
import java.util.List;


public class Curso {

   String nomeCurso;
   int codigoCurso;
   Professor professorTitular;
   Professor professorAdjunto;
   List<Aluno> aluno;
   int quantidadeAlunos;
      

   

   //CONSTRUTOR 1

  


   //CONSTRUTOR 2 (Digital Manager)

   public Curso (String nome, int codigoCurso, int quantidadeMaximaDeAlunos){
       this.nomeCurso = nome;
       this.codigoCurso = codigoCurso;
       this.quantidadeAlunos = quantidadeMaximaDeAlunos;
       this.aluno = new ArrayList<Aluno>();


   }

  

    //METODO PARA VERIFICAR LOTAÇÃO DA SALA
    
    public boolean adicionarUmAluno(Aluno umAluno){
        
        if(aluno.size() < this.quantidadeAlunos){
            aluno.add(umAluno);
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
    
    //METODO PARA EXCLUIR ALUNO
    //is empty verifica se a lista esta vazia
    
    public void excluirAluno(Aluno umAluno){
        if(!aluno.isEmpty()){

      aluno.remove(umAluno);

        }else{

            System.out.println(" A LISTA ESTA VAZIA!!!!");
        }
        
            
    }

    //GETTERS e SETTERS

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Professor getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(Professor professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Professor getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(Professor professorTitular) {
        this.professorTitular = professorTitular;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Curso other = (Curso) obj;
        if ((this.nomeCurso == null) ? (other.nomeCurso != null) : !this.nomeCurso.equals(other.nomeCurso)) {
            return false;
        }
        if (this.codigoCurso != other.codigoCurso) {
            return false;
        }
        if (this.professorTitular != other.professorTitular && (this.professorTitular == null || !this.professorTitular.equals(other.professorTitular))) {
            return false;
        }
        if (this.professorAdjunto != other.professorAdjunto && (this.professorAdjunto == null || !this.professorAdjunto.equals(other.professorAdjunto))) {
            return false;
        }
        if (this.aluno != other.aluno && (this.aluno == null || !this.aluno.equals(other.aluno))) {
            return false;
        }
        if (this.quantidadeAlunos != other.quantidadeAlunos) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.nomeCurso != null ? this.nomeCurso.hashCode() : 0);
        hash = 41 * hash + this.codigoCurso;
        hash = 41 * hash + (this.professorTitular != null ? this.professorTitular.hashCode() : 0);
        hash = 41 * hash + (this.professorAdjunto != null ? this.professorAdjunto.hashCode() : 0);
        hash = 41 * hash + (this.aluno != null ? this.aluno.hashCode() : 0);
        hash = 41 * hash + this.quantidadeAlunos;
        return hash;
    }

    @Override
    public String toString() {
        return "Curso{" + "Curso = " + nomeCurso +'}';
    }




}
