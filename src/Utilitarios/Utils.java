package Utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

    static NumberFormat formatavalores = new DecimalFormat("R$ #,##0.00");

    public static String doubleToString(Double valor){
        return formatavalores.format(valor);
    }
}
