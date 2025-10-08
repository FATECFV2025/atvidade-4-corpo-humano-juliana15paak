public class CorpoHumano {
    private float massa;
    private float volume;
    private float densidade;
    private float altura;
    private float imc;
    public void CorpoHumano(float massa, float volume, float densidade, float altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }
    public void setMassa(float massa){
        this.massa = massa;
    }
    public void setVolume(float volume){
        this.volume = volume;
    }
    public void setDensidade(float densidade){
        this.densidade = densidade;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getMassa(){
        return massa;
    }
    public float getVolume(){
        return volume;
    }
    public float getDensidade(){
        return densidade;
    }
    public float getAltura(){
        return altura;
    }
    public float calculoImc(){
        imc = massa/(altura*altura);
        return imc;
    }
    
}
