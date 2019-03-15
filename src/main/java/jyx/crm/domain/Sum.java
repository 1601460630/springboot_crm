package jyx.crm.domain;

/**
 * 一个特殊的实体类，用于SumAction，接收两个list，合并之后就是List<Sum>
 */
public class Sum {
    private String cust_industry;
    private int num;

    public String getCust_industry() {
        return cust_industry;
    }

    public void setCust_industry(String cust_industry) {
        this.cust_industry = cust_industry;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Sum{" +
                "cust_industry='" + cust_industry + '\'' +
                ", num=" + num +
                '}';
    }
}
