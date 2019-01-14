package com.ry.administrator.mvpapp2.bean;

public class LoginBean {


    /**
     * msg : 登录成功
     * data : {"jg_password":"TMyNP0","flag":"0","flagx":"0","jg_username":"EYE_ca314f4d647d444faf363f7593787ac9","nickname":"啦啦啦啦","headimgurl":"http://www.guozikeji.com/upload/eYenurs/avatar/201811121605298455.jpg","id":"98897","token":"UzcEZgBjAD4EYAZvC2tdPVptV2ZTMgNmUDwHLANnB2QEaVE/UjIMKVdzUGMAPAA9WzU="}
     * error : -1
     */

    private String msg;
    private DataBean data;
    private int error;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public static class DataBean {
        /**
         * jg_password : TMyNP0
         * flag : 0
         * flagx : 0
         * jg_username : EYE_ca314f4d647d444faf363f7593787ac9
         * nickname : 啦啦啦啦
         * headimgurl : http://www.guozikeji.com/upload/eYenurs/avatar/201811121605298455.jpg
         * id : 98897
         * token : UzcEZgBjAD4EYAZvC2tdPVptV2ZTMgNmUDwHLANnB2QEaVE/UjIMKVdzUGMAPAA9WzU=
         */

        private String jg_password;
        private String flag;
        private String flagx;
        private String jg_username;
        private String nickname;
        private String headimgurl;
        private String id;
        private String token;

        public String getJg_password() {
            return jg_password;
        }

        public void setJg_password(String jg_password) {
            this.jg_password = jg_password;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public String getFlagx() {
            return flagx;
        }

        public void setFlagx(String flagx) {
            this.flagx = flagx;
        }

        public String getJg_username() {
            return jg_username;
        }

        public void setJg_username(String jg_username) {
            this.jg_username = jg_username;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
