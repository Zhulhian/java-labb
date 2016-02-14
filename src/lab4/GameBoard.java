package lab4;

public class GameBoard
{
    private enum CellType
    {
        EMPTY(false), TREE(true), BUILDING(true), ROCK(true),
        POWERUP(false), BORDER(true);

        public final boolean isObstacle;

        CellType(final boolean isObstacle) {
            this.isObstacle = isObstacle;
        }
    }

    public enum Move {
        DOWN(0, 1), UP(0, -1), RIGHT(1, 0), LEFT(-1, 0);

        public final int deltaX;
        public final int deltaY;

        Move(final int deltaX, final int deltaY) {
            this.deltaX = deltaX;
            this.deltaY = deltaX;
        }
    }

    private CellType[][] cells;
    private int currentX, currentY;

    public GameBoard(int width, int height) {
        this.cells = new CellType[height][width];
        this.currentX = width / 2;
        this.currentY = height / 2;
    }

    public void move(Move movement) {
        if (!canMove(movement)) {
            System.out.println("Obstacle in the way!");
            return;
        }
        switch (movement) {
            case DOWN:
                currentY++;
                break;
            case UP:
                currentY--;
                break;
            case LEFT:
                currentX--;
                break;
            case RIGHT:
                currentX++;
                break;
        }
    }

    public boolean canMove(Move movement) {
        return !cells[currentY + movement.deltaY][currentX + movement.deltaX].isObstacle;
    }

}
