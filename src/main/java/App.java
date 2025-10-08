import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        CorpoHumano corpo = new CorpoHumano();
        System.out.println("=== CRIAÇÃO DO OBJETO CORPO HUMANO ===");
        System.out.print("Digite a massa inicial (kg): ");
        corpo.setMassa(in.nextFloat());
        System.out.print("Digite o volume inicial (m³): ");
        corpo.setVolume(in.nextFloat());
        System.out.print("Digite a densidade inicial (kg/m³): ");
        corpo.setDensidade(in.nextFloat());
        System.out.print("Digite a altura inicial (m): ");
        corpo.setAltura(in.nextFloat());
        
        System.out.println("=== VALORES INICIAIS ===");
        System.out.println("Massa: "+corpo.getMassa()+"kg");
        System.out.println("Volume: "+corpo.getVolume()+"m³");
        System.out.println("Densidade: "+corpo.getDensidade()+"kg/m³");
        System.out.println("Altura: "+corpo.getAltura()+"m");
        System.out.println("IMC: "+corpo.calculoImc());
    }
}
