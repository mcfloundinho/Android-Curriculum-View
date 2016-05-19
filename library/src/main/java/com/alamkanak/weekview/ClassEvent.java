package com.alamkanak.weekview;

import java.util.Calendar;

/**
 * Created by Yiwen Lu on 4/29/2016.
 */
public class ClassEvent {

    private static final int NUM_EVENT_COLORS = 4;

    private long mId;
    private String mName;
    private String mLocation;
    private Calendar mDate;
    private int mSessionNumber;
    private int mColor;

    public ClassEvent() {

    }

    public ClassEvent(long id, String name, String location, int year, int month, int day, int sessionNumber) {
        this.mId = id;
        this.mName = name;
        this.mLocation = location;
        this.mDate = Calendar.getInstance();
        mDate.set(year, month, day);
        this.mSessionNumber = sessionNumber;
        this.mColor = name.hashCode() % NUM_EVENT_COLORS;
    }

    public void setId(long id) {
        this.mId = id;
    }

    public long getId() {
        return mId;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setLocation(String location) {
        this.mLocation = location;
    }

    public String getLocation() {
        return mLocation;
    }

    public void setYear(int year) {
        this.mDate.set(Calendar.YEAR, year);
    }

    public int getYear() {
        return mDate.get(Calendar.YEAR);
    }

    public void setMonth(int month) {
        this.mDate.set(Calendar.MONTH, month);
    }

    public int getMonth() {
        return mDate.get(Calendar.MONTH);
    }

    public void setDayOfMonth(int day) {
        this.mDate.set(Calendar.DAY_OF_MONTH, day);
    }

    public int getDayOfMonth() {
        return mDate.get(Calendar.DAY_OF_MONTH);
    }

    public int getDayOfWeek() {
        return mDate.get(Calendar.DAY_OF_WEEK);
    }

    public void setSessionNumber(int sessionNumber) {
        this.mSessionNumber = sessionNumber;
    }

    public int getSessionNumber() {
        return mSessionNumber;
    }

    public void setColor(int color) {
        if (color <= NUM_EVENT_COLORS) {
            this.mColor = color;
        }
    }

    public int getColor() {
        return mColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassEvent that = (ClassEvent) o;

        return mId == that.mId;

    }

    @Override
    public int hashCode() {
        return (int) (mId ^ (mId >>> 32));
    }
}
