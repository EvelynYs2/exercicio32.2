package model;

import javax.swing.JOptionPane;

public class Caminhao extends Veiculo {
    private int toneladas;
    private int alturaMax;
    private int comprimento;

// construtor padrao
public Caminhao() {
    super();
    this.toneladas = 0;
    this.alturaMax = 0;
    this.comprimento = 0;
}

//construtor com parametros
public Caminhao(int peso, int veloMax, float preco, int toneladas, int alturaMax, int comprimento) {
    super(peso, veloMax, preco);
    this.toneladas = toneladas;
    this.alturaMax = alturaMax;
    this.comprimento = comprimento;

}

//get
public int getToneladas() {
    return toneladas;

}

public int getAlturaMax() {
    return alturaMax;

}

public int getComprimento() {
    return comprimento;

}

//set
public void setToneladas(int toneladas) {
    this.toneladas = toneladas;

}

public void setAlturaMax(int alturaMax) {
    this.alturaMax = alturaMax;

}

public void setComprimento(int comprimento) {
    this.comprimento = comprimento;

}

//solicitar dados(usuario)
public void solicitarDados() {
    super.solicitarDados();
    this.toneladas = Integer.parseInt(JOptionPane.showInputDialog("digite as toneladas: "));
    this.alturaMax = Integer.parseInt(JOptionPane.showInputDialog("digite a altura maxima: "));
    this.comprimento = Integer.parseInt(JOptionPane.showInputDialog("digite o comprimento: "));

}

//imprimir dados
public void imprimirDados() {
    super.imprimirDados();
    String msg ="toneladas: " + toneladas + "toneladas\n" +
                "altura maxima: " + alturaMax + "cm\n" +
                "comprimento: " + comprimento + "cm\n";
                 JOptionPane.showMessageDialog(null, msg);
            
}
}
