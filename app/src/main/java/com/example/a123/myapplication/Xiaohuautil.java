package com.example.a123.myapplication;

import java.util.List;

/**
 * Created by 123 on 2016/8/17.
 */
public class Xiaohuautil {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"\u201c不知道为什么，今天我家的狗老是亲我。\u201d\u201c我知道，狗改不了吃屎！\u201d","hashId":"62055689a330fbb0b854bb2df54a8037","unixtime":1471415631,"updatetime":"2016-08-17 14:33:51"},{"content":"坐公交，一熟识的妹子上车， 我拍拍大腿，对她说：\u201c这有软座！谁知妹子叫道：\u201c算了吧，一会软座变硬座，硬座又变插座，到时候走都走不了！\u201d","hashId":"ce60dffe029a19dafd3a01bb9939c11a","unixtime":1471415631,"updatetime":"2016-08-17 14:33:51"},{"content":"今天领导开会，让我们每人说一个梦想，正当大家侃侃而谈时，角落里的一个妹子弱弱的说道：我的梦想就是希望自己的身份证号码能出现在银行卡余额里。","hashId":"4a9d49731e818cd7ef39016d6e4f4b9f","unixtime":1471415631,"updatetime":"2016-08-17 14:33:51"},{"content":"这几天运气不好，便戴了一条手链，室友看见了说：\u201c呦，十块钱买的吧！\u201d我：\u201c滚，我这是亲自爬泰山去请的！\u201d室友：\u201c多少钱请的？\u201d我：\u201c十块。。。\u201d","hashId":"30470a3b900204778441df2b22ab9416","unixtime":1471415631,"updatetime":"2016-08-17 14:33:51"},{"content":"女儿告诉我她妈妈电话找不到了，随后用我电话拨通了对话如下：女儿：妈妈电话找到了吗？妈妈：找到了，你爸爸回家了吗？我在一旁听到这里明白一个事，她们真是亲娘俩！","hashId":"bd5a215714b7687f19ae62b86f9aa7dd","unixtime":1471415631,"updatetime":"2016-08-17 14:33:51"},{"content":"女人是水，小女子是是平静的小溪，女强人是汹涌的大河，好女人是清彻的泉水，坏女人是浑浑的污水，缺了她会口渴，她多了不小心又会被淹死。","hashId":"a8fde66195f0b13fa011b04acd3c47f1","unixtime":1471415031,"updatetime":"2016-08-17 14:23:51"},{"content":"女人是一部车，看了亮眼，所以都想看看，摸了动心，所以都想摸摸，如果能够钻进去，开动起来，才是最爽的。","hashId":"6969b2c2a6a1abf55481adc6672e36ec","unixtime":1471415031,"updatetime":"2016-08-17 14:23:51"},{"content":"老师：小明，午睡时不要说话，好吗？小明：我怕做不到！老师：你就不能控制自己吗？小明：你说梦话的时候你能控制吗？老师：滚\u2026\u2026\u2026","hashId":"3b83a50315cc3c7a2b80848afa0080a6","unixtime":1471414431,"updatetime":"2016-08-17 14:13:51"},{"content":"儿子：爸爸，你小时候有撒谎过吗？爸爸：有啊\u2026\u2026儿子：那跟谁撒谎呢？爸爸：当然是你爷爷奶奶了！儿子：那又是为什么而撒谎呢？爸爸：逃课呀，打架闹事呀，没完成作业呀\u2026\u2026\u2026儿子：哦，恭喜恭喜，你终于后继有人了\u2026\u2026爸爸：臭小子，你\u2026\u2026\u2026","hashId":"50ba4d4d1476d0f1b23938ab13fb194f","unixtime":1471414431,"updatetime":"2016-08-17 14:13:51"},{"content":"一个男人对一个女人苦苦纠缠，一直纠缠了四五年，女人实在烦的不行。那天，男人又在街口堵住了女人说道：\u201c亲爱的，我爱死你了，你一定要嫁给我，这辈子我只想要娶你。\u201d女人看了看男人，叹了口气道：\u201c看到那面下棋的那个老男人了么，只要你给他暴揍一顿，我就答应嫁给你。\u201d男人欣喜若狂，冲上去给老男人一顿揍，然后乐呵呵的回来说道：\u201c亲爱的，我已经做到了，你嫁给我吧。\u201d女人笑了笑道：\u201c这辈子你想娶我是没希望了。\u201d男人一愣道：\u201c你咋出尔反尔，我已经听你的话打了那个老男人了啊。\u201d女人笑了笑道：\u201c那个老男人是我爸，这婚事现在我爸绝对不会同意的，你就彻底死了那条心吧！\u201d","hashId":"3d5a9b94631c6dbc400819cce43722ae","unixtime":1471414431,"updatetime":"2016-08-17 14:13:51"}]}
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
         * content : “不知道为什么，今天我家的狗老是亲我。”“我知道，狗改不了吃屎！”
         * hashId : 62055689a330fbb0b854bb2df54a8037
         * unixtime : 1471415631
         * updatetime : 2016-08-17 14:33:51
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
        }
    }
}
