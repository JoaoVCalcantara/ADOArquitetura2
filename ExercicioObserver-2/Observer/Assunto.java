public interface Assunto {
    public void adicionar(Observador observador);
    public void notificar();
    public void setAcao(Acao acao);
    public void remover(Observador observador);
   
} 