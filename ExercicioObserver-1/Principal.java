public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");
        aluno.addObservador(new Professor());
        aluno.addObservador(new Coordenador());
        aluno.addObservador(new Diretor());

        aluno.setP1(8.0);
        aluno.setP2(9.5);
    }
}
