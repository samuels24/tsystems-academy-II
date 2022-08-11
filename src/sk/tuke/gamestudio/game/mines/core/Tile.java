package sk.tuke.gamestudio.game.mines.core;

public abstract class Tile { //abstrakt nevie urovit novy objekt
    private TileState state = TileState.CLOSED;

    public TileState getState() {
        return state;
    }

    void setState(TileState state) {
        this.state = state;
    }
}
