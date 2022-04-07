package medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Inside a matrix find a specific coordenate using binary search
 */
class BinarySearch2D {

    public static int find(
        int width,
        int height,
        int positionX,
        int positionY,
        int positionToReachX,
        int positionToReachY) {

        int yUp = 0;
        int yDown = height - 1;
        int xLeft = 0;
        int xRight = width - 1;
    
        int hoops = 0;
        while (true) {
            final List<Direction> directions = getDirection(positionX, positionY, positionToReachX, positionToReachY);

            for (Direction direction: directions) {    
                switch (direction) {
                    case UP:
                        yDown = positionY - 1;
                        break;
                    case DOWN:
                        yUp = positionY + 1;
                        break;
                    case LEFT:
                        xRight = positionX - 1;
                        break;
                    case RIGHT:
                        xLeft = positionX + 1;
                        break;
                }
            }

            positionX = (xLeft + xRight) / 2;
            positionY = (yUp + yDown) / 2;

            hoops++;
            if (positionX == positionToReachX && positionY == positionToReachY) {
                return hoops;
            }
        }
    }

    private static List<Direction> getDirection(
        int positionX,
        int positionY,
        int positionToReachX,
        int positionToReachY) {

        List<Direction> directions = new ArrayList<>();
        if (positionY > positionToReachY) {
            directions.add(Direction.fromSymbol("U"));
        } else if (positionY < positionToReachY) {
            directions.add(Direction.fromSymbol("D"));
        }

        if (positionX > positionToReachX) {
            directions.add(Direction.fromSymbol("L"));
        } else if (positionX < positionToReachX) {
            directions.add(Direction.fromSymbol("R"));
        }
        return directions;
    }

    private enum Direction {
        UP("U"),
        DOWN("D"),
        LEFT("L"),
        RIGHT("R");

        String symbol;

        Direction(String symbol) {
            this.symbol = symbol;
        }

        public static Direction fromSymbol(String value) {
            return Arrays.stream(values()).filter(e -> e.symbol.equals(value)).findFirst()
                    .orElseThrow(RuntimeException::new);
        }
    }
}