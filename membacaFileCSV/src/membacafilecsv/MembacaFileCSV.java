
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package membacafilecsv;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author nightWalker
 */
public class MembacaFileCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String [][] matrixSiswa = new String[6][6];
        String [][] matrixDate = new String[60000][10];
        int x = 0;
        BufferedReader br;
        String line;
        try {
            br=new BufferedReader(new FileReader("src/file/siswa.csv"));
            while((line=br.readLine())!=null){
                
                String[] siswa=line.split(",");
                System.out.println("Id:"+siswa[0]+" Nama:"+siswa[1]+" Jenis Kelamin:"+siswa[2]+" Alamat:"+siswa[3]+" Tanggal Lahir:"+siswa[4]);
                for (int i = 0; i < 5; i++) {
                    matrixSiswa[x][i]=siswa[i];
                }
                x++;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                    System.out.print(matrixSiswa[i][j]+" ");
                }
            System.out.println("");
        }
    }
    
}
