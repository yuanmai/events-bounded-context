package agh.bit.eventsbc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DummyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String getDummyString() {
        return "Hello World!";
    }
}
