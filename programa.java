public class programa {
    
    public static void main(string[] args){
         system.out.println("ola mundo");
    }
}
public class TestaCondicional {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;

        if (idade >= 18) {

            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");
        } else {
            if (quantidadePessoas >= 2) {
                System.out.println("voce nao tem 18, mas pode entrar, pois está acompanhado");
            } else {

                System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }
}
public class TestaCondicional2 {

        public static void main(String[] args){
            System.out.println("testando condicionais");

            int idade = 16;
            int quantidadePessoas = 3;
            boolean acompanhado = quantidadePessoas >= 2;

            if (idade >=18 && acompanhado){

                System.out.println("Seja bem vindo"); 
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }

    }
}