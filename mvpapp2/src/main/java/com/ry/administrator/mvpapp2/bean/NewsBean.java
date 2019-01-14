package com.ry.administrator.mvpapp2.bean;

import java.util.List;

public class NewsBean {


    /**
     * date : 20181121
     * stories : [{"images":["https://pic4.zhimg.com/v2-0c981a278ee96136eb1de0588251a91f.jpg"],"type":0,"id":9702062,"ga_prefix":"112123","title":"快 12 点了，可我睡不着"},{"images":["https://pic1.zhimg.com/v2-0cf069e7cbce538eaafdfbdc7672d544.jpg"],"type":0,"id":9702031,"ga_prefix":"112122","title":"小事 · 有人含着金钥匙，有人就是端着尿盆出来的"},{"images":["https://pic3.zhimg.com/v2-48b8cb8cc23683f90c585a96291e85f2.jpg"],"type":0,"id":9701990,"ga_prefix":"112121","title":"《疯狂的石头》之后，很久没看过这么正点的黑色喜剧了"},{"title":"广州、重庆和上海，比一比你们的夜宵活力","ga_prefix":"112119","images":["https://pic2.zhimg.com/v2-f9fd45205888ddbbe39b1235523da901.jpg"],"multipic":true,"type":0,"id":9701948},{"title":"我体验了 7 天新 MacBook Air","ga_prefix":"112116","images":["https://pic1.zhimg.com/v2-943954661f2b60e54efebc5dfa30951c.jpg"],"multipic":true,"type":0,"id":9702015},{"images":["https://pic2.zhimg.com/v2-18e4c33a0ecc25f17545933ca1cd53cd.jpg"],"type":0,"id":9702039,"ga_prefix":"112115","title":"8 岁白血病患儿被放弃治疗，爸爸担心的「人财两空」其实不一定会发生"},{"title":"抬头看，那个亮亮的、可能史上最贵的人造物体，20 岁了","ga_prefix":"112114","images":["https://pic3.zhimg.com/v2-cf5585a0936aca30bf032524b61f4efa.jpg"],"multipic":true,"type":0,"id":9702000},{"images":["https://pic3.zhimg.com/v2-0aa7568fea045efd55ff382b580d3af6.jpg"],"type":0,"id":9701984,"ga_prefix":"112112","title":"大误 · 我承诺，绝不首先使用裸照"},{"images":["https://pic3.zhimg.com/v2-623c07a6a7c5d23697c01c37c28c1476.jpg"],"type":0,"id":9701830,"ga_prefix":"112110","title":"为什么蟑螂碰到洗发水会当场死亡？"},{"images":["https://pic1.zhimg.com/v2-a6b61b358a201a1b85a0dab8ecee006c.jpg"],"type":0,"id":9701985,"ga_prefix":"112109","title":"京东没有奇迹"},{"images":["https://pic1.zhimg.com/v2-04cd74f5a36180a2c7fe7e8773e572a0.jpg"],"type":0,"id":9701983,"ga_prefix":"112108","title":"美国五角大楼初次接受审计就不合格，哼，合格了才有鬼"},{"images":["https://pic4.zhimg.com/v2-5994229d63e23a05598e7ba9bec6c363.jpg"],"type":0,"id":9701995,"ga_prefix":"112107","title":"爱了，付出了，被伤害了，所以，南方航空退出天合联盟了"},{"images":["https://pic1.zhimg.com/v2-1cefa9a9a098f3d5c403c51899a35198.jpg"],"type":0,"id":9701958,"ga_prefix":"112107","title":"为了在 1945 年这一天与你决斗，我愿意拿命去换"},{"images":["https://pic4.zhimg.com/v2-898d041b9939194b9db5635778e335c3.jpg"],"type":0,"id":9702007,"ga_prefix":"112106","title":"瞎扯 · 如何正确地吐槽"}]
     */

    private String date;
    private List<StoriesBean> stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-0c981a278ee96136eb1de0588251a91f.jpg"]
         * type : 0
         * id : 9702062
         * ga_prefix : 112123
         * title : 快 12 点了，可我睡不着
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
