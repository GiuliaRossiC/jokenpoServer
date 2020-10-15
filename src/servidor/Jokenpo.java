package servidor;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Scanner;

public class Jokenpo implements InterJokenpo{
    
     public Jokenpo() throws RemoteException{
        super();
        System.out.println("Novo Servidor Jokenpo disponível.");
    }

    String jogadas[] = {"pedra", "papel", "tesoura"};

//    public static void main(String[] args) {
//        Scanner read = new Scanner(System.in);
//        Jokenpo jokenpo = new Jokenpo();
//
//        System.out.println("Nome Jogador 1");
//        String player1 = read.nextLine();
//        
//        System.out.println("=========================== /// ============================");
//        System.out.println("=========================== /// ============================");
//
//        System.out.println("Nome jogador 2");
//        String player2 = read.nextLine();
//                
//        System.out.println("Faça sua jogada " + player1 + " Pedra | Papel | Tesoura");
//        String jogadaPlayer1 = read.nextLine();
//        
//        System.out.println("=========================== /// ============================");
//        System.out.println("=========================== /// ============================");
//        System.out.println("=========================== /// ============================");
//        
//        System.out.println("Faça sua jogada " + player2 + " Pedra | Papel | Tesoura");
//        String jogadaPlayer2 = read.nextLine();
//        
//        while (!jokenpo.validarJogada(jogadaPlayer1) || !jokenpo.validarJogada(jogadaPlayer2)) {
//            System.out.println("Jogada Invalida por favor faça novamente");
//            
//            System.out.println("Faça sua jogada novamente " + player1 + " Pedra | Papel | Tesoura");
//            jogadaPlayer1 = read.nextLine();
//            
//            System.out.println("Faça sua jogada novamente " +  player2 + "Pedra | Papel | Tesoura");
//            jogadaPlayer2 = read.nextLine();
//        }
//        
//        String vencedor = jokenpo.retornarVencedor(player1, player2, jogadaPlayer1, jogadaPlayer2);
//        
//        if (!vencedor.equals("empate")) {
//            System.out.println("Parabéns " + vencedor + " você ganhou o jogo");
//        } else {
//            System.out.println("Deu empate !!");
//        }
//    }
    
    public boolean validarJogada(String jogada) {
        boolean contains = Arrays.asList(jogadas).contains(jogada.toLowerCase());
        return contains;
    }
    
    public String retornarVencedor (String player1, String player2, String jogadaPlayer1, String jogadaPlayer2) {
        String vencedor = "empate";
       
        if (!jogadaPlayer1.toLowerCase().equals(jogadaPlayer2.toLowerCase())) { 
            if (jogadaPlayer1.toLowerCase().equals("pedra") && jogadaPlayer2.toLowerCase().equals("tesoura")) {
                vencedor = player1;
            } else if (jogadaPlayer1.toLowerCase().equals("tesoura") && jogadaPlayer2.toLowerCase().equals("papel")) {
                vencedor = player1;
            } else if (jogadaPlayer1.toLowerCase().equals("papel") && jogadaPlayer2.toLowerCase().equals("pedra")) {
                vencedor = player1;
            } else {
                vencedor = player2;
            }
        }
        
        return vencedor;
    }
    
}


//public class Matematica implements InterMath {
//    
//    public Matematica() throws RemoteException{
//        super();
//        System.out.println("Novo Servidor Math disponível.");
//    }
//    
//    @Override
//    public double soma(double a, double b) throws RemoteException{
//        System.out.println("Calculei " + a + "+" +b);
//        return a + b;
//    }
//    
//    @Override
//    public double subtracao(double a, double b) throws RemoteException{
//        System.out.println("Calculei" + a + "-" + b);
//        return a - b;
//    }
//    
//    @Override
//    public double multiplicacao(int a, int b) throws RemoteException{
//        System.out.println("Calculei" + a + "*" + b);
//        return a * b;
//    }
//    
//    @Override
//    public double divisao(int a, int b) throws RemoteException{
//        System.out.println("Calculei" + a + "/" + b);
//        return a / b;
//    }
    