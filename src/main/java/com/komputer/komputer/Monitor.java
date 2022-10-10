package com.komputer.komputer;

public class Monitor {
    private int width = 3840;
    private int height = 2160;

    public void setLowResolution() {
    width = 800;
    height = 600;
    }

    public void setHighResolution() {
        width = 3840;
        height = 2160;
    }

    public String getResolution() {
        return width + "x" + height;
    }


}
