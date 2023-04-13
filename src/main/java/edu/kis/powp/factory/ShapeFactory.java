package edu.kis.powp.factory;

import edu.kis.powp.command.ComplexCommand;
import edu.kis.powp.command.DriverCommand;
import edu.kis.powp.command.OperateToCommand;
import edu.kis.powp.command.SetPositionCommand;
import edu.kis.powp.jobs2d.Job2dDriver;

import java.util.ArrayList;
import java.util.List;
public class ShapeFactory {

    public static DriverCommand getSquare(Job2dDriver driver){
        List<DriverCommand> driverCommandList = new ArrayList<DriverCommand>();
        driverCommandList.add(new SetPositionCommand(driver,0,0));
        driverCommandList.add(new OperateToCommand(driver, 10, 0));
        driverCommandList.add(new OperateToCommand(driver, 10, 10));
        driverCommandList.add(new OperateToCommand(driver, 0, 10));
        driverCommandList.add(new OperateToCommand(driver, 0, 0));
        return new ComplexCommand(driverCommandList);
    }

    public static DriverCommand getTriangle(Job2dDriver driver){
        List<DriverCommand> driverCommandList = new ArrayList<DriverCommand>();
        driverCommandList.add(new SetPositionCommand(driver,0,0));
        driverCommandList.add(new OperateToCommand(driver, 10, 0));
        driverCommandList.add(new OperateToCommand(driver, 5, 5));
        driverCommandList.add(new OperateToCommand(driver, 0, 0));
        return new ComplexCommand(driverCommandList);
    }

    public static DriverCommand getRectangle(Job2dDriver driver){
        List<DriverCommand> driverCommandList = new ArrayList<DriverCommand>();
        driverCommandList.add(new SetPositionCommand(driver,0,0));
        driverCommandList.add(new OperateToCommand(driver, 10, 0));
        driverCommandList.add(new OperateToCommand(driver, 10, 15));
        driverCommandList.add(new OperateToCommand(driver, 0, 15));
        driverCommandList.add(new OperateToCommand(driver, 0, 0));
        return new ComplexCommand(driverCommandList);
    }
}
