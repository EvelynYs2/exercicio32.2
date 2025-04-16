package model;

import javax.swing.JOptionPane;

public class Veiculo {
    private int peso;
    private int veloMax;
    private float preco;

    //construtor de padrao
    public Veiculo() {

    this.peso = 0;
    this.veloMax = 0;
    this.preco = 0.0f;

}

//construtor com parametros
public Veiculo(int peso, int veloMax, float preco) {
    this.peso = peso;
    this.veloMax = veloMax;
    this.preco = preco;
}

//getteres
public int getPeso() {
    return peso;
    
}

public int getVeloMax() {
    return veloMax;

}

public float getPreco() {
    return preco;

}

//set

public void setPeso(int peso) {
    this.peso = peso;

}

public void setVeloMax(int veloMax) {
    this.veloMax = veloMax;

}

public void setPreco(float preco) {
    this.preco = preco;

}

//solicitar dados(usuario)
public void solicitarDados() {
    this.peso = Integer.parseInt(JOptionPane.showInputDialog("informe o peso do veiculo(kg): "));
    this.veloMax = Integer.parseInt(JOptionPane.showInputDialog("informe a velocidade máxima(km/h): "));
    this.preco = Float.parseFloat(JOptionPane.showInputDialog("Informe o preço: "));

}

public void imprimirDados() {
    String msg = "peso: " + peso + "kg\n" +
                 "Velocidade máxima: " + veloMax + " km/h\n" +
                 "Preço: R$ " + preco;
                 JOptionPane.showMessageDialog(null, msg);
}

}