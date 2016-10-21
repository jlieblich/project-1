package com.jonathanlieblich.to_doto_day;

import java.util.List;

/**
 * Created by jonlieblich on 10/19/16.
 */

public class ToDoList {
    private List<ToDoItem> mToDoItems;
    private String mListTitle;
    private boolean mListComplete;
    private int mListPriority;

    public ToDoList(String title, List<ToDoItem> toDoItems, int listPriority) {
        mListPriority = listPriority;
        mListComplete = false;
        mListTitle = title;
        mToDoItems = toDoItems;
    }

    public void addNewItem(String title, String description) {
        mToDoItems.add(new ToDoItem(title, description));
    }

    public void addItem(ToDoItem item) {
        mToDoItems.add(item);
    }

    public List getToDoItems() {
        return mToDoItems;
    }

    public String getListTitle() {
        return mListTitle;
    }

    public void setListTitle(String title) {
        mListTitle = title;
    }

    public boolean isListComplete() {
        return mListComplete;
    }

    public void listComplete() {
        mListComplete = !isListComplete();
    }

    public int getListPriority() {
        return mListPriority;
    }

    public void setListPriority(int priority) {
        mListPriority = priority;
    }
}
