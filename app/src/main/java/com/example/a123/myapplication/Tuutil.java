package com.example.a123.myapplication;

import java.util.List;

/**
 * Created by 123 on 2016/8/17.
 */
public class Tuutil {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"啪啪的时候， 她给她男票打电话","hashId":"E2F87EE8EA697529028E012B272C3B05","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/E2F87EE8EA697529028E012B272C3B05.gif"},{"content":"大姨妈期间 一夜来了七次","hashId":"C996DDA2F18EC5A4F20DA7C340470222","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/C996DDA2F18EC5A4F20DA7C340470222.gif"},{"content":"快身寸的时候让她口， 然后咽了","hashId":"D81CA734C57D5CD0C4BED59CC0C98F2E","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/D81CA734C57D5CD0C4BED59CC0C98F2E.gif"},{"content":"女人嘿咻前，在做什么？  1.洗头2.洗澡3.脱毛4.涂身体乳5.涂指甲油6.对镜子练习表情和动作7.脑补嘿 咻的流程7.脑补嘿 咻的流程9.化妆 10.做发型11.换上战袍12.香喷喷13.嘘嘘","hashId":"DB03EB1C16DA7F1D5622C5E44AAE5A8A","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/DB03EB1C16DA7F1D5622C5E44AAE5A8A.gif"},{"content":"那些年让人忍无可忍的国产剧台词","hashId":"73CB1D03F31611C2C924F1305CC018C9","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/73CB1D03F31611C2C924F1305CC018C9.jpg"},{"content":"日本A V电影是怎么拍的？带你走进拍摄现场大开眼界！","hashId":"C26A4177CE05164E6A0D93045B4A30AC","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/C26A4177CE05164E6A0D93045B4A30AC.jpg"},{"content":"最火的推心全套表情（附动态图）","hashId":"4A783C0102B9816F218C138B2D0ABAC9","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/4A783C0102B9816F218C138B2D0ABAC9.gif"},{"content":"海的味道我知道~","hashId":"19AFF7D82CAB866DE7CDC6A4EC68A4D1","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/19AFF7D82CAB866DE7CDC6A4EC68A4D1.gif"},{"content":"这就叫鱼（臀）跃救球","hashId":"887B4B1C6BBDFCC31FB8429355121C90","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/887B4B1C6BBDFCC31FB8429355121C90.gif"},{"content":"马龙和张继科关系真好啊，看腹肌\u2026\u2026揉 胸\u2026\u2026猝不及防被塞了两口狗粮","hashId":"291D5B4200C9963D561D2BCE22318E29","unixtime":1471253614,"updatetime":"2016-08-15 17:33:34","url":"http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/291D5B4200C9963D561D2BCE22318E29.gif"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * content : 啪啪的时候， 她给她男票打电话
         * hashId : E2F87EE8EA697529028E012B272C3B05
         * unixtime : 1471253614
         * updatetime : 2016-08-15 17:33:34
         * url : http://juheimg.oss-cn-hangzhou.aliyuncs.com/joke/201608/15/E2F87EE8EA697529028E012B272C3B05.gif
         */

        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;
            private String url;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
