package design_patterns.builder;

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

        // Atributo(s) Obrigatório(s)
        private final String nome;

        public Builder(String nome) {
            this.nome = nome;
        }

        // Atributo(s) Opcional(is)
        private String raca;
        private int cpf;
        private LocalDate dataDeNascimento;

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

        /*
         * Esse método é utilizado caso:
         * - Você não queira deixar o construtor público
         * - Deixar o construtor mais seguro, já que só poderá ser criado à partir de um Builder
         * - Não precisar escrever todos os parâmetros na ordem correta na criação de Pessoa
         * 
         * OBS: Lembre de deixar o construtor padrão privado.
         */
        
        public Pessoa buildStrict() {
            return new Pessoa(this);
        }

    }

    private Pessoa(Builder builder) {
        nome = builder.nome;
        dataDeNascimento = builder.dataDeNascimento;
        raca = builder.raca;
        cpf = builder.cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", raca=" + raca + ", cpf=" + cpf + ", dataDeNascimento=" + dataDeNascimento
                + "]";
    }
}
