
package entregavel;



public class Main {

  
    public static void main(String[] args) {

    DigitalHouseManager dhm = new DigitalHouseManager();

    //Registro de Cursos
    
    dhm.registrarCurso("Mobile",111,2);
    dhm.registrarCurso("FullStack",222,2);
    
    //Registro de Prof Adjuntos
    
    dhm.registrarProfessorAdjunto("Romario","Romariovisk",222,5);
    dhm.registrarProfessorAdjunto("Rivaldo","Nazario",333,9);

    //Registro de Prof Titulares

    dhm.registrarProfessorTitular("Victor","Votoriano",444,"Surfar");
    dhm.registrarProfessorTitular("Tiririca","Florentina",555,"Contar Piada");

    //Matricular Aluno
    dhm.matricularAluno("Joazinho", "Trinta",123);
    dhm.matricularAluno("Pedrinho", "Doidera",000);
    dhm.matricularAluno("Matheus", "Canseira",888);
    dhm.matricularAluno("Sara", "Va",777);

    //Alocar Professor no Curso
    //Codigo do Curso / Codido Prof Titular / Codigo Prof Adjunto
    dhm.alocarProfessores(111,444, 222);
    dhm.alocarProfessores(222,555, 333);



    //Excluir Professor
    //dhm.excluirProfessor(333);

    //Matricular aluno no Curso Mobile
    dhm.matricularAluno(123,111);
    dhm.matricularAluno(000,111);

    //Matricular aluno no CursoFullStack
    dhm.matricularAluno(888,222);
    dhm.matricularAluno(000,222);

    
  
    }

}






