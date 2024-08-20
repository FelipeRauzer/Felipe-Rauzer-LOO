public class Carro {
    private String Modelo;
    private String Marca;
    private int Ano;


    public Carro(String modelo, String marca, int ano) {
        this.Modelo = modelo;
        this.Marca = marca;
        this.Ano = ano;
    }

    public String getModelo(){
        return this.Modelo;
    }

    public String getMarca(){
        return this.Marca;
    }

    public int getAno(){
        return this.Ano;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setAno(int ano) {
        Ano = ano;
    }


        public void exibirInfo() {
                   System.out.println("Marca: " + Marca + " Modelo: " + Modelo + " Ano: " + Ano);
                
             }
            
    
}
