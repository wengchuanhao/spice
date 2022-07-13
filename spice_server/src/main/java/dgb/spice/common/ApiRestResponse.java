package dgb.spice.common;

import org.springframework.stereotype.Component;

/**
 * @author GentleKiller
 * @date Created in 2022/7/13 20:11
 * @description api通用返回值
 */
@Component
public class ApiRestResponse<T> {

    //成功状态码
    private static final Integer SUCCESS_CODE = 10000;
    //成功信息
    private static final String SUCCESS_MESSAGE = "SUCCESS";

    private Integer status;

    private String message;

    private T data;

    public ApiRestResponse(Integer status ,String message,T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ApiRestResponse(Integer status ,String message) {
        this.status = status;
        this.message = message;
    }

    public ApiRestResponse() {
        this(SUCCESS_CODE,SUCCESS_MESSAGE);
    }

    public static <T> ApiRestResponse<T> success(){
        return new ApiRestResponse<>();
    }

    public static <T> ApiRestResponse<T> success(T data){
        ApiRestResponse<T> apiRestResponse = new ApiRestResponse<>();
        apiRestResponse.setData(data);
        return apiRestResponse;
    }

    public static <T> ApiRestResponse<T> error(Integer status,String message){
        return new ApiRestResponse<>(status,message);
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
