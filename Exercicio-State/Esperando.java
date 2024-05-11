public class Esperando implements Estados {
    private String estadoAtual = "esperando";
    private Acao acao;

    
    public Esperando(Acao acao) {
        this.acao = acao;
    }
    @Override
    public void Correr() {
        acao.setEstado(new Correr(acao));
        
    }
    @Override
    public void Esperando() {
        System.out.println("ele ja esta esperando");
        
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
