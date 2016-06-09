package br.com.crescer.exerciciosaula02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class MeuFileUtils {
    
    public static void main(String[] args) throws IOException{
        
        Scanner s = new Scanner(System.in);
        System.out.println("Selecione uma opção:\nx- Sair\nmk - Criar arquivo/Diretorio\nrm - Excluir arquivo\nls - Caminho do arquivo/Diretorio\nmv - Mover Arquivo");
        String opcao = s.next();
        
        
            switch (opcao.toLowerCase()){
                case "mk":
                    System.out.println("Informe o nome do Arquivo: ");
                    String nomeArquivo = s.next();

                    if(nomeArquivo.lastIndexOf(".txt") != -1){
                        File file = new File(nomeArquivo);
                        file.createNewFile();
                        System.out.print("Arquivo Criado com Sucesso\n");
                    }else{
                        File dir = new File(nomeArquivo);
                        dir.mkdir();
                    }   
                break;

                case "rm":

                    System.out.print("Nome do arquivo que deseja Deletar: ");
                    String nomeArquivoDeletar = s.next();

                    File file = new File(nomeArquivoDeletar);

                    if(file.isDirectory()){
                         throw new IllegalArgumentException();
                    }
                    file.delete();

                break;

                case "ls":
                    System.out.println("Informe o nome do Arquivo: ");
                    String nomeArquivoPesquisar = s.next();

                    File fileList = new File(nomeArquivoPesquisar);
                    System.out.print(fileList.getAbsolutePath() + "\n");

                    if(fileList.isDirectory()){
                        for(String arquivos : fileList.list()){
                            System.out.println(arquivos);
                        }
                    }
                break;

                case "mv":
                    System.out.println("Informe o nome do arquivo");
                    String arquivo = s.next();
                    System.out.println("Informe o novo caminho");
                    String novoCaminho = s.next();
                    
                    File fileMover = new File(arquivo);
                    File fileNovo = new File(novoCaminho + arquivo);
                    
                    if(fileNovo.isDirectory()){
                        throw new IllegalArgumentException();
                    }
                    
                    Files.move(fileMover.toPath(), fileNovo.toPath());
                    
                break;
                 
                default:
                    System.out.println("Invalido");
                break;
            }  
    }
}
