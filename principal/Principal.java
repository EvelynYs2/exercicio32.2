package principal;

import model.Veiculo;
import model.CarroPasseio;
import model.Caminhao;

public class Principal {
    public static void main(String[] args) {
        //testando veiculos
        Veiculo v = new Veiculo();
        v.solicitarDados();
        v.imprimirDados();

        //testando CarroPsseio
        CarroPasseio cp = new CarroPasseio();
        cp.solicitarDados();
        cp.imprimirDados();

        //testando Caminhao
        Caminhao cam = new Caminhao();
        cam.solicitarDados();
        cam.imprimirDados();

    }
    
}
