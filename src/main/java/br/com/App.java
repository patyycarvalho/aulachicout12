package br.com;

import java.io.*;

public class App 
{
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("pessoa.dat"))) {
            // Desserializando o objeto Pessoa
            Pessoa pessoa = (Pessoa) inputStream.readObject();

            // Exibindo os detalhes da pessoa no console
            System.out.println("Detalhes da pessoa:");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}