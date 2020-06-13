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

	}

}
