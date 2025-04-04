public class Motocicleta extends Veiculo {
   @Override

   public void informacoesVeiculo(){
    System.out.println("O veículo com a marca: " + getMarca());
    System.out.println("O veículo com o modelo: " + getModelo());
    System.out.println("O veículo com o ano: " + getAno());
}
        private String tipoDeGuidao;
    
    
        public String getTipoGuidao(){
            return tipoDeGuidao;
        }
    
        public void setTipoGuidao(String tipoDeGuidao){
            this.tipoDeGuidao = tipoDeGuidao;
        }

        public void tipo_guidao(){
            System.out.println("A motocicleta tem um guidão de tipo: " + getTipoGuidao());
        }
    
        
    
}
