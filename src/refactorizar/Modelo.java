package refactorizar;

public class Modelo {

    boolean esPrimo = false;
    int cantidadDigitos = 0;
    int contadordigitos = 0;
 
    //System.out.println("cantidad digitos deseada:");
    public Modelo() {
 
    }

    public boolean isEsPrimo() {
        return esPrimo;
    }

    public void setEsPrimo(boolean esPrimo) {
        this.esPrimo = esPrimo;
    }

    public int getCantidadDigitos() {
        return cantidadDigitos;
    }

    public void setCantidadDigitos(int cantidadDigitos) {
        this.cantidadDigitos = cantidadDigitos;
    }

    public int getContadordigitos() {
        return contadordigitos;
    }

    public void setContadordigitos(int contadordigitos) {
        this.contadordigitos = contadordigitos;
    }

}
