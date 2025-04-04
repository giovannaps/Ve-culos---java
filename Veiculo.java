

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    //getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }
    //setters

public void setMarca(String marca){
    this.marca = marca;
}
public void setModelo(String modelo){
    this.modelo = modelo;
}

public void setAno(int ano){
    this.ano = ano;
}

//função com informações 
    public void informacoesVeiculo(){
        System.out.println("O veículo com a marca: " + getMarca());
        System.out.println("O veículo com o modelo: " + getModelo());
        System.out.println("O veículo com o ano: " + getAno());
    }
}
