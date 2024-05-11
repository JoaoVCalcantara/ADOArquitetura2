public class NaveInimiga implements Observador {
        private String nome;   

    public NaveInimiga(String nome,Assunto assunto) {
            this.nome = nome;
            assunto.adicionar(this);
        }

    @Override
    public void atualizar(Acao acao) {
        System.out.println(nome + " - " + acao);
        
    }
    
}
