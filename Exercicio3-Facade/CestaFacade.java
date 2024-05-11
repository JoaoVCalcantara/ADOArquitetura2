


public class CestaFacade {
    public void Facade(){
        Composite cesta=new Composite("Cesta de caf�");
      
        Component produto1=new Leaf(12.56, "caf�");
        Component produto2=new Leaf(10.26, "leite");
        Component produto3=new Leaf(6.12, "p�o de queijo");
        Component produto4=new Leaf(8.23, "bombom cereja");
        Component produto5=new Leaf(9.78, "bombom licor");
        
        Composite caixa=new Composite("Caixa de bombom");
        caixa.adicionar(produto5);
        caixa.adicionar(produto4);
        
        cesta.adicionar(produto1);
        cesta.adicionar(produto2);
        cesta.adicionar(produto3);
        cesta.adicionar(caixa);
        
        System.out.println(cesta);
        System.out.println("Total: "+cesta.getPreco());
    }

    public void CestaFacade(){
        
    }
}
