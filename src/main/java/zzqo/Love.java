package zzqo;

import org.junit.jupiter.api.Test;
/**
 * @author ZZQ
 * @date 2018/7/5 下午 1:00
 */
public class Love {
    @Test
    public void test() {
        Boy boy = new Boy();
        Girl girl = new Girl();
        Love love = new Love();
        love.love(boy, girl);
    }
    private Boy love(Boy boy, Girl girl) {
        if (boy.没房() && boy.没车()) {
            boy.还(一无所有);
            return girl.嫁给(另一个boy);
        }
        if (girl.愿意等()) {
            while (!(boy.赚钱() > 10000 && girl.感情() > 8)) {
                for (day = 1; day <= 365; day++) {
                    if (day == 情人节) {
                        if (boy.给女孩(玫瑰))
                            girl.感情++;
                        else
                            girl.感情--;
                        boy.拼命赚钱();
                    }
                }
            }
        }
        if (boy.有房() && boy.有车())
            return girl.嫁给(boy);
        girl.年龄++;
        girl.感情--;
        return girl.嫁给(另一个boy);
    }

    class Boy {

        public boolean 有房() {
            return false;
        }

        public boolean 有车() {
            return false;
        }

        public boolean 没房() {
            return true;
        }

        public boolean 没车() {
            return true;
        }

        public int 赚钱() {
            return 0;
        }

        public int 拼命赚钱() {
            return 0;
        }

        public boolean 给女孩(boolean 玫瑰) {
            return 玫瑰;
        }

        public void 还(boolean 一无所有) {

        }
    }

    class Girl {
        public int 感情;
        public int 年龄;

        public Boy 嫁给(Boy boy) {
            return boy;
        }

        public boolean 愿意等() {
            return true;
        }

        public int 感情() {
            return 0;
        }
    }

    private int 情人节;
    private int day;
    private boolean 玫瑰;
    private boolean 一无所有;
    private static Boy 另一个boy = new Love().new Boy();
}
