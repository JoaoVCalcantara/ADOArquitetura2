public class Coordenador implements Observer {

    @Override
    public void update(String nome, double nota) {
        System.out.println("Coordenador: O aluno " + nome + " recebeu nota " + nota);
    }
}
