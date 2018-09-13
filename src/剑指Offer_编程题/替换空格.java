package 剑指Offer_编程题;

/**
 * @program: nowcoder
 * @description: https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 * @author: Majpyi
 * @create: 2018-07-25 13:31
 *
 * 在 java 中一定要注意" "与' '
 *
 **/
public class 替换空格 {
    public String replaceSpace(StringBuffer str) {
        char[] ch = str.toString().toCharArray();
        StringBuffer re = new StringBuffer();
        for (char x : ch){
            if(x==' '){
                re.append("%20");
            }
            else{
                re.append(x);
            }

        }
//        System.out.println(ch);
        return re.toString();
    }

    public String replaceSpace1(StringBuffer str){
        return str.toString().replaceAll("\\s","%20");
    }

    public static void main(String[] args) {
        替换空格 a = new 替换空格();
        System.out.println( a.replaceSpace1(new StringBuffer("nih hk") ) );
    }
}
