package jyx.crm.domain;

import java.util.Date;

/*
CREATE TABLE `guest` (
  `guest_id` int(20) NOT NULL AUTO_INCREMENT,
  `guest_gender` char(1) DEFAULT NULL COMMENT '性别',
  `guest_name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `guest_phone` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `guest_email` varchar(255) DEFAULT NULL COMMENT '电子邮件',
  `guest_qq` varchar(255) DEFAULT NULL COMMENT 'QQ',
  `guest_time` date DEFAULT NULL COMMENT '拜访时间',
  `guest_lkm_id` int(20) DEFAULT NULL COMMENT '拜访联系人',
  PRIMARY KEY (`guest_id`),
  KEY `guest_lkm_id` (`guest_lkm_id`),
  CONSTRAINT `guest_ibfk_1` FOREIGN KEY (`guest_lkm_id`) REFERENCES `cst_linkman` (`lkm_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/

public class Guest {

	private Integer guest_id;
	private Character guest_gender;
	private String guest_name;
	private String guest_mobile;
	private String guest_email;
	private String guest_qq;
	private Date guest_time;

	// 表达多对一关系
	private LinkMan linkMan;

	public LinkMan getLinkMan() {
		return linkMan;
	}

	public void setLinkMan(LinkMan linkMan) {
		this.linkMan = linkMan;
	}

	// -------------------------------------------------------
	// 不予数据库中的列对应，只为了接收表单参数
	private Integer lkm_id;

	public Integer getLkm_id() {
		return lkm_id;
	}

	public void setLkm_id(Integer lkm_id) {
		this.lkm_id = lkm_id;
	}

	// -------------------------------------------------------

	public Integer getGuest_id() {
		return guest_id;
	}

	public void setGuest_id(Integer guest_id) {
		this.guest_id = guest_id;
	}
	
	public Character getGuest_gender() {
		return guest_gender;
	}

	public void setGuest_gender(Character guest_gender) {
		this.guest_gender = guest_gender;
	}

	public String getGuest_name() {
		return guest_name;
	}

	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}

	public String getGuest_mobile() {
		return guest_mobile;
	}

	public void setGuest_mobile(String guest_mobile) {
		this.guest_mobile = guest_mobile;
	}

	public String getGuest_email() {
		return guest_email;
	}

	public void setGuest_email(String guest_email) {
		this.guest_email = guest_email;
	}

	public String getGuest_qq() {
		return guest_qq;
	}

	public void setGuest_qq(String guest_qq) {
		this.guest_qq = guest_qq;
	}

	public Date getGuest_time() {
		return guest_time;
	}

	public void setGuest_time(Date guest_time) {
		this.guest_time = guest_time;
	}

	@Override
	public String toString() {
		return "Guest [guest_id=" + guest_id + ", guest_gender=" + guest_gender + ", guest_name=" + guest_name
				+ ", guest_mobile=" + guest_mobile + ", guest_email=" + guest_email + ", guest_qq=" + guest_qq
				+ ", guest_time=" + guest_time + ", linkMan=" + linkMan + ", lkm_id=" + lkm_id + "]";
	}

}
