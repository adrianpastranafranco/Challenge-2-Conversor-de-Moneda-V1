package convertidor;

import javax.swing.JOptionPane;

public class Convertidor {
	public static void main(String[] args) {
		String[] lista = {"Moneda","Temperatura"};
		String[] moneda = {"Pesos a Dolar","Pesos a Euros","Pesos a Libras Esterlinas","Pesos a Yen Japones",
				"Pesos a Won sul-coreano","Dolar a Pesos","Euros a Pesos","Libras Esterlinas a Pesas",
				"Yen Japones a Pesos","Won sul-coreano a Pesos"};
		String[] temperatura = {"Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", 
				"Fahrenheit a Kelvin","Kelvin a Celsius","Kelvin a Fahrenheit"};
		double[] tasa = {0.00023,0.00020,0.00018,0.030,0.29,4419.73,5534.81,33.34,3.40 };
		String tipo = null;
		String t = null;
		double valor = 0;
		double resultado = 0;
		int continua = 0;
		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Cantidad:",0));
			tipo= (String) JOptionPane.showInputDialog(null, "Tipo de conversion:", tipo, 0, null, lista, tipo);
			switch (tipo) {
			case "Moneda":
				t = (String) JOptionPane.showInputDialog(null, "Tipo de Moneda:", t, 0, null, moneda, t);
				for(int i=0; i<moneda.length;i++) {
					if(t==moneda[i]) {
						resultado = valor * tasa[i];
					}
				}
				JOptionPane.showMessageDialog(null, valor + " " + t + " es: "+ resultado);
			break;
			case "Temperatura":
				t = (String) JOptionPane.showInputDialog(null, "Tipo de temperatura:", t, 0, null, temperatura, t);
				switch(t) {
				case "Celsius a Fahrenheit":
					resultado = valor * 9/5 + 32;
				break;
				case "Celsius a Kelvin":
					resultado = valor + 273.15;
				break;
				case "Fahrenheit a Celsius":
					resultado = (valor - 32) * 5 / 9;
				break;
				case "Fahrenheit a Kelvin":
					resultado = (valor - 32) * 5 / 9 + 273.15;
				break;
				case "Kelvin a Celsius":
					resultado = valor - 273.15;
				break;
				case "Kelvin a Fahrenheit":
					resultado = (valor - 273.15) * 9 / 5 + 32;
				break;
				}
				JOptionPane.showMessageDialog(null, valor + " " + t + " es: "+ resultado);
			break;
			
			default:
				break;
			}
			continua = JOptionPane.showConfirmDialog(null,"Desea continuar?");
		}while(JOptionPane.OK_OPTION == continua);
	}
}
