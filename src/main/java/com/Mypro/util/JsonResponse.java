package com.Mypro.util;

import java.io.Serializable;
import org.codehaus.jackson.map.util.JSONPObject;
import org.json.simple.JSONObject;
public class JsonResponse implements Serializable {
    private static final long serialVersionUID = -5459827249771639254L;

    private String status = null;
    private String message = null;
    private Object result = null;
    private JSONObject jsonObject = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("JsonResponse [status=");
        builder.append(status);
        builder.append(", message=");
        builder.append(message);
        builder.append(", result=");
        builder.append(result);
        builder.append(", jsonObject=");
        builder.append(jsonObject);
        builder.append("]");
        return builder.toString();
    }
}
