package cn.xsaf1207.utils;



public class ResultData {
    private Integer code;
    private Object data;

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "ResultData{" +
                "code=" + code +
                ", data=" + data +
                '}';
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
}
