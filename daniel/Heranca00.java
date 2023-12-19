public class Heranca00 {
    public static void main(String[] args) {
        System.out.println("funfeia!");
        Cachorro cao1 = new Cachorro("Clovis","Vira-lata","Preto",2);
        System.out.println(cao1);
        Cachorro cao2 = new Cachorro ("Adelino","Vira-lata","Preto",2);
        System.out.println(cao2);
        Cachorro cao3 = new Cachorro ("Rubens","Vira-lata","Preto",2);
        System.out.println(cao3);
        Gato cat1 = new Gato ("Valdir","Puma","Preto",3);
        System.out.println(cat1);
        Cavalo pangare = new Cavalo("péDeP  ano", "pangare", "branco", 12);
        System.out.println(pangare);
    }

}

abstract class Animal {
    String nome;
    String onomatopeia; // representacao sonora emitida pelo animal
    String cor;
    Integer idade;
    String raca;

    public void fazBarulho() {
        System.out.println(this.onomatopeia);

    }

   public String toString () {  //Representa a classe atual em forma de string;//
    return
        "Nome: "+this.nome+"\n"+
        "Raça: "+this.raca+ "\n"+        
        "cor:"  +this.cor+ "\n"+
        "idade: "+this.idade+ "\n"+
        "Som: " +this.onomatopeia;
    }

}

class Cachorro extends Animal {
    Cachorro(String nome, String raca, String cor, Integer idade){ // metodo construtor, o que define o cão !
      this.onomatopeia = "*som de cachorro";
      this.nome = nome;
      this. raca = raca;
      this.cor = cor;
      this.idade = idade;
      

    }
}
class Gato extends Animal{
    Gato(String nome, String raca, String cor, Integer idade){ // metodo construtor, o que define o cão !
      this.onomatopeia = "*som de gato*";
      this.nome = nome;
      this. raca = raca;
      this.cor = cor;
      this.idade = idade;
    }

}



