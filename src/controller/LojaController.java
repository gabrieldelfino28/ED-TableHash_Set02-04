package controller;

import fateczl.Lista.model.Lista;
import model.Estrutura;

import java.io.*;

public class LojaController {

    private Lista<Estrutura>[] hashT = new Lista[4];

    public LojaController() {
        for(int i = 0; i < 4;i++) {
            hashT[i] = new Lista<>();
        }
    }

    public void readFile() throws Exception{
        File f = new File("C:\\TEMP\\loja.csv");
        if(f.isFile() && f.exists()) {
            BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            String linha = buffer.readLine();
            while (linha != null) {
                String[] dados = linha.split(";");
                Estrutura estruturaLoja = new Estrutura(Integer.parseInt(dados[0]),dados[1], dados[2]);
                hashing(estruturaLoja);
                linha = buffer.readLine();
            }
        }else {
            throw new Exception("Arquivo e/ou Diretório inválidos");
        }
    }

    public void printTable() throws Exception{
        for(int x = 0; x < hashT.length; x++) {
            System.out.print("Hash "+x+" : ");
            for (int y = 0; y < hashT[x].size(); y++) {
                System.out.print(hashT[x].get(y) + " -> ");
            }
            System.out.print("null\n");
        }
    }
    private void hashing(Estrutura aux) throws Exception{
        if (hashT[aux.andar].isEmpty()) {
            hashT[aux.andar].addFirst(aux);
        }else {
            hashT[aux.andar].addLast(aux);
        }
    }
}
