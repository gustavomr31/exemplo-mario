public class Pistoleito {

    String nome;
    int balas ;
    String cor;
    int pontos;
    double vidas;

    public Pistoleito(String nome, int balas, String cor, int pontos, double vidas) {
        this.nome = nome;
        this.vidas = vidas;
        this.balas = balas;
        this.cor = cor;
        this.pontos = pontos;
    }
      public void andar (String direcao){
        System.out.println("->" + this.nome + " andou para " + direcao+"!");
        }

        public void pular (String direcao){
            System.out.println("->" + this.nome + " pulou para " + direcao+"!");
        }

        public void atirar (){
            if (this.balas > 0) {
                this.balas--;
                System.out.println("BANG! " + this.nome + " atirou! Balas restantes: " + this.balas);
            } else {
                System.out.println("CLICK! " + this.nome + " não tem balas para atirar!");
            }
        }

        public void pontuar (int pontos){
            this.pontos += pontos;
            System.out.println("->" + this.nome + " ganhou " + pontos + " pontos! Total de pontos: " + this.pontos);
        }

        public void tomarDano (){
            if (this.vidas > 0.5) {
                this.vidas-= 0.5;
                System.out.println("OUCH! " + this.nome + " tomou dano! Vidas restantes: " + this.vidas);
            } else { this.vidas = 0;
                System.out.println("GAMER OVER! " + this.nome + " Foi derrotado!");
            }
        }

        public void exibirStatus (){
            System.out.println("Status de " + this.nome + ":");
            System.out.println("Vidas: " + this.vidas);
            System.out.println("Balas: " + this.balas);
            System.out.println("Pontos: " + this.pontos);
        }
    
}
