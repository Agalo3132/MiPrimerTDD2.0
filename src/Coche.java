package src;

public class Coche {
    public int velocidad;

    public void acelerar_AlvaroSerrano(int aceleracion) {
        velocidad += aceleracion;
    }
    
    public void decelerar_Alvaro_Serrano(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad < 0) velocidad = 0;
    }
    
}
