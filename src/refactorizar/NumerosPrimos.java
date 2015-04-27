package refactorizar;

/**
 * Lista los numeros primos de dos cifras
 *
 */
public class NumerosPrimos {

    Modelo mod = new Modelo();

    public void calcPrimos() {
        int i;
        mod.setCantidadDigitos(Vista.entradadato());
        if (mod.getCantidadDigitos() <= 0) {
            Vista.imprimirString("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (i = 1; i <= 99999; i++) {
            int divisionEntera = i;

            int contador = 0;

            while (divisionEntera != 0) {
                divisionEntera /= 10;
                contador++;
            }
            mod.setContadordigitos(contador);

            if (mod.getContadordigitos() == mod.getCantidadDigitos()) {
                if (i < 4) {
                    mod.setEsPrimo(true);
                } else {
                    if (i % 2 == 0) {
                        mod.setEsPrimo(false);
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int limite = (i - 1) / 2;
                        if (limite % 2 == 0) {
                            limite--;
                        }

                        while (i1 <= limite) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = limite + 1;
                            }
                        }

                        if (contador1 == 1) {
                            mod.setEsPrimo(true);
                        }
                    }
                }

                if (mod.isEsPrimo() == true) {
                    Vista.imprimirInt(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        NumerosPrimos nP=new NumerosPrimos();
        nP.calcPrimos();
    }
}
