package com.demo.gradledemo;

import com.gpr.gprgradleapp.GPRController;

public class DemoController {

    GPRController gprController;

    public void printMessage(){
        gprController = new GPRController();
        gprController.gprFunction();
    }
}
