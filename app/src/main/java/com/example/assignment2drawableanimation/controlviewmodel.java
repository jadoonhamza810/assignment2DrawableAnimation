package com.example.assignment2drawableanimation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


public class controlviewmodel extends ViewModel {

private MutableLiveData<String> action;

public void init()
{
    action=new MutableLiveData();
    action.setValue("idle");
}
public void setAction(String act)  {  action.setValue(act); }
public LiveData<String> getAction() {return action;}

}
