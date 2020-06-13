package application;

import java.util.Optional;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextInputDialog;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		//Codigo
//		int menor = obtenerNumeroMenorDeTresNumeros(5, 6, 3);
//		mostrarAlerta("Hola.. El Numero Menor De " + 5 + " " + 6 + " " + 3 + " Es: " + menor,
//				"Metodo Numero Menor De Tres", "Cabecera", AlertType.INFORMATION);
		System.out.println("Hola....");
		int opcion = Integer.parseInt(ingresarMensaje("Opcion", "Menu",
				"Ingrese 1. Para Verificar Cual Es El Numero Menor\nIngrese 2. Para Verificar Cual Es El Numero Mayor"));

		int num1 = Integer.parseInt(ingresarMensaje("1: ", "Ingreso De Datos", "Digita El Numero 1."));
		int num2 = Integer.parseInt(ingresarMensaje("2:", "Ingreso De Datos", "Digita El Numero 2."));
		int num3 = Integer.parseInt(ingresarMensaje("3:", "Ingreso De Datos", "Digita El Numero 3."));
		int menor = ejecutarOpcion(opcion, num1, num2, num3);
		int mayor = ejecutarOpcion(opcion, num1, num2, num3);
		if (opcion == 1) {
			mostrarAlerta(menor + "", "Resultado", "El Numero Menor Es: ", AlertType.INFORMATION);
		} else if (opcion == 2) {
			mostrarAlerta(mayor + "", "Resultado", "El Numero Mayor Es: ", AlertType.INFORMATION);
			// 1. ingresar la opcion con el metodo ingresar mensaje
			// 2. ingresar los datos
			// 3.llamar el metodo ejecutar opcion.
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * M�todo que permite obtener cadenas de texto en pantalla
	 * 
	 * @param mensaje  etiqueta referente al campo de texto a ingresar
	 * @param titulo   del objeto
	 * @param cabecera del objeto
	 * @return un String con la informaci�n ingresada en el objeto
	 */
	public static String ingresarMensaje(String mensaje, String titulo, String cabecera) {

		TextInputDialog dialogo = new TextInputDialog();
		dialogo.setTitle(titulo);
		dialogo.setContentText(mensaje);
		dialogo.setHeaderText(cabecera);

		Optional<String> resultado = dialogo.showAndWait();
		String mensajeIngresado = "";
		if (resultado.isPresent()) {
			mensajeIngresado = resultado.get();
		}
		return mensajeIngresado;
	}

	/**
	 * M�todo que permite mostrar una alerta en pantalla
	 * 
	 * @param mensaje  a mostrar
	 * @param titulo   del objeto
	 * @param cabecera del objeto
	 * @param tipo     para un icono del objeto
	 */
	public static void mostrarAlerta(String mensaje, String titulo, String cabecera, AlertType tipo) {
		Alert alerta = new Alert(tipo);
		alerta.setTitle(titulo);
		alerta.setContentText(mensaje);
		alerta.setHeaderText(cabecera);
		alerta.showAndWait();
	}
	/**
	 * Falta la documentació: Ya la Hice
	 * 
	 * 
	 */
	public static int ejecutarOpcion(int opc, int num1, int num2, int num3) {
		int numSalida = 0;

		switch (opc) {

		case 1:
			numSalida = obtenerNumeroMenorDeTresNumeros(num1, num2, num3);
			break;

		case 2:
			numSalida = obtenerNumeroMayorDeTresNumeros(num1, num2, num3);
			break;
		}
		return numSalida;
	}

	/**
	 * El Metodo obtiene 3 numeros por parametro y verifica cual es el menor de
	 * 3nums ingresados.
	 * 
	 * @param num1 entero que ingresa por parametro para validar numero menor de 3
	 * @param num2 entero que ingresa por parametro para validar numero menor de 3
	 * @param num3 entero que ingresa por parametro para validar numero menor de 3
	 * @return el numero menor de 3
	 */
	public static int obtenerNumeroMenorDeTresNumeros(int num1, int num2, int num3) {
		int numMenor = 0;
		if (num1 < num2 && num1 < num3) {
			numMenor = num1;
		} else if (num2 < num3 && num2 < num1) {
			numMenor = num2;
		} else {
			numMenor = num3;
		}
		return numMenor;
	}

	public static int obtenerNumeroMayorDeTresNumeros(int num1, int num2, int num3) {
		int numMayor = 0;
		if (num1 > num2 && num1 > num3) {
			numMayor = num1;
		} else if (num2 > num3 && num2 > num1) {
			numMayor = num2;
		} else {
			numMayor = num3;
		}
		return numMayor;
	}
}

