package com.example.bhavproject.MVVMPattern;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Club {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("description")
@Expose
private String description;
@SerializedName("challenge_type")
@Expose
private String challengeType;
@SerializedName("activity_id")
@Expose
private Object activityId;
@SerializedName("members")
@Expose
private Object members;
@SerializedName("rule1")
@Expose
private String rule1;
@SerializedName("rule2")
@Expose
private String rule2;
@SerializedName("target")
@Expose
private String target;
@SerializedName("active_image")
@Expose
private String activeImage;
@SerializedName("inactive_image")
@Expose
private String inactiveImage;
@SerializedName("created_at")
@Expose
private String createdAt;
@SerializedName("updated_at")
@Expose
private String updatedAt;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public String getChallengeType() {
return challengeType;
}

public void setChallengeType(String challengeType) {
this.challengeType = challengeType;
}

public Object getActivityId() {
return activityId;
}

public void setActivityId(Object activityId) {
this.activityId = activityId;
}

public Object getMembers() {
return members;
}

public void setMembers(Object members) {
this.members = members;
}

public String getRule1() {
return rule1;
}

public void setRule1(String rule1) {
this.rule1 = rule1;
}

public String getRule2() {
return rule2;
}

public void setRule2(String rule2) {
this.rule2 = rule2;
}

public String getTarget() {
return target;
}

public void setTarget(String target) {
this.target = target;
}

public String getActiveImage() {
return activeImage;
}

public void setActiveImage(String activeImage) {
this.activeImage = activeImage;
}

public String getInactiveImage() {
return inactiveImage;
}

public void setInactiveImage(String inactiveImage) {
this.inactiveImage = inactiveImage;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public String getUpdatedAt() {
return updatedAt;
}

public void setUpdatedAt(String updatedAt) {
this.updatedAt = updatedAt;
}

}
