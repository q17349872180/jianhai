package net.xdclass.online_xdclass.utils;

public class JsonData {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 业务数据
     */
    private Object data;

    /**
     * 信息表示
     */
    private String msg;

    /**
     * 成功，不用返回数据
     * @return
     * @param code
     * @param message
     */
    public static JsonData buildSuccess(Integer code, String message){
        return new JsonData(0,null,null);
    }

    /**
     * 成功，返回数据
     * @param data
     * @return
     */
    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data,null);
    }

    /**
     * 失败，固定状态码
     * @param msg
     * @return
     */
    public static JsonData buildError(String msg){
        return new JsonData(-1,null,msg);
    }

    /**
     * 失败，返回状态码和原因
     * @param code
     * @param msg
     * @return
     */
    public static JsonData buildError(Integer code, String msg){
        return new JsonData(code,null,msg);
    }


    public JsonData() {
    }

    public JsonData(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
