package com.introjava.Chapter14.gsm;

import java.util.Date;

public class Call {
    public Integer durationInMin;
    public Date timestamp;

    public Call(Integer durationInMin, Date timestamp) {
        this.durationInMin = durationInMin;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Call{" +
                "durationInMin=" + durationInMin +
                ", timestamp=" + timestamp +
                '}';
    }
}
