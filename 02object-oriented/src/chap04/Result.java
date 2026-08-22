package chap04;

public class Result {
    private int code;
    private String msg;
    private Object data;
    private static final int OK=0;
    private static final int FALE=1;
    public Result(int code, String msg,Object data ) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }
    public static Result ok(Object data)
    {
        return new Result(OK,"ok",data);
    }
    //方法重载:名称相同，参数列表不同
    public static Result ok()
    {
        return ok(null);
    }
    public static Result fail(String msg)
    {
        return new Result(FALE,msg,null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
