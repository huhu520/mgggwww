package com.zsj.list_demo;

import java.util.HashMap;
import java.util.Map;

import android.app.Application;

/**
 * �Զ���ȫ��Applcation��
 * @ClassName: CustomApplcation
 * @Description: TODO
 * @author smile
 * @date 2014-5-19 ����3:25:00
 */
public class CustomApplcation extends Application {

	public static CustomApplcation mInstance;


	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		// �Ƿ���debugģʽ--Ĭ�Ͽ���״̬
		mInstance = this;
	}

	public static CustomApplcation getInstance() {
		return mInstance;
	}

	private Map<String, User> contactList = new HashMap<String, User>();

	/**
	 * ��ȡ�ڴ��к���user list
	 * 
	 * @return
	 */
	public Map<String, User> getContactList() {
		return contactList;
	}

	/**
	 * ���ú���user list���ڴ���
	 * @param contactList
	 */
	public void setContactList(Map<String, User> contactList) {
		if (this.contactList != null) {
			this.contactList.clear();
		}
		this.contactList = contactList;
	}


}
