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
}public class TestaEscopo {

        public static void main(String[] args){
            System.out.println("testando condicionais");

            int idade = 20;
            int quantidadePessoas = 3;    
            boolean acompanhado;

            if (quantidadePessoas >= 2) {
                acompanhado = true;
            }else {
                acompanhado = false;
            }

            if (idade >=18 || acompanhado){

                System.out.println("Seja bem vindo"); 
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }

    }
}public class TestaEscopo {

        public static void main(String[] args){
            System.out.println("testando condicionais");

            int idade = 20;
            int quantidadePessoas = 3;    
            boolean acompanhado;

            if (quantidadePessoas >= 2) {
                acompanhado = true;
            }else {
                acompanhado = false;
            }

            if (idade >=18 || acompanhado){

                System.out.println("Seja bem vindo"); 
            } else {
                System.out.println("infelizmente voce nao pode entrar");
        }

    }
}
}public class TesteIR2 {

    public static void main(String[] args) {

        // De 1900.0 até 2800.0 o IR é de 7.5% e pode deduzir R$ 142
        // De 2800.01 até 3751.0 o IR é de 15% e pode deduzir R$ 350
        // De 3751.01 até 4664.00 o IR é de 22.5% e pode deduzir R$ 636

        double salario = 3300.0;

        if(salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("A sua aliquota é de 7,5%");
            System.out.println("Você pode deduzir até R$ 142");
        } else if(salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");
        }
    }
}