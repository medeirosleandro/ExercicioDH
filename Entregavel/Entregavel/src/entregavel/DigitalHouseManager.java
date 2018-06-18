

package entregavel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DigitalHouseManager {

    List <Aluno> aluno;
    List <Professor> professor;
    List <Curso> curso;
    List <Matricula> matricula;

    Date data = new Date();

    public DigitalHouseManager() {
        this.aluno = new ArrayList<Aluno>();
        this.professor = new ArrayList<Professor>();
        this.curso = new ArrayList<Curso>();
        this.matricula = new ArrayList<Matricula>();
    }

    


    //METODOS ADICIONAIS

    //MATRICULA ALUNO

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno){

        Aluno aluno1 = new Aluno(nome,sobrenome,codigoAluno);
        this.aluno.add(aluno1);
        System.out.println("Aluno Matriculado: " + aluno1.getNomeAluno()+" "+aluno1.getSobrenomeAluno());

    
    }

    //REGISTRAR CURSO

        public void registrarCurso(String nome, int codigoCurso, int quantidadeMaximaDeAlunos){

        Curso curso1 = new Curso(nome,codigoCurso,quantidadeMaximaDeAlunos);
        this.curso.add(curso1);
        System.out.println("Curso Registrado: "+ curso1.getNomeCurso());
        

           
   }

    //EXCLUIR CURSO

    public void excluirCurso(Integer codigoCurso){
        
        if(curso.isEmpty()){
            
            System.out.println("A LISTA JA ESTA VAZIA!!!");
            
            
        }else{
            
            for(int i=0;i<curso.size();i++){
                if(this.curso.get(i).getCodigoCurso()== codigoCurso){
                    System.out.println("Curso Removido "+this.curso.get(i).getNomeCurso());
                    this.curso.remove(this.curso.get(i));
                    
                }
            }
        }
    }

    //REGISTRAR PROFESSOR ADJUNTO

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){

        ProfessorAdjunto professorAdj = new ProfessorAdjunto(nome, sobrenome,codigoProfessor,quantidadeDeHoras);
        this.professor.add(professorAdj);
        System.out.println("Professor Adjunto inserido: "+ professorAdj.getNomeProf()+" "+professorAdj.getSobrenomeProf());
        
    }

    //REGISTRAR PROFESSOR TITULAR

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){

        ProfessorTitular professorTit = new ProfessorTitular(nome,sobrenome,codigoProfessor,especialidade);
        this.professor.add(professorTit);
         System.out.println("Professor Titular inserido: "+ professorTit.getNomeProf()+" "+professorTit.getSobrenomeProf());
        


    }


   //EXCLUIR PROFESSOR

    public void excluirProfessor(Integer codigoProfessor){
      
     if(professor.isEmpty()){
         System.out.println("A LISTA DE JA ESTA VAZIA");
         System.out.println("");

     }else{
        for(int i = 0;i<professor.size();i++){
            if(this.professor.get(i).getCodigoProf()==codigoProfessor){

                System.out.println("Professor Removido "+this.professor.get(i).getNomeProf()+" "+this.professor.get(i).getSobrenomeProf());
                this.professor.remove(this.professor.get(i));
                System.out.println("");

          }
        }
      }
   }

  

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){

        for(int i=0; i <curso.size();i++){
            if(curso.get(i).getCodigoCurso()==codigoCurso){
                for(int j=0; j < aluno.size(); j++){
                    if(aluno.get(j).getCodigoAluno()==codigoAluno){
                      if(curso.get(i).adicionarUmAluno(aluno.get(j))) {
                        Matricula novaMatricula = new Matricula(aluno.get(j),curso.get(i),new Date());
                        matricula.add(novaMatricula);
                          System.out.println("Matricula Realizada: "+aluno.get(j).toString()+" no "+curso.get(i).getNomeCurso()+" Data "+novaMatricula.getDate());
                          System.out.println("");

                       }else{
                          System.out.println("Matricula não realizada!!!");
                          
                       }

                    }

                }

            }

        }

   }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        for(int i=0; i <curso.size();i++){
            if(curso.get(i).getCodigoCurso() == codigoCurso){
                for(int j = 0; j < professor.size(); j++){
                    if(professor.get(j).getCodigoProf() == codigoProfessorTitular){
                        if(professor.get(j) instanceof ProfessorTitular){
                           curso.get(i).setProfessorTitular(professor.get(j));
                            System.out.println("Professor Titular alocado: "+professor.get(j).getNomeProf()+" no curso "+curso.get(i));
                        }
                    }
                }
                for(int j = 0; j < professor.size(); j++){
                    if(professor.get(j).getCodigoProf() == codigoProfessorAdjunto){
                        if(professor.get(j).getCodigoProf() == codigoProfessorAdjunto){
                            curso.get(i).setProfessorAdjunto(professor.get(j));
                            System.out.println("Professor Adjunto alocado: "+professor.get(j).getNomeProf()+" no curso "+curso.get(i));

                        }
                    }
                }
            }
        }
    }
}


