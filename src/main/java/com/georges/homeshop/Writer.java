package com.georges.homeshop;

public interface Writer {
    /**
     * start writer process
     */
    public void start();

    /**
     * write on line
     * @param line
     */
    public void writeLine(String line);

    /**
     * stop the process
     */
    public void stop();
}
