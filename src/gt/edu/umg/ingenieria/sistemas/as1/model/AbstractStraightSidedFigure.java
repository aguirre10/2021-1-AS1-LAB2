package edu.umg.ingenieria.sistemas.as1.model;

import java.util.*;

/**
 * 
 */
public abstract class AbstractStraightSidedFigure implements IGeometric {

    /**
     * Default constructor
     */
    public AbstractStraightSidedFigure() {
    }

    /**
     * 
     */
    private int sides;

    /**
     * @return
     */
    public int getSides() {
        // TODO implement here
        return 0;
    }

    /**
     * @param slides 
     * @return
     */
    public void setSides(int slides) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public double getArea () {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @return
     */
    public void getPerimeter() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public String getBackgroundColor() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getBorderColor() {
        // TODO implement here
        return "";
    }

}