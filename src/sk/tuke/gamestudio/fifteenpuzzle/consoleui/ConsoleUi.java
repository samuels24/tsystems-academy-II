package sk.tuke.gamestudio.fifteenpuzzle.consoleui;

import sk.tuke.gamestudio.fifteenpuzzle.core.Field;

import java.util.Scanner;

public class ConsoleUiPuzzle {
    private final Field field;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleUiPuzzle(Field field) {
        this.field = field;
    }
    public void play(){
        printField();
//        do {
//            printField();
//            processInput();
//        }while (!field.isSolved());
//        printField();
//        System.out.println("Solved");
        }
        private void printField(){
        for (var row =0; row< field.getRowCount(); row++){
            for (var column = 0; column< field.getColumnCount(); column++){
                var tile = field.getTile(row, column);
                System.out.print(" ");
                if (tile==null)
                    System.out.print(" *");
                else
                    System.out.printf("%2d", tile.getValue());
            }
            System.out.println();
        }

        }

}
