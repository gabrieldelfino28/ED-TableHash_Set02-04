package view;
/*
 * É necessário ter o arquivo loja.csv na pasta temp do Windows (C:\temp\loja.csv)
 * It is required to have the loja.csv file on the temp directory of Windows (C:\temp\loja.csv)
 */
import controller.LojaController;

public class Main {

    public static void main(String[] args) {
        LojaController l = new LojaController();
        try {
            l.readFile();
            l.printTable();
        }catch (Exception err) {
            System.err.println(err.getMessage());
        }
    }
}
