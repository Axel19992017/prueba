package amortizacion;
public class Amortizacion implements AmorConta{
    public static void main(String[] args) {
        Amortizacion a=new Amortizacion();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(AmorConta.M[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Los bienes inmovilizados de la empresa y su precio de adquisicion son:");
        a.CalcAdqui(Double.parseDouble(AmorConta.M[0][6]), "Desarrollo");
        a.CalcAdqui(Double.parseDouble(AmorConta.M[1][6]), "Propiedad Industrial");
        a.CalcAdqui(Double.parseDouble(AmorConta.M[2][6]), "Otras Instalaciones");
        a.CalcAdqui(Double.parseDouble(AmorConta.M[3][6]), "Otro Inmobilizado Material");
        a.CalcAdqui(Double.parseDouble(AmorConta.M[4][6]), "Inverciones Inmobiliarias");
    }
    public void CalcAdqui(double amort, String cuenta) {
        double pad=amort/0.12;
        
        System.out.println(cuenta+": "+pad);
    }
}
