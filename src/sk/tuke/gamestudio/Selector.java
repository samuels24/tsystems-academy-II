package sk.tuke.gamestudio;

import java.util.Scanner;

public class MainMenu {
    public static final String[] games= {"Minesweeper", "Fifteenpuzzle"};
    public void run(){
        while (true){
            try{
                System.out.println("Vyber si hru: ");
                Scanner scanner = new Scanner(System.in);
                for (int i =0; i< games.length; i++){
                    System.out.println((i+1)+"."+games[i]);
                }
            }
        }
    }
}
