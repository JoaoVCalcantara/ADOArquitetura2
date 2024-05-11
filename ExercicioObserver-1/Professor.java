public class Professor implements Observer {
    @Override
    public void update(String nome, double nota) {
        System.out.println("Professor: O aluno " + nome + " recebeu nota " + nota);
    }
}
