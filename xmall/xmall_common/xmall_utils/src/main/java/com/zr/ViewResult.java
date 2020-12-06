package com.zr;

public class ViewResult<T> {

        private static ViewResult viewResult = new ViewResult();

        private Integer errno;//成功：1    失败：0

        private T data;

        private String message;

        public static ViewResult error(){
        viewResult.setData(null);
        viewResult.setMessage("error");
        viewResult.setErrno(0);//失败
        return viewResult;
    }


        public static ViewResult error(String message){
        viewResult.setData(null);
        viewResult.setMessage(message);
        viewResult.setErrno(0);//失败
        return viewResult;
    }


        public static ViewResult success(){
        viewResult.setData(null);
        viewResult.setMessage("success");
        viewResult.setErrno(1);//成功
        return viewResult;
    }

        public static ViewResult success(String message){
        viewResult.setData(null);
        viewResult.setMessage(message);
        viewResult.setErrno(1);//成功
        return viewResult;
    }



        public static ViewResult success(Object data,String message){

        viewResult.setData(data);
        viewResult.setMessage(message);
        viewResult.setErrno(1);//成功
        return viewResult;
    }


        public Integer getErrno() {
        return errno;
    }

        public void setErrno(Integer errno) {
        this.errno = errno;
    }

        public T getData() {
        return data;
    }

        public void setData(T data) {
        this.data = data;
    }

        public String getMessage() {
        return message;
    }

        public void setMessage(String message) {
        this.message = message;
    }
}
