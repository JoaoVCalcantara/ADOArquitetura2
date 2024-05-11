public class Correr implements Estados {
    private String estadoAtual = "Correr";
    private Acao acao;

    
    public Correr(Acao acao) {
        this.acao=acao;
    }
    @Override
    public void Correr() {
        System.out.println("ele ja esta correndo");
        
    }
    @Override
    public void Esperando() {
        acao.setEstado(new Esperando(acao));
        
    }
    @Override
    public void Pulando() {
        acao.setEstado(new Pulando(acao));
        
    }
    @Override
    public void Abaixando() {
        acao.setEstado(new Abaixando(acao));
        
    }
}
