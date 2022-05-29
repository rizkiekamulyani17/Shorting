package BSInteger;

import TugasBubbleSort.Bublesort;

import java.util.Scanner;

public class bubelsort {
    private int [] data;

    public bubelsort() {
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void sortData() {
        int lenData = this.data.length;
        for (int i = 0;i<lenData;i++) {
            for (int j = i + 1;j<lenData;j++) {
                if(this.data[j]<this.data[i]) {
                    int temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j]= temp;
                }
            }
        }
    }

    public void PrintData() {
        for(int datum : this.data) {
            System.out.print(datum+"");
        }
    }

    public static void tampil(int[] coba) {
        Bublesort _myBubble = new Bublesort();
        _myBubble.setData(coba);
        _myBubble.sortData();
        _myBubble.PrintData();
        System.out.println("");

    }

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int jumlah = 3;
        int nomor = 0;

        int[] s = new int[jumlah];
        for(int i = 0; i<jumlah;i++)
        {
            nomor++;
            System.out.print("Bilangan Ke- "+nomor+" = ");
            s[i] = scaner.nextInt();
            tampil(s);

        }

    }
}
