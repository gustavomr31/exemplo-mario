public class JogoCowboy {

         
    public static void main(String[] args) {
    System.out.println("Bem-vindo ao Jogo Cowboy!");
  }

  public static void iniciarJogo() {
    System.out.println("Iniciando o jogo...");

        Pistoleito cowboy = new Pistoleito("Cowboy", 6, "Marrom", 0, 3.0);
        cowboy.exibirStatus();
        cowboy.andar("frente");
        cowboy.pular("direita");
        cowboy.atirar();
        cowboy.pontuar(10);
        cowboy.tomarDano();
        cowboy.exibirStatus(); 
        System.out.println("Fim do jogo!");

        cowboy.exibirStatus();
    }
}

