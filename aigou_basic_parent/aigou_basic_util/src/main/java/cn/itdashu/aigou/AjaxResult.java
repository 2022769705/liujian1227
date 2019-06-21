package cn.itdashu.aigou;

/**
 * 抽取 项目 公共 工具类
 */
public class AjaxResult {
    // 返回值  默认值 ：true
    private Boolean success = true;
    private String msg="登录成功";
    private Object object;//返回封装的数据 目前 无用处

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }

    //直接返回 默认成功对象
    public static AjaxResult me(){
        return new AjaxResult();
    }

    public Boolean getSuccess() {
        return success;
    }
    //this  指向的是 调用这个方法的 对象 ；修改的是 链式编程 对象 的值；这样写 高大上
    public AjaxResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }
    //同上
    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
