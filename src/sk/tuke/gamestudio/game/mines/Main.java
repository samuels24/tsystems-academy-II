package sk.tuke.gamestudio.game.mines;

import sk.tuke.gamestudio.game.mines.core.*;

public class Main {
    public static void main(String[] args) {
        var field = new Field(9,9,10);
        for (var row = 0; row < field.getRowCount(); row++) {
            for (var column = 0; column < field.getColumnCount(); column++){
                var tile = field.getTile(row, column);
                System.out.print(" ");
                if(tile == null)
                    System.out.print("-");
                else
                    System.out.print("x");
            }
            System.out.println();
        }
    }
}
