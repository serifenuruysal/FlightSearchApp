
package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SessionResponse implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("order")
    @Expose
    private List<String> order = null;
    @SerializedName("folders")
    @Expose
    private List<Object> folders = null;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("public")
    @Expose
    private Boolean _public;
    @SerializedName("requests")
    @Expose
    private List<Request> requests = null;
    public final static Creator<SessionResponse> CREATOR = new Creator<SessionResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SessionResponse createFromParcel(Parcel in) {
            return new SessionResponse(in);
        }

        public SessionResponse[] newArray(int size) {
            return (new SessionResponse[size]);
        }

    }
    ;

    protected SessionResponse(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.order, (String.class.getClassLoader()));
        in.readList(this.folders, (Object.class.getClassLoader()));
        this.timestamp = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.owner = ((String) in.readValue((String.class.getClassLoader())));
        this._public = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        in.readList(this.requests, (com.soulkitchen.serifenuruysal.flightsearchapp.data.models.Request.class.getClassLoader()));
    }

    public SessionResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public List<String> getOrder() {
        return order;
    }

    public void setOrder(List<String> order) {
        this.order = order;
    }

    public List<Object> getFolders() {
        return folders;
    }

    public void setFolders(List<Object> folders) {
        this.folders = folders;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeList(order);
        dest.writeList(folders);
        dest.writeValue(timestamp);
        dest.writeValue(owner);
        dest.writeValue(_public);
        dest.writeList(requests);
    }

    public int describeContents() {
        return  0;
    }

}
