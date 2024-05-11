public class Diretor implements Observer{

    @Override
    public void update(String nome, double nota) {
        System.out.println("Diretor: O aluno " + nome + " recebeu nota " + nota);
    }
}
