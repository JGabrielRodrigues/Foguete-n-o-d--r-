public class Elevador {
    public int andarAtual = 0;
    public int totalAndares = 7;
    public int capacidadeElevador;
    public int pessoasPresentes = 0;

    public void entra(int qntPessoas){
        if(this.pessoasPresentes + qntPessoas <= this.capacidadeElevador){
            this.pessoasPresentes =  this.pessoasPresentes + qntPessoas;
            System.out.println("Entraram mais " + qntPessoas + " pessoas no elevador");
            System.out.println("Atualmente tem " + this.pessoasPresentes + "/" + this.capacidadeElevador + " pessoas no elevador");
        } else {
            System.out.println("O elevador já atingiu o limite de " + this.capacidadeElevador  + " pessoas ");
        }
    }

    public void sai(int qntPessoas){
        if(qntPessoas <= this.pessoasPresentes){
            this.pessoasPresentes = this.pessoasPresentes - qntPessoas;
            System.out.println("Saaram " + qntPessoas + " pessoas do elevador");
            System.out.println("Atualmente tem " + this.pessoasPresentes + "/" + this.capacidadeElevador + " pessoas no elevador");
        } else {
            System.out.println("Nao ha nenhuma pessoa no elevador para sair");
        }
    }

    public void sobe(int andar){
        if(andar > this.andarAtual && andar < 6){
            System.out.println("subindo...");
            this.andarAtual = andar;
            System.out.println(this.andarAtual + " andar!");
        } else if(andar > 6){
            System.out.println("Nao ha como subir mais que o 5º andar");
        } else if(andar < this.andarAtual){
            System.out.println("Operaçao negada. Tente usar a funçao de descer");
        }
    }

    public void desce(int andar){
        if(andar < this.andarAtual && andar > -1){
            System.out.println("descendo...");
            this.andarAtual = andar;
            System.out.println(this.andarAtual + " andar!");
        } else if(andar < -1){
            System.out.println("Nao ha como descer mais que o subsolo");
        } else if(andar > this.andarAtual){
            System.out.println("Operaçao negada. Tente usar a funçao de subir");
        }
    }
    

    public static void main(String[] args){
        
        Elevador entrada = new Elevador();
        entrada.capacidadeElevador = 20;

        
        Elevador atrio = new Elevador();
        atrio.capacidadeElevador = 15;

        
        Elevador biblioteca = new Elevador();
        biblioteca.capacidadeElevador = 10;

        System.out.println("-- Toda a equipe 3 quer pegar o elevador da entrada juntos...");
        entrada.entra(30);

        System.out.println("-- Apenas 20 podem entrar");
        entrada.entra(20);

        System.out.println("-- Eles vao ter aula com o Gabriel no 3º andar");
        entrada.sobe(3);
        entrada.sai(20);

        System.out.println("-- O elevador da biblioteca desce para pegar 2 funcionarios");
        biblioteca.desce(-1);
        biblioteca.entra(2);

        System.out.println("-- Os 10 alunos da equipe 3 que ficaram chamaram o elevador da biblioteca");
        biblioteca.sobe(0);
        biblioteca.entra(10);

        System.out.println("-- Apenas 8 podem entrar");
        biblioteca.entra(8);
        biblioteca.sobe(3);

        System.out.println("-- Os 8 alunos saem no 3º andar");
        biblioteca.sai(8);

        System.out.println("-- Os 2 funcionarios sobem para o 5º andar");
        biblioteca.sobe(5);
        biblioteca.sai(2);

        System.out.println("-- Gabriel está no 5º andar e chama o elevador do atrio para dar aula no 3º andar");
        atrio.sobe(5);
        atrio.entra(1);
        atrio.desce(3);
        atrio.sai(1);
    }
}