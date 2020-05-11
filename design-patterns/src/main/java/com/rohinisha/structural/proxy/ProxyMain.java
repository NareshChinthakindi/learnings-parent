package com.rohinisha.structural.proxy;

public class ProxyMain {

    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Naresh", "test1234");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }

    }
}
