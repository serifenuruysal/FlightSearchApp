
package com.soulkitchen.serifenuruysal.flightsearchapp.data.models;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("headers")
    @Expose
    private String headers;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("preRequestScript")
    @Expose
    private Object preRequestScript;
    @SerializedName("pathVariables")
    @Expose
    private List<Object> pathVariables = null;
    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("data")
    @Expose
    private List<Object> data = null;
    @SerializedName("dataMode")
    @Expose
    private String dataMode;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("tests")
    @Expose
    private Object tests;
    @SerializedName("currentHelper")
    @Expose
    private String currentHelper;
    @SerializedName("helperAttributes")
    @Expose
    private List<Object> helperAttributes = null;
    @SerializedName("time")
    @Expose
    private Integer time;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("collectionId")
    @Expose
    private String collectionId;
    @SerializedName("responses")
    @Expose
    private List<Object> responses = null;
    @SerializedName("rawModeData")
    @Expose
    private String rawModeData;
    @SerializedName("descriptionFormat")
    @Expose
    private String descriptionFormat;
    public final static Creator<Request> CREATOR = new Creator<Request>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Request createFromParcel(Parcel in) {
            return new Request(in);
        }

        public Request[] newArray(int size) {
            return (new Request[size]);
        }

    }
    ;

    protected Request(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.headers = ((String) in.readValue((String.class.getClassLoader())));
        this.url = ((String) in.readValue((String.class.getClassLoader())));
        this.preRequestScript = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.pathVariables, (Object.class.getClassLoader()));
        this.method = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.data, (Object.class.getClassLoader()));
        this.dataMode = ((String) in.readValue((String.class.getClassLoader())));
        this.version = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.tests = ((Object) in.readValue((Object.class.getClassLoader())));
        this.currentHelper = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.helperAttributes, (Object.class.getClassLoader()));
        this.time = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.name = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.collectionId = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.responses, (Object.class.getClassLoader()));
        this.rawModeData = ((String) in.readValue((String.class.getClassLoader())));
        this.descriptionFormat = ((String) in.readValue((String.class.getClassLoader())));
    }

    public Request() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Object getPreRequestScript() {
        return preRequestScript;
    }

    public void setPreRequestScript(Object preRequestScript) {
        this.preRequestScript = preRequestScript;
    }

    public List<Object> getPathVariables() {
        return pathVariables;
    }

    public void setPathVariables(List<Object> pathVariables) {
        this.pathVariables = pathVariables;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public String getDataMode() {
        return dataMode;
    }

    public void setDataMode(String dataMode) {
        this.dataMode = dataMode;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Object getTests() {
        return tests;
    }

    public void setTests(Object tests) {
        this.tests = tests;
    }

    public String getCurrentHelper() {
        return currentHelper;
    }

    public void setCurrentHelper(String currentHelper) {
        this.currentHelper = currentHelper;
    }

    public List<Object> getHelperAttributes() {
        return helperAttributes;
    }

    public void setHelperAttributes(List<Object> helperAttributes) {
        this.helperAttributes = helperAttributes;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
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

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public List<Object> getResponses() {
        return responses;
    }

    public void setResponses(List<Object> responses) {
        this.responses = responses;
    }

    public String getRawModeData() {
        return rawModeData;
    }

    public void setRawModeData(String rawModeData) {
        this.rawModeData = rawModeData;
    }

    public String getDescriptionFormat() {
        return descriptionFormat;
    }

    public void setDescriptionFormat(String descriptionFormat) {
        this.descriptionFormat = descriptionFormat;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(headers);
        dest.writeValue(url);
        dest.writeValue(preRequestScript);
        dest.writeList(pathVariables);
        dest.writeValue(method);
        dest.writeList(data);
        dest.writeValue(dataMode);
        dest.writeValue(version);
        dest.writeValue(tests);
        dest.writeValue(currentHelper);
        dest.writeList(helperAttributes);
        dest.writeValue(time);
        dest.writeValue(name);
        dest.writeValue(description);
        dest.writeValue(collectionId);
        dest.writeList(responses);
        dest.writeValue(rawModeData);
        dest.writeValue(descriptionFormat);
    }

    public int describeContents() {
        return  0;
    }

}
