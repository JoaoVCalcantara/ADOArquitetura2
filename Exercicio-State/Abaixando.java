public class Abaixando implements Estados{
    private String estadoAtual = "Abaixando";
    private Acao acao;

    public Abaixando(Acao acao) {
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
        acao.setEstado(new Pulando(acao));
        
    }
    @Override
    public void Abaixando() {
        System.out.println("esta abaixado");
        
    }
    
}
