/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amortizacion;

/**
 *
 * @author Axel Garcia
 */
public interface AmorConta {
    String [][]M={{"5040"," (680) ","Amortizacion del Inmovilizado Intangible","      a ","Amortizacion Acumulada de Desarrollo\t\t\t","(2801)"," 2160"},
        {"     ","      ","\t\t\t\t\t    ","     a ","Amortizacion Acumulada Propiedad Industrial\t\t","(2803)"," 2880"},
        {"1602"," (681)"," Amortizacion del Inmovilizado Material   ","     a ","Amortizacion Acumulada Otras Instalaciones\t\t","(2815)"," 1032"},
        {"     ","      ","\t\t\t\t\t    ","     a ","Amortizacion Acumulada Otro Inmobilizado Material\t","(2819)"," 570"},
        {"6600"," (682)"," Amortizacion de las Inversiones Inmobiliarias"," a ","Amortizacion Acumulada Inversiones Inmobiliarias\t","(282) "," 6600"}};
    
    public void CalcAdqui(double amort,String cuenta);
    
}
