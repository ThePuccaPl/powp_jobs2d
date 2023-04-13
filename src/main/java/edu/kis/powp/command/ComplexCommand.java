package edu.kis.powp.command;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements DriverCommand{

    private List<DriverCommand> driverCommandList = new ArrayList<>();

    public ComplexCommand(List<DriverCommand> driverCommandList){
        this.driverCommandList.addAll(driverCommandList);
    }

    @Override
    public void execute() {
        for(DriverCommand command : this.driverCommandList){
            command.execute();
        }
    }
}
