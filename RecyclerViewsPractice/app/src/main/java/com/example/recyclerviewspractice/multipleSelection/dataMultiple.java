package com.example.recyclerviewspractice.multipleSelection;

public class dataMultiple {

    private boolean isChecked = false;
    String name;
    public void isChecked(boolean checked)
    {
        this.isChecked = checked;
    }

    public dataMultiple(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public String getName() {
        return name;
    }
}
