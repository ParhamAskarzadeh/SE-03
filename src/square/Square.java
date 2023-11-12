package square;

import rectangle.Rectangle;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setHeight(width);
        super.setWidth(width);
    }

    public void setSide(int side) {
        setHeight(side);
        setWidth(side);
    }
}
