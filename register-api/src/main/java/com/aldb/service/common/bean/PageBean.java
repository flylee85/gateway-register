/*
 * Copyright 2015-2016 RonCoo(http://www.roncoo.com) Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aldb.service.common.bean;

import java.io.Serializable;
import java.util.List;

/**
 * ����ҳ���ҳ���
 * 
 * @author wujing
 * @param <T>
 */
public class PageBean<T> implements Serializable {

	private static final long serialVersionUID = 6975089268517363694L;

	// ��ǰ��¼
	private int iDisplayStart;

	// ÿҳ��¼��
	private int iDisplayLength;

	// �ܼ�¼��
	private int iTotalRecords;

	// ���˺��¼
	private int iTotalDisplayRecords;

	// ��¼
	private List<T> data;

	public PageBean() {
	}
	
	/**
	 * @param iDisplayStart
	 * @param iDisplayLength
	 * @param iTotalRecords
	 * @param iTotalDisplayRecords
	 * @param data
	 * @param pageBean
	 * @param page
	 */
	public PageBean(Page<T> page) {
		this.iDisplayStart = page.getPageCurrent();
		this.iDisplayLength = page.getPageSize();
		this.iTotalRecords = page.getTotalCount();
		this.iTotalDisplayRecords = page.getTotalCount();
		this.data = page.getList();
	}

	public int getiDisplayStart() {
		return iDisplayStart;
	}

	public void setiDisplayStart(int iDisplayStart) {
		this.iDisplayStart = iDisplayStart;
	}

	public int getiDisplayLength() {
		return iDisplayLength;
	}

	public void setiDisplayLength(int iDisplayLength) {
		this.iDisplayLength = iDisplayLength;
	}

	public int getiTotalRecords() {
		return iTotalRecords;
	}

	public void setiTotalRecords(int iTotalRecords) {
		this.iTotalRecords = iTotalRecords;
	}

	public int getiTotalDisplayRecords() {
		return iTotalDisplayRecords;
	}

	public void setiTotalDisplayRecords(int iTotalDisplayRecords) {
		this.iTotalDisplayRecords = iTotalDisplayRecords;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

}
