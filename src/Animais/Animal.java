package Animais;

public class Animal {

    protected int tamanho;
    protected String nome;

    public void mostrar() {
        System.out.printf("Meu nome é %s e tenho %dcm", nome, tamanho);
    }
}
