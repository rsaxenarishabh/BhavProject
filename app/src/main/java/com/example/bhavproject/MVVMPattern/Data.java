package com.example.bhavproject.MVVMPattern;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

@SerializedName("activities")
@Expose
private List<Activity> activities = null;
@SerializedName("food")
@Expose
private List<Food> food = null;

public List<Activity> getActivities() {
return activities;
}

public void setActivities(List<Activity> activities) {
this.activities = activities;
}

public List<Food> getFood() {
return food;
}

public void setFood(List<Food> food) {
this.food = food;
}

}