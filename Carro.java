public class Carro extends Veiculo{
    @Override
    public void informacoesVeiculo(){
        System.out.println("O veículo com a marca: " + getMarca());
        System.out.println("O veículo com o modelo: " + getModelo());
        System.out.println("O veículo com o ano: " + getAno());
    }
    private int numeroDePortas;


    public int getNumPortas(){
        return numeroDePortas;
    }

    public void setNumPortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }

    public void num_Portas(){
        System.out.println("O carro tem: " + getNumPortas() + " portas.");
    }


}