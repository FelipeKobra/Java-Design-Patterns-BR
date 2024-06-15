package designpatterns.builder;

import java.time.LocalDate;

class Pessoa {

    private String nome;
    private String raca;
    private LocalDate dataDeNascimento;
    private int cpf;

    public Pessoa(String nome, String raca, int cpf, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.raca = raca;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public static class Builder {

        String nome;
        String raca;
        int cpf;
        LocalDate dataDeNascimento;

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setRaca(String raca) {
            this.raca = raca;
            return this;
        }

        public Builder setCpf(int cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder setDataDeNascimento(LocalDate dataDeNascimento) {
            this.dataDeNascimento = dataDeNascimento;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, raca, cpf, dataDeNascimento);
        }

    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", raca=" + raca + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento
                + "]";
    }
}
