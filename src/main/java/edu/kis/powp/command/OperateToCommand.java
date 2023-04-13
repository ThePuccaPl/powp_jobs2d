package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand{

    private int x;
    private int y;

    private Job2dDriver driver;

    private void OperateToCommand(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void execute() {
        driver.operateTo(x,y);
    }
}
