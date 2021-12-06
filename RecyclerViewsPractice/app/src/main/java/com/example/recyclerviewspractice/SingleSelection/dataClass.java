package com.example.recyclerviewspractice.SingleSelection;

public class dataClass {
    private boolean isChecked = false;
    String name;
    public void isChecked(boolean checked)
    {
        this.isChecked = checked;
    }

    public dataClass(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public String getName() {
        return name;
    }
}
