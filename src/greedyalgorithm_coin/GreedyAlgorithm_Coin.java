package greedyalgorithm_coin;

import java.util.Scanner;

public class GreedyAlgorithm_Coin 
{
    public static void main(String[] args) 
    {
        System.out.println("Masukan jumlah pecahan    : "); //0
        int total_coin; // 0
        Scanner scanCoin = new Scanner(System.in); //0
        total_coin = scanCoin.nextInt(); //1

        int[] coin = new int[total_coin]; //0
        
        for(int x=0; x<total_coin; x++)
        {
            System.out.println("Pecahan [" + (x+1) + "] : ");
            Scanner scanPieces = new Scanner(System.in);
            coin[x] = scanPieces.nextInt();
        }
        
        System.out.println("\nMasukan uang    : "); //0
        int money;
        Scanner scanMoney = new Scanner(System.in); //0
        money = scanMoney.nextInt(); //1
        
        int temp=money; //1
        int[] hasil = new int[total_coin]; //0
        for(int x=0; x<total_coin;x++)
        {
            if(money<coin[x])
            {
                hasil[x]=0;
            }
            else
            {
                hasil[x]=money/coin[x]; // p = c+3 -> p=4
                temp=money%coin[x];
                money=temp;
            }
        }
        
        int total = 0; //1
        
        for(int x=0;x<total_coin;x++)
        {
            System.out.println("Banyanknya pecahan " + coin[x] + " : " + hasil[x]); //1
            total = total+hasil[x]; //1
        }
        
        System.out.println("\nTotal jumlah pecahan : " + total);
    }
}
