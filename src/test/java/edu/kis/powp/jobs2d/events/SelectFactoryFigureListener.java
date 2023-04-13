package edu.kis.powp.jobs2d.events;

import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.factory.ShapeFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFactoryFigureListener implements ActionListener {

    private DriverManager driverManager;

    public SelectFactoryFigureListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch(e.getActionCommand()){
            case "Figure square":
                DriverCommand commandSquare = ShapeFactory.getSquare(driverManager.getCurrentDriver());
                commandSquare.execute();
                break;
            case "Figure triangle":
                DriverCommand commandTriangle = ShapeFactory.getTriangle(driverManager.getCurrentDriver());
                commandTriangle.execute();
                break;
            case "Figure rectangle":
                DriverCommand commandRectangle = ShapeFactory.getRectangle(driverManager.getCurrentDriver());
                commandRectangle.execute();
        }

    }
}
