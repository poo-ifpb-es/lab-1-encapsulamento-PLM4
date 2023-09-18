class Circulo{
    float raio;
    float area;
    float circunferencia;
    float PI = 3.14159f;

    public Circulo(float raio){
        this.raio = raio;
    } 

    public float getRaio(){
        return this.raio;
    }

     public void setRaio(float novoRaio){
        this.raio = novoRaio;
    }

    public float getArea(){
        float calculoArea = this.PI * (this.raio * this.raio);
        return calculoArea;
    }
    public float getCircunferencia(){
        float calculoCircunferencia = 2f * this.PI * this.raio;
        return calculoCircunferencia;
    }
    
}