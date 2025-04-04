public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Motocicleta m1 = new Motocicleta();

        c1.setAno(2000);
        c1.setMarca("chevrolet");
        c1.setModelo("algum ai ");
        c1.setNumPortas(4);

        c1.informacoesVeiculo();
        c1.num_Portas();

        System.out.println("");

        m1.setAno(2003);
        m1.setMarca("yahama");
        m1.setModelo("pao ");
        m1.setTipoGuidao("Aço");

        m1.informacoesVeiculo();
        m1.tipo_guidao();
    }
}
