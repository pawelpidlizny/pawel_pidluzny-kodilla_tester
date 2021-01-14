package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private final String stampName;
    private final String stampNumber;
    private final double stampBadge;
    private final boolean isMarked;

    public Stamp(String stampName, String stampNumber, double stampBadge, boolean isMarked) {
        this.stampName = stampName;
        this.stampNumber = stampNumber;
        this.stampBadge = stampBadge;
        this.isMarked = isMarked;
    }
    public String getStampName() {
        return stampName;
    }
    public String getStampNumber() {
        return stampNumber;
    }

    public double getStampBadge() {
        return stampBadge;
    }
    public boolean isMarked() {
        return isMarked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stamp)) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.getStampBadge(), getStampBadge()) == 0 && isMarked() == stamp.isMarked() && Objects.equals(getStampName(), stamp.getStampName()) && Objects.equals(getStampNumber(), stamp.getStampNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStampName(), getStampNumber(), getStampBadge(), isMarked());
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampNumber='" + stampNumber + '\'' +
                ", stampBadge=" + stampBadge +
                ", isMarked=" + isMarked +
                '}';
    }
}

