import javax.swing.JOptionPane;

public class CalculoPrecioAPP {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		String valor = JOptionPane.showInputDialog("Introduce el precio del producto");
		
		double precio = Double.parseDouble(valor);
		JOptionPane.showMessageDialog(null, "El producto sin IVA tiene un precio de " + precio + "€" + " y su precio final con IVA incluido es de " + (precio + (precio * IVA)) + "€");

	}
}
