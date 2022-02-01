public class Carro {
    private String matricula;
    private int VelocidadeAtual =0;
    private int VelocidadeMaxima=200;
    Condutor Condutor = new Condutor();

    public Carro() {

    public int getVelocidadeAtual() {
        return VelocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        VelocidadeAtual = velocidadeAtual;
    }
    public int getVelocidadeMaxima() {
        return VelocidadeMaxima;
    }

    public void ligar () {
        System.out.println("VRUUUmmm");
    }
    public void desligar () {
        System.out.println("MMMMmmm");
    }
    public void acelerar () {
        int x=0;
        x=((getVelocidadeAtual+10)+(getdestreza*0.1))
        setVelocidadeAtual(x);
        if (getVelocidadeAtual > getVelocidadeMaxima)
            setVelocidadeAtual=(getVelocidadeMaxima);
    }
    public void travar (int intensidadeTravagem) {
        if (intensidadeTravagem > VelocidadeMaxima) {
            intensidadeTravagem = VelocidadeMaxima;
        }else if (intensidadeTravagem < 0) {
            intensidadeTravagem = 0;
        }
        setVelocidadeAtual(VelocidadeAtual - intensidadeTravagem);
        if (VelocidadeAtual > VelocidadeMaxima) {
            setVelocidadeAtual(VelocidadeMaxima);
        }else if (VelocidadeAtual < 0){
            setVelocidadeAtual(0);
    }




}