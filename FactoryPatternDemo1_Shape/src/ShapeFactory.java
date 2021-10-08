/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hanh
 */


public class ShapeFactory {
    
    //use getShape method to get object of type shape
    public Shape getShape(String type){
        if (type == null){
            return null;
        }
        if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (type.equalsIgnoreCase("square")){
            return new Square();
        }else if (type.equalsIgnoreCase("triangle")){
            return new Triangle();
        }
        return null;
    }
}
