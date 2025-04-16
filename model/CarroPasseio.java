package model;

import javax.swing.JOptionPane;

public class CarroPasseio extends Veiculo {
    private String cor;
    private String modelo;

  //construtor padrao
  public CarroPasseio() {
    super(); //chama o construtor da superclasse
    this.cor = "";
    this.modelo = "";

}

  //construtor com parametros
  public CarroPasseio(int peso, int veloMax, float preco, String cor, String modelo) {
    super(peso, veloMax, preco); 
    this.cor = cor;
    this.modelo = modelo;

}

 //get
  public String getCor() {
    return cor;

}

    public String getModelo() {
        return modelo;

}

//set
public void setCor(String cor) {
    this.cor = cor;

}

public void setModelo(String modelo) {
    this.modelo = modelo;

}

//solicitar dados(usuario)
public void solicitarDados() {
    super.solicitarDados();
    this.cor = JOptionPane.showInputDialog("informe a cor:");
    this.modelo = JOptionPane.showInputDialog("informe o modelo:", cor);

}

//imprimir dados
public void imprimirDados() {
    super.imprimirDados();
    String msg = "Cor: " + this.cor + "\n" +
                 "Modelo: " + modelo + "\n";
        
    JOptionPane.showMessageDialog(null, msg);

  }
}