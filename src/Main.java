import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ArrayList<String> cursos = new ArrayList<String>();
        ArrayList<String> aluno = new ArrayList<String>();
        ArrayList<String> alunosMatriculados = new ArrayList<String>();
        Scanner ler = new Scanner(System.in);
        int loop = 1;
        int escolha = 0;
        int continuar = 1;
        while (loop == 1){
            continuar = 1;
            System.out.println("1 - Cadastre o aluno\n" +
                    "2 - Cadastre o curso\n" +
                    "3 - Escolha um curso para o aluno\n" +
                    "4 - Visualize os cursos\n" +
                    "5 - Finalizar o programa\n");
            escolha = ler.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Cadastre o aluno");
                    String nomeAluno;
                    while (continuar == 1) {
                        System.out.println("Digite o nome do aluno");
                        nomeAluno = ler.next();
                        aluno.add(nomeAluno);
                        System.out.println("Deseja cadastrar mais alunos?\n" +
                                "1 - Sim\n" +
                                "2 - Não\n");
                        continuar = ler.nextInt();
                        if (continuar == 2) {
                            System.out.println("Os alunos cadastrados foram:\n");
                            for (int i = 0; i < aluno.size(); i++) {
                                System.out.println(aluno.get(i));
                            }
                            break;
                        }
                    }
                    loop = 1;
                    break;
                case 2:
                    System.out.println("Cadastre um curso");
                    String nomeCurso;
                    while (continuar == 1) {
                        System.out.println("Digite o nome do curso");
                        nomeCurso = ler.next();
                        cursos.add(nomeCurso);
                        System.out.println("Deseja cadastrar mais cursos?\n" +
                                "1 - Sim\n" +
                                "2 - Não\n");
                        continuar = ler.nextInt();
                        if (continuar == 2) {
                            System.out.println("Os cursos cadastrados foram:\n");
                            for (int i = 0; i < cursos.size(); i++) {
                                System.out.println(cursos.get(i));
                            }
                            break;
                        }
                    }
                    loop = 1;
                    break;
                case 3:
                    System.out.println("Escolha um curso para o aluno");
                    System.out.println("Lista de alunos");
                    for (int i = 0; i < aluno.size(); i++) {
                        System.out.println((i+1)+" - "+aluno.get(i));
                    }
                    System.out.println("Lista de cursos");
                    for (int i = 0; i < cursos.size(); i++) {
                        System.out.println((i+1)+" - "+cursos.get(i));
                    }
                    System.out.println("Digite o id do aluno");
                    int alunoId;
                    int cursoId;
                    alunoId = ler.nextInt()-1;
                    System.out.println("Digite o id do curso");
                    cursoId = ler.nextInt()-1;
                    System.out.println("O curso "+cursos.get(cursoId)+" foi cadastrado para o aluno "+aluno.get(alunoId));
                    alunosMatriculados.add(aluno.get(alunoId)+ "-" + cursos.get(cursoId));
                    break;
                case 4:
                    System.out.println("Visualize os cursos");
                    System.out.println(alunosMatriculados);
                    break;
                default:
                    System.exit(0);
            }
        }
        }






}
