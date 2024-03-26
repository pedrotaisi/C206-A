import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        MemoriaUBS mUSB = new MemoriaUBS();
        Scanner sc = new Scanner(System.in);

        cliente.nome = sc.nextLine();
        cliente.cpf = sc.nextInt();
        int number = sc.nextInt();

        switch (number) {
            case 1:
                for (int i = 0; i < cliente.computador.length; i++) {

                    if (cliente.computador[i] == null) {

                        assert cliente.computador[i] != null;
                        cliente.computador[i].marca = "Positivo";
                        cliente.computador[i].preco = 3300f;

                        cliente.computador[i].hardwarebasico[0].nome = "Pentium Core i3";
                        cliente.computador[i].hardwarebasico[1].nome = "Memória RAM";
                        cliente.computador[i].hardwarebasico[2].nome = " HD";

                        cliente.computador[i].hardwarebasico[0].capacidade = "2200 Mhz";
                        cliente.computador[i].hardwarebasico[1].capacidade = "8 Gb";
                        cliente.computador[i].hardwarebasico[2].capacidade = "500 Gb";

                        cliente.computador[i].sistemaoperacional.nome = "Sistema Operacional Linux Ubuntu";
                        cliente.computador[i].sistemaoperacional.tipo = 32;

                        cliente.computador[i].addMemoriaUSB(mUSB,number);

                        break;
                    }
                }
                break;

            case 2:
                for (int i = 0; i < cliente.computador.length; i++) {

                    if (cliente.computador[i] == null) {

                        assert cliente.computador[i] != null;
                        cliente.computador[i].marca = "Acer";
                        cliente.computador[i].preco = 8800f;

                        cliente.computador[i].hardwarebasico[0].nome = "Pentium Core i5 ";
                        cliente.computador[i].hardwarebasico[1].nome = " Memória RAM";
                        cliente.computador[i].hardwarebasico[2].nome = " HD";

                        cliente.computador[i].hardwarebasico[0].capacidade = "3370 Mhz";
                        cliente.computador[i].hardwarebasico[1].capacidade = "16 Gb";
                        cliente.computador[i].hardwarebasico[2].capacidade = " 1 Tb";

                        cliente.computador[i].sistemaoperacional.nome = "Sistema Operacional Windows 8";
                        cliente.computador[i].sistemaoperacional.tipo = 64;

                        cliente.computador[i].addMemoriaUSB(mUSB,number);
                        break;
                    }
                }

                break;

            case 3:
                for (int i = 0; i < cliente.computador.length; i++) {

                    if (cliente.computador[i] == null) {

                        assert cliente.computador[i] != null;
                        cliente.computador[i].marca = "Vaio";
                        cliente.computador[i].preco = 4800f;

                        cliente.computador[i].hardwarebasico[0].nome = "Pentium Core i7 ";
                        cliente.computador[i].hardwarebasico[1].nome = " Memória RAM";
                        cliente.computador[i].hardwarebasico[2].nome = " HD";

                        cliente.computador[i].hardwarebasico[0].capacidade = "4500 Mhz";
                        cliente.computador[i].hardwarebasico[1].capacidade = "32 Gb";
                        cliente.computador[i].hardwarebasico[2].capacidade = " 2 Tb";

                        cliente.computador[i].sistemaoperacional.nome = "Sistema Operacional Windows 10";
                        cliente.computador[i].sistemaoperacional.tipo = 64;

                        cliente.computador[i].addMemoriaUSB(mUSB,number);
                        break;
                    }
                }
                break;
            default:
        }

        System.out.println("preco total: " + cliente.calculaTotalCompra());

        for (int i = 0; i < cliente.computador.length; i++){

            if(cliente.computador[i] != null){
                cliente.computador[i].MostraPCConfigs();
            }

        }

    }
}