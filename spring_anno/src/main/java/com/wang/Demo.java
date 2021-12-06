package com.wang;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
//@Scope("prototype")
public class Demo {
    public void show() {
        System.out.println("show 已经运行....");
    }
}
