
public class Computador {

    String marca;
    float preco;

    SistemaOperacional sistemaoperacional;
    HardwareBasico[] hardwarebasico;

    public Computador(){
        HardwareBasico[] hardwareBasicos = new HardwareBasico[3];
    }

    MemoriaUBS memoriausb;

    public void MostraPCConfigs(){

        System.out.println("Sistem operacional: " + sistemaoperacional.nome + " " + sistemaoperacional.tipo);

        for (HardwareBasico hardwareBasico : hardwarebasico){

            if(hardwareBasico != null){
                System.out.println("hardwares presentes");
                System.out.println("Nome: " + hardwareBasico.nome);
                System.out.println("Capacidade: " + hardwareBasico.capacidade);
            }
        }
        System.out.println("Memoria UBS");
        System.out.println("Nome: " + memoriausb.nome);
        System.out.println("Capacidade: " + memoriausb.capacidade);

    }

    public void addMemoriaUSB(MemoriaUBS mUSB, int aux){

        switch (aux){
            case 1:
                mUSB.nome = "Pen-drive ";
                mUSB.capacidade = 16;
                break;
            case 2:
                mUSB.nome = "Pen-drive ";
                mUSB.capacidade = 32;
                break;
            case 3:
                mUSB.nome = "HD Externo ";
                mUSB.capacidade = 64;
                break;
            default:

        }

    }
}
