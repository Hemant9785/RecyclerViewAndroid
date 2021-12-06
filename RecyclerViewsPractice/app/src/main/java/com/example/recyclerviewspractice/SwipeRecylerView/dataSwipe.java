package com.example.recyclerviewspractice.SwipeRecylerView;

public class dataSwipe {

    private boolean isChecked = false;
    String name;
    public void isChecked(boolean checked)
    {
        this.isChecked = checked;
    }

    public dataSwipe(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public String getName() {
        return name;
    }

}
