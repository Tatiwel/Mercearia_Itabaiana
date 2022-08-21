package controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainFrame {

    @FXML
    private Button btCadastrarCategoria;

    @FXML
    private Button btCadastrarProduto;

    @FXML
    protected void clickCcategoria(ActionEvent event) {
        System.out.println("Cadastrar Categoria");

        //trocar a tela
        App.changeScreen("categoria");
    }

    @FXML
    protected void clickCproduto(ActionEvent event) {

    }

}
