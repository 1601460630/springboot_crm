package jyx.crm.domain;

/**
 * һ�������ʵ���࣬����SumAction����������list���ϲ�֮�����List<Sum>
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
