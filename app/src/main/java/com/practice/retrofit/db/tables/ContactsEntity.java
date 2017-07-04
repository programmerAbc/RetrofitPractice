package com.practice.retrofit.db.tables;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by dance on 2016/9/20.
 */
@DatabaseTable(tableName = "contacts")
public class ContactsEntity{
    @DatabaseField(generatedId = true)
    public int id;
    @DatabaseField
    public String userId;
    @DatabaseField
    public int statusCode;
    @DatabaseField
    public int dateTime;
    @DatabaseField
    public String code;
    @DatabaseField
    public String router;
    @DatabaseField
    public String title;
    @DatabaseField
    public String description;
    @DatabaseField
    public String imageUrl;
    @DatabaseField
    public String fromName;
    @DatabaseField
    public String fromImageUrl;
    @DatabaseField
    public int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ContactsEntity(){}

    public ContactsEntity(int id, String userId, int statusCode, int dateTime, String code, String router, String title, String description, String imageUrl, String fromName, String fromImageUrl, int status) {
        this.id = id;
        this.userId = userId;
        this.statusCode = statusCode;
        this.dateTime = dateTime;
        this.code = code;
        this.router = router;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.fromName = fromName;
        this.fromImageUrl = fromImageUrl;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getDateTime() {
        return dateTime;
    }

    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFromImageUrl() {
        return fromImageUrl;
    }

    public void setFromImageUrl(String fromImageUrl) {
        this.fromImageUrl = fromImageUrl;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }
}
