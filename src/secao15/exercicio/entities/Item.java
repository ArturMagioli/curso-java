package secao15.exercicio.entities;

public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    public Item() {}

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getScvFormat() {
        return this.nome + "," + String.format("%.2f", getValorTotal());
    }

    public double getValorTotal() {
        return this.preco * this.quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
            "Preco: " + this.preco + "\n" +
            "Quantidade: " + this.quantidade + "\n";
    }
}
