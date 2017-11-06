package com.example.helio.android_praticas;

import android.app.SharedElementCallback;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by helio on 05/11/2017.
 */

public class Student implements Parcelable{

    String name;
    String course;
    String discipline;

    public Student(String name, String course, String discipline)
    {
        this.name = name;
        this.course = course;
        this.discipline = discipline;
    }

    public Student() {

    }

    protected Student(Parcel in) {
        name = in.readString();
        course = in.readString();
        discipline = in.readString();
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(course);
        dest.writeString(discipline);
    }

    @Override
    public String toString() {
        return name + " : " + discipline + " : " + course;
    }
}
