public class Acao  {
    private String descricao;
    private Estados estado;

    public Acao(String descricao) {
        estado = new Esperando(this);
        this.descricao=descricao;
       }

       public Estados getEstado() {
        return estado;
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }

      public void Correr(){
        estado.Correr();
      }
      
      public void Esperar(){
        estado.Esperando();
      }
      
      public void Pular(){
       estado.Pulando();
      }
      
      public void Abaixar(){
        estado.Abaixando();
      }
}
