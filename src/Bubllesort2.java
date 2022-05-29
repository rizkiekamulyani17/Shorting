
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Bubllesort2
{
    private static String[] data;
    public Bubllesort2(){
    }
    public String [] getdata (){return data;}

    public void setdata (String[] data)
    {this.data = data;}//diterima oleh this.data
//    private static int jumlah;
    public static void sorting() throws IOException {
        int jumlah;
        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
        jumlah = Integer.parseInt(kata.readLine());
        for(int x=1;x<jumlah;x++)
        {
            for(int y=0;y<jumlah-x;y++)
            {
                if(data[y].compareTo(data[y+1])>0)
                {
                    String temp=data[y];
                    data[y]=data[y+1];
                    data[y+1]=temp;
                }
            }}
        // output pengurutan nama
        for(int i=0;i<jumlah; i++){
            System.out.print((i+1)+"."+data[i] +" ");
        System.out.println("");

        }
    }
    public static void main(String[]args) throws IOException {

        BufferedReader kata = new BufferedReader(new InputStreamReader(System.in));
        int jumlah;
        jumlah = Integer.parseInt(kata.readLine());
        //int jumlah;
        System.out.println("\nMasukkan Nama yang ingin di input : "+jumlah);
        System.out.println("===========================================");

        String array[] = new String[jumlah];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<jumlah;i++)
        {
            System.out.print("Nama "+(i+1) + " adalah ");
            array[i]=scan.next();
            sorting();

        }

    }
}
