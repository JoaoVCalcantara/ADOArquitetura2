import java.util.ArrayList;
import java.util.List;

public class Aluno{
    private String nome;
    private double p1;
    private double p2;
    private double media;
    private List<Observer> observers = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void addObservador(Observer observer) {
        observers.add(observer);
    }

    public void setP1(double p1) {
        this.p1 = p1;
        calcularMedia();
        notifyObservers(p1);
    }

    public void setP2(double p2) {
        this.p2 = p2;
        calcularMedia();
        notifyObservers(p2);
    }

    private void calcularMedia() {
        this.media = (p1 + p2) / 2;
    }

    private void notifyObservers(double nota) {
        for (Observer observer : observers) {
            observer.update(nome, nota);
        }
    }
}