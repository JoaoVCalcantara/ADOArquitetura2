public class Pulando implements Estados {
    private String estadoAtual = "Pulando";
    private Acao acao;

    
    public Pulando(Acao acao) {
        this.acao = acao;
    }

    @Override
    public void Correr() {
        acao.setEstado(new Correr(acao));
        
    }
    @Override
    public void Esperando() {
        acao.setEstado(new Esperando(acao));
        
    }
    @Override
    public void Pulando() {
       System.out.println("ele ja esta pulando");
        
    }
    @Override
    public void Abaixando() {
        acao.setEstado(new Abaixando(acao));
        
    }
}
