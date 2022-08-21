package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    //armazenando como estatico o Stage e as Cenas
    private static Stage stage;

    // armazenando as cenas(telas)
    private static Scene mainScene;
    private static Scene categoriaScene;
    private static Scene produtoScene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        // armazenando/inicializando o Stage
        stage = primaryStage;

        //titulo
        primaryStage.setTitle("Sistema de Gestão da Mercearia");

        // tela principal(main)
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/view/MainFrame.fxml"));
        mainScene = new Scene(fxmlMain);

        // tela de cadastro de categoria
        Parent fxmlCategoria = FXMLLoader.load(getClass().getResource("/view/CategoriaFrame.fxml"));
        categoriaScene = new Scene(fxmlCategoria);

        // inicializacao do sistema com a mainFrame
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    // manager para as trocas de telas

    public static void changeScreen(String screen) {

        switch (screen) {
            case "main":
                stage.setScene(mainScene);
                break;
            case "categoria":
                stage.setScene(categoriaScene);
                break;
            case "produto":
                stage.setScene(produtoScene);
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        launch(args);

    }

}
