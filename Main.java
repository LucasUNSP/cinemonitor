class Main {
  public static void main(String[] args) {

    Filme filme = new Filme();

    filme.setTitulo("Carros 3");
    filme.setAno(2017);
    filme.setTipo("Animação");

    System.out.println("Meu filme favorito é: " + filme.getTitulo());
    System.out.println("De " + filme.getAno());
    System.out.println("Do gênero " + filme.getTipo());

  }
}